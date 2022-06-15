package eu.tuto.movieapp.presentation.tvShow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import eu.tuto.movieapp.domain.usecase.tvShow.GetTvShowUsecase
import eu.tuto.movieapp.domain.usecase.tvShow.UpdateTvShowUsecase

class TvShowViewModelFactory(
    private val getTvShowUsecase: GetTvShowUsecase,
    private val updateTvShowUsecase: UpdateTvShowUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(
            getTvShowUsecase,
            updateTvShowUsecase
        ) as T
    }
}