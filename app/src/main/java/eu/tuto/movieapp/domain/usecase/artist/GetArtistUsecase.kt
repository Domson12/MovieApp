package eu.tuto.movieapp.domain.usecase.artist

import eu.tuto.movieapp.data.model.artist.Artist
import eu.tuto.movieapp.domain.repository.ArtistRepository

class GetArtistUsecase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.getArtist()

}