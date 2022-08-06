package eu.tuto.movieapp.data.db

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import eu.tuto.movieapp.data.model.movie.Movie
import eu.tuto.movieapp.data.model.tvShow.TvShow
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TvShowDaoTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var dao: TvShowDao
    private lateinit var database: TMDBDatabase


    @Before
    fun setUp() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            TMDBDatabase::class.java
        ).build()
        dao = database.tvDao()
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun saveTvShowTest() = runBlocking {

        val tvShow = listOf(
            TvShow("", 1, "posterPath1", "date1", "title1"),
            TvShow("", 2, "posterPath1", "date1", "title1"),
            TvShow("", 3, "posterPath1", "date1", "title1")
        )
        dao.saveTvShow(tvShow)

        val allTvShow = dao.getTvShow()
        Truth.assertThat(allTvShow).isEqualTo(tvShow)
    }

    @Test
    fun deleteTvShowTest() = runBlocking {
        val tvShow = listOf(
            TvShow("", 1, "posterPath1", "date1", "title1"),
            TvShow("", 2, "posterPath1", "date1", "title1"),
            TvShow("", 3, "posterPath1", "date1", "title1")
        )
        dao.saveTvShow(tvShow)
        dao.deleteAllTvShows()
        val tvShowResult = dao.getTvShow()
        Truth.assertThat(tvShowResult).isEmpty()
    }
}