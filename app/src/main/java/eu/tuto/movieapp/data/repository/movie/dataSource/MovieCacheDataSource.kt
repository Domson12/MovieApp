package eu.tuto.movieapp.data.repository.movie.dataSource

import eu.tuto.movieapp.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}