package eu.tuto.movieapp.presentation.di.core

import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.data.repository.artist.dataSource.ArtistCacheDataSource
import eu.tuto.movieapp.data.repository.artist.dataSourceImpl.ArtistCacheDataSourceImpl
import eu.tuto.movieapp.data.repository.movie.dataSource.MovieCacheDataSource
import eu.tuto.movieapp.data.repository.movie.dataSourceImpl.MovieCacheDataSourceImpl
import eu.tuto.movieapp.data.repository.tvShow.dataSource.TvShowCacheDataSource
import eu.tuto.movieapp.data.repository.tvShow.dataSourceImpl.TvShowCacheDataSourceImpl
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}