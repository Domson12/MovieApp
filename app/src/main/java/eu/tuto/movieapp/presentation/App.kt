package eu.tuto.movieapp.presentation

import android.app.Application
import eu.tuto.movieapp.BuildConfig
import eu.tuto.movieapp.presentation.di.Injector
import eu.tuto.movieapp.presentation.di.artist.ArtistSubComponent
import eu.tuto.movieapp.presentation.di.core.*
import eu.tuto.movieapp.presentation.di.movie.MovieSubComponent
import eu.tuto.movieapp.presentation.di.tvShow.TvShowSubComponent
import javax.inject.Inject

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMoviesSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }

}