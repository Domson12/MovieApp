package eu.tuto.movieapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.tuto.movieapp.R
import eu.tuto.movieapp.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import eu.tuto.movieapp.presentation.artist.ArtistActivity
import eu.tuto.movieapp.presentation.movie.MovieActivity
import eu.tuto.movieapp.presentation.tvShow.TvShowActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            movieButton.setOnClickListener {
                val intent = Intent(this@HomeActivity, MovieActivity::class.java)
                startActivity(intent)
            }
            tvButton.setOnClickListener {
                val intent = Intent(this@HomeActivity, TvShowActivity::class.java)
                startActivity(intent)
            }
            artistsButton.setOnClickListener {
                val intent = Intent(this@HomeActivity, ArtistActivity::class.java)
                startActivity(intent)
            }
        }
    }
}