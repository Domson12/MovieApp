package eu.tuto.movieapp.domain.repository

import eu.tuto.movieapp.data.model.tvShow.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}