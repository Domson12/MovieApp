package eu.tuto.movieapp.presentation.di.core

import dagger.Component
import dagger.Provides
import eu.tuto.movieapp.presentation.di.artist.ArtistSubComponent
import eu.tuto.movieapp.presentation.di.movie.MovieSubComponent
import eu.tuto.movieapp.presentation.di.tvShow.TvShowSubComponent
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DataBaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {


    fun movieSubComponent(): MovieSubComponent.Factory
    fun tvShowSubComponent(): TvShowSubComponent.Factory
    fun artistSubComponent(): ArtistSubComponent.Factory
}