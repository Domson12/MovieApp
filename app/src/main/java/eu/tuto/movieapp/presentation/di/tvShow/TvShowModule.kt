package eu.tuto.movieapp.presentation.di.tvShow

import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.domain.usecase.artist.GetArtistUsecase
import eu.tuto.movieapp.domain.usecase.artist.UpdateArtistUsecase
import eu.tuto.movieapp.domain.usecase.tvShow.GetTvShowUsecase
import eu.tuto.movieapp.domain.usecase.tvShow.UpdateTvShowUsecase
import eu.tuto.movieapp.presentation.artist.ArtistViewModelFactory
import eu.tuto.movieapp.presentation.tvShow.TvShowViewModelFactory

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideArtistViewModelFactory(
        getTvShowUsecase: GetTvShowUsecase,
        updateTvShowUsecase: UpdateTvShowUsecase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowUsecase,
            updateTvShowUsecase
        )
    }
}