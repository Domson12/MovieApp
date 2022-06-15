package eu.tuto.movieapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import eu.tuto.movieapp.domain.usecase.movie.GetMoviesUsecase
import eu.tuto.movieapp.domain.usecase.movie.UpdateMovieUsecase

class MovieViewModel(
    private val getMoviesUsecase: GetMoviesUsecase,
    private val updateMovieUsecase: UpdateMovieUsecase
) : ViewModel() {
    fun getMovies() = liveData {
        val movieList = getMoviesUsecase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMovieUsecase.execute()
        emit(movieList)
    }
}