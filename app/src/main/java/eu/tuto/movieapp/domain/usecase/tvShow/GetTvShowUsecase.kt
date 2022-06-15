package eu.tuto.movieapp.domain.usecase.tvShow

import eu.tuto.movieapp.data.model.tvShow.TvShow
import eu.tuto.movieapp.domain.repository.TvShowRepository

class GetTvShowUsecase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}