package eu.tuto.movieapp.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import eu.tuto.movieapp.R
import eu.tuto.movieapp.databinding.ActivityMainBinding
import eu.tuto.movieapp.databinding.ActivityMovieBinding
import eu.tuto.movieapp.presentation.di.Injector
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: MovieViewModelFactory
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var binding: ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)
        (application as Injector).createMoviesSubComponent()
            .inject(this)

        movieViewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
        val responseLiveData = movieViewModel.getMovies()
        responseLiveData.observe(this) {
            Log.i("MYTAG", it.toString())
        }
    }
}