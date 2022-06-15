package eu.tuto.movieapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import eu.tuto.movieapp.domain.usecase.artist.GetArtistUsecase
import eu.tuto.movieapp.domain.usecase.artist.UpdateArtistUsecase

class ArtistViewModel(
    private val getArtistUsecase: GetArtistUsecase,
    private val updateArtistUsecase: UpdateArtistUsecase
) : ViewModel() {
    fun getArtists() = liveData {
        val artistList = getArtistUsecase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistUsecase.execute()
        emit(artistList)
    }
}