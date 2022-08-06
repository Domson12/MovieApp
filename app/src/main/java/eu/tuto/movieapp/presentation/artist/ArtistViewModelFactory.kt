package eu.tuto.movieapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import eu.tuto.movieapp.domain.usecase.artist.GetArtistUsecase
import eu.tuto.movieapp.domain.usecase.artist.UpdateArtistUsecase

class ArtistViewModelFactory(
    private val getArtistUsecase: GetArtistUsecase,
    private val updateArtistUsecase: UpdateArtistUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ArtistViewModel(
            getArtistUsecase,
            updateArtistUsecase
        ) as T
    }
}