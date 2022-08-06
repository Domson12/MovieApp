package eu.tuto.movieapp.presentation.di.core

import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.data.api.TMDBService
import eu.tuto.movieapp.data.repository.artist.dataSource.ArtistRemoteDataSource
import eu.tuto.movieapp.data.repository.artist.dataSourceImpl.ArtistRemoteDataSourceImpl
import eu.tuto.movieapp.data.repository.movie.dataSource.MovieRemoteDataSource
import eu.tuto.movieapp.data.repository.movie.dataSourceImpl.MovieRemoteDataSourceImpl
import eu.tuto.movieapp.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import eu.tuto.movieapp.data.repository.tvShow.dataSourceImpl.TvShowRemoteDataSourceImpl
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, apiKey)
    }
}