package eu.tuto.movieapp.data.repository.artist.dataSourceImpl

import eu.tuto.movieapp.data.api.TMDBService
import eu.tuto.movieapp.data.model.artist.ArtistList
import eu.tuto.movieapp.data.repository.artist.dataSource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val api_key: String
) : ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> = tmdbService.getPopularArtist(api_key)
}