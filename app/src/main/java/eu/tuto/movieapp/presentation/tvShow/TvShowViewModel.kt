package eu.tuto.movieapp.presentation.tvShow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import eu.tuto.movieapp.domain.usecase.tvShow.GetTvShowUsecase
import eu.tuto.movieapp.domain.usecase.tvShow.UpdateTvShowUsecase

class TvShowViewModel(
    private val getTvShowUsecase: GetTvShowUsecase,
    private val updateTvShowUsecase: UpdateTvShowUsecase
) : ViewModel() {
    fun getTvShows() = liveData {
        val tvShowList = getTvShowUsecase.execute()
        emit(tvShowList)
    }

    fun updateTvShows() = liveData {
        val tvShowList = updateTvShowUsecase.execute()
        emit(tvShowList)
    }
}