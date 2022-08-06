package eu.tuto.movieapp.presentation.di.core

import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.data.db.ArtistDao
import eu.tuto.movieapp.data.db.MovieDao
import eu.tuto.movieapp.data.db.TvShowDao
import eu.tuto.movieapp.data.repository.artist.dataSource.ArtistLocalDataSource
import eu.tuto.movieapp.data.repository.artist.dataSourceImpl.ArtistLocalDataSourceImpl
import eu.tuto.movieapp.data.repository.movie.dataSource.MovieLocalDataSource
import eu.tuto.movieapp.data.repository.movie.dataSourceImpl.MovieLocalDataSourceImpl
import eu.tuto.movieapp.data.repository.tvShow.dataSource.TvShowLocalDataSource
import eu.tuto.movieapp.data.repository.tvShow.dataSourceImpl.TvShowLocalDataSourceImpl
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }
}