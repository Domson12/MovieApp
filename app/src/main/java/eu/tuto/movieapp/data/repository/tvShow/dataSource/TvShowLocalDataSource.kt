package eu.tuto.movieapp.data.repository.tvShow.dataSource

import eu.tuto.movieapp.data.model.tvShow.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB(): List<TvShow>
    suspend fun saveTvShowsToDB(tvShow: List<TvShow>)
    suspend fun clearAll()
}