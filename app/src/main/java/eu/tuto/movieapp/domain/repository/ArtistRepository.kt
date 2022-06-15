package eu.tuto.movieapp.domain.repository

import eu.tuto.movieapp.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtist(): List<Artist>?
    suspend fun updateArtist(): List<Artist>?
}