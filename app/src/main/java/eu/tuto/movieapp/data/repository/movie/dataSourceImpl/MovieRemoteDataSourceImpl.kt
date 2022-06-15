package eu.tuto.movieapp.data.repository.movie.dataSourceImpl

import eu.tuto.movieapp.data.api.TMDBService
import eu.tuto.movieapp.data.model.movie.MovieList
import eu.tuto.movieapp.data.repository.movie.dataSource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val api_key: String
) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(api_key)

}