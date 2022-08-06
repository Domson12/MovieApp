package eu.tuto.movieapp.presentation.di.core

import android.content.Context
import dagger.Module
import dagger.Provides
import eu.tuto.movieapp.presentation.di.artist.ArtistSubComponent
import eu.tuto.movieapp.presentation.di.movie.MovieSubComponent
import eu.tuto.movieapp.presentation.di.tvShow.TvShowSubComponent

@Module(
    subcomponents = [
        MovieSubComponent::class,
        TvShowSubComponent::class,
        ArtistSubComponent::class
    ]
)
class AppModule(private val context: Context) {

    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }

}