package eu.tuto.movieapp.data.repository.tvShow.dataSource

import eu.tuto.movieapp.data.model.tvShow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(tvShows: List<TvShow>)
}