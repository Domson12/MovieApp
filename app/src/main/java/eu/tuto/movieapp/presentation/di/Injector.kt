package eu.tuto.movieapp.presentation.di

import eu.tuto.movieapp.presentation.di.artist.ArtistSubComponent
import eu.tuto.movieapp.presentation.di.movie.MovieSubComponent
import eu.tuto.movieapp.presentation.di.tvShow.TvShowSubComponent

interface Injector {
    fun createMoviesSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}