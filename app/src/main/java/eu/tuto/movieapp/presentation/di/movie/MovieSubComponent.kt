package eu.tuto.movieapp.presentation.di.movie

import dagger.Subcomponent
import eu.tuto.movieapp.presentation.movie.MovieActivity


@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): MovieSubComponent
    }
}