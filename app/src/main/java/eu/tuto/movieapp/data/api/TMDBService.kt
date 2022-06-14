package eu.tuto.movieapp.data.api

import eu.tuto.movieapp.data.model.artist.ArtistList
import eu.tuto.movieapp.data.model.movie.MovieList
import eu.tuto.movieapp.data.model.tvShow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apikey: String
    ): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(
        @Query(
            "api_key"
        ) apikey: String
    ): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(
        @Query(
            "api_key"
        ) apikey: String
    ): Response<ArtistList>
}