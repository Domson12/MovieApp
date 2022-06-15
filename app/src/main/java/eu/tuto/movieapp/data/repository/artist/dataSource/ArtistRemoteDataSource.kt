package eu.tuto.movieapp.data.repository.artist.dataSource


import eu.tuto.movieapp.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}