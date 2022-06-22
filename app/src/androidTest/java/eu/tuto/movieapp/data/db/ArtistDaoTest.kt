package eu.tuto.movieapp.data.db

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import eu.tuto.movieapp.data.model.artist.Artist
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ArtistDaoTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var dao: ArtistDao
    private lateinit var database: TMDBDatabase

    @Before
    fun setUp() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            TMDBDatabase::class.java
        ).build()
        dao = database.artistDao()
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun saveArtistTest() = runBlocking {
        val artist = listOf(
            Artist(1, "name1", 1.1, "path1", "dep1"),
            Artist(2, "name2", 1.2, "path2", "dep2"),
            Artist(3, "name3", 1.3, "path3", "dep3")
        )
        dao.saveArtist(artist)

        val allArtists = dao.getArtist()
        Truth.assertThat(allArtists).isEqualTo(artist)
    }

    @Test
    fun deleteArtistTest() = runBlocking {
        val artist = listOf(
            Artist(1, "name1", 1.1, "path1", "dep1"),
            Artist(2, "name2", 1.2, "path2", "dep2"),
            Artist(3, "name3", 1.3, "path3", "dep3")
        )
        dao.saveArtist(artist)
        dao.deleteAllArtists()
        val allArtists = dao.getArtist()
        Truth.assertThat(allArtists).isEmpty()
    }
}