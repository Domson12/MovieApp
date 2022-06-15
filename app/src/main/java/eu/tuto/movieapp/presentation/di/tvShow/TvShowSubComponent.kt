package eu.tuto.movieapp.presentation.di.tvShow

import dagger.Subcomponent
import eu.tuto.movieapp.presentation.artist.ArtistActivity
import eu.tuto.movieapp.presentation.di.movie.MovieModule
import eu.tuto.movieapp.presentation.di.movie.MovieScope
import eu.tuto.movieapp.presentation.tvShow.TvShowActivity

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): TvShowSubComponent
    }
}