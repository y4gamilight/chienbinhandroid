package samples

class SongCatalog(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int) {
    var isPopular: Boolean = false
        get() {
            return this.playCount > 1000
        }

    fun printSongDescription() {
        println("[$title], performed by [$artist], was released in [$yearPublished].")
    }
}