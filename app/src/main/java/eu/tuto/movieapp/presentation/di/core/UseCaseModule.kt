package eu.tuto.movieapp.presentation.di.core

import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.domain.repository.ArtistRepository

import eu.tuto.movieapp.domain.repository.MovieRepository
import eu.tuto.movieapp.domain.repository.TvShowRepository
import eu.tuto.movieapp.domain.usecase.artist.GetArtistUsecase
import eu.tuto.movieapp.domain.usecase.artist.UpdateArtistUsecase
import eu.tuto.movieapp.domain.usecase.movie.GetMoviesUsecase
import eu.tuto.movieapp.domain.usecase.movie.UpdateMovieUsecase
import eu.tuto.movieapp.domain.usecase.tvShow.GetTvShowUsecase
import eu.tuto.movieapp.domain.usecase.tvShow.UpdateTvShowUsecase

@Module
class UseCaseModule {
    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUsecase {
        return GetMoviesUsecase(movieRepository)
    }

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMovieUsecase {
        return UpdateMovieUsecase(movieRepository)
    }

    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository): GetArtistUsecase {
        return GetArtistUsecase(artistRepository)
    }

    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistUsecase {
        return UpdateArtistUsecase(artistRepository)
    }

    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowUsecase {
        return GetTvShowUsecase(tvShowRepository)
    }

    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowUsecase {
        return UpdateTvShowUsecase(tvShowRepository)
    }
}