package eu.tuto.movieapp.data.db


import androidx.room.Database
import androidx.room.RoomDatabase
import eu.tuto.movieapp.data.model.artist.Artist
import eu.tuto.movieapp.data.model.movie.Movie
import eu.tuto.movieapp.data.model.tvShow.TvShow

@Database(
    entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}