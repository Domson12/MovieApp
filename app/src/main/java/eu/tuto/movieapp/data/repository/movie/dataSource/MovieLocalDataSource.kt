package eu.tuto.movieapp.data.repository.movie.dataSource

import eu.tuto.movieapp.data.model.movie.Movie
import eu.tuto.movieapp.data.model.movie.MovieList

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}