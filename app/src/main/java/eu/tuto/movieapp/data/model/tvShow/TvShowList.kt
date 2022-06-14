package eu.tuto.movieapp.data.model.tvShow


import com.google.gson.annotations.SerializedName
import eu.tuto.movieapp.data.model.tvShow.TvShow

data class TvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow>
)