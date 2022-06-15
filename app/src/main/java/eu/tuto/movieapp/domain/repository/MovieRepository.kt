package eu.tuto.movieapp.domain.repository

import eu.tuto.movieapp.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}