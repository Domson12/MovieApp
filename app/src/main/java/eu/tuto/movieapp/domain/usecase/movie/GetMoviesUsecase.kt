package eu.tuto.movieapp.domain.usecase.movie

import eu.tuto.movieapp.data.model.movie.Movie
import eu.tuto.movieapp.domain.repository.MovieRepository

class GetMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}