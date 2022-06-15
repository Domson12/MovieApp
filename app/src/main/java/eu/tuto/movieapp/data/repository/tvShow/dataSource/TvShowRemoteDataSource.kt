package eu.tuto.movieapp.data.repository.tvShow.dataSource

import eu.tuto.movieapp.data.model.tvShow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TvShowList>
}