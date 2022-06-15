package eu.tuto.movieapp.presentation.di.movie

import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.domain.usecase.artist.GetArtistUsecase
import eu.tuto.movieapp.domain.usecase.artist.UpdateArtistUsecase
import eu.tuto.movieapp.domain.usecase.movie.GetMoviesUsecase
import eu.tuto.movieapp.domain.usecase.movie.UpdateMovieUsecase
import eu.tuto.movieapp.presentation.artist.ArtistViewModelFactory
import eu.tuto.movieapp.presentation.movie.MovieViewModelFactory

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideArtistViewModelFactory(
        getMovieUsecase: GetMoviesUsecase,
        updateMovieUsecase: UpdateMovieUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMovieUsecase,
            updateMovieUsecase
        )
    }
}