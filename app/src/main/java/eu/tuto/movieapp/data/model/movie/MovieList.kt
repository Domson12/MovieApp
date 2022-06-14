package eu.tuto.movieapp.data.model.movie
import com.google.gson.annotations.SerializedName
import eu.tuto.movieapp.data.model.movie.Movie

data class MovieList(
    @SerializedName("results")
    val results: List<Movie>
)