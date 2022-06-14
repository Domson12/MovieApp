package eu.tuto.movieapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import eu.tuto.movieapp.data.model.tvShow.TvShow

@Dao
interface TvShowDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShow(tvShow: List<TvShow>)

    @Query("DELETE FROM popular_movies")
    suspend fun deleteAllTvShows()

    @Query("SELECT * FROM popular_movies")
    suspend fun getTvShow(tvShow: List<TvShow>)
}