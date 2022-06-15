package eu.tuto.movieapp.data.repository.artist.dataSource


import eu.tuto.movieapp.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistFromDB(): List<Artist>
    suspend fun saveArtistsToDB(artists: List<Artist>)
    suspend fun clearAll()
}