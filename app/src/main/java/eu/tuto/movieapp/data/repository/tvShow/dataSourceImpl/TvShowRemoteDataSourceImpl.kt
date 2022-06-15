package eu.tuto.movieapp.data.repository.tvShow.dataSourceImpl

import eu.tuto.movieapp.data.api.TMDBService
import eu.tuto.movieapp.data.model.tvShow.TvShowList
import eu.tuto.movieapp.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val api_key: String
) : TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows(api_key)
}