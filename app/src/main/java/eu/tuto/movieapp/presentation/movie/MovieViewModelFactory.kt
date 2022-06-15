package eu.tuto.movieapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import eu.tuto.movieapp.domain.usecase.movie.GetMoviesUsecase
import eu.tuto.movieapp.domain.usecase.movie.UpdateMovieUsecase

class MovieViewModelFactory(
    private val getMoviesUsecase: GetMoviesUsecase,
    private val updateMovieUsecase: UpdateMovieUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(
            getMoviesUsecase,
            updateMovieUsecase
        ) as T
    }
}