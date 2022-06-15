package eu.tuto.movieapp.presentation.di.core

import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.data.repository.artist.ArtistRepositoryImpl
import eu.tuto.movieapp.data.repository.artist.dataSource.ArtistCacheDataSource
import eu.tuto.movieapp.data.repository.artist.dataSource.ArtistLocalDataSource
import eu.tuto.movieapp.data.repository.artist.dataSource.ArtistRemoteDataSource
import eu.tuto.movieapp.data.repository.movie.MovieRepositoryImpl
import eu.tuto.movieapp.data.repository.movie.dataSource.MovieCacheDataSource
import eu.tuto.movieapp.data.repository.movie.dataSource.MovieLocalDataSource
import eu.tuto.movieapp.data.repository.movie.dataSource.MovieRemoteDataSource
import eu.tuto.movieapp.data.repository.tvShow.TvShowRepositoryImpl
import eu.tuto.movieapp.data.repository.tvShow.dataSource.TvShowCacheDataSource
import eu.tuto.movieapp.data.repository.tvShow.dataSource.TvShowLocalDataSource
import eu.tuto.movieapp.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import eu.tuto.movieapp.domain.repository.ArtistRepository
import eu.tuto.movieapp.domain.repository.MovieRepository
import eu.tuto.movieapp.domain.repository.TvShowRepository
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(
            artistRemoteDataSource,
            artistLocalDataSource,
            artistCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(
            tvShowRemoteDataSource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )
    }
}