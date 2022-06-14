package eu.tuto.movieapp.data.model.artist


import com.google.gson.annotations.SerializedName
import eu.tuto.movieapp.data.model.artist.Artist

data class ArtistList(
    @SerializedName("results")
    val artists: List<Artist>
)