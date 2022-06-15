package eu.tuto.movieapp.data.repository.artist.dataSource

import eu.tuto.movieapp.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artists: List<Artist>)
}