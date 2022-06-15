package eu.tuto.movieapp.data.repository.movie.dataSource

import eu.tuto.movieapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}