package eu.tuto.movieapp.data.repository.tvShow.dataSourceImpl

import eu.tuto.movieapp.data.model.tvShow.TvShow
import eu.tuto.movieapp.data.model.tvShow.TvShowList
import eu.tuto.movieapp.data.repository.tvShow.dataSource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl: TvShowCacheDataSource {
    private var tvShowList = ArrayList<TvShow>()
    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShows)
    }
}