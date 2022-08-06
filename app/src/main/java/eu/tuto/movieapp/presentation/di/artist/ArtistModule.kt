package eu.tuto.movieapp.presentation.di.artist

import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.domain.usecase.artist.GetArtistUsecase
import eu.tuto.movieapp.domain.usecase.artist.UpdateArtistUsecase
import eu.tuto.movieapp.presentation.artist.ArtistViewModelFactory

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistUsecase: GetArtistUsecase,
        updateArtistUsecase: UpdateArtistUsecase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistUsecase,
            updateArtistUsecase
        )
    }
}