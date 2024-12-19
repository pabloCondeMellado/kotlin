package exercies

fun main(){
    val brunoSong = song("We Don´t Talk About Bruno", "Encanto Castt",2022, 1_000_000)
    brunoSong.printDescripcion()
    println(brunoSong.isPopular)
}
class song(
    val title:String,
    val artist:String,
    val yearPublished:Int,
    val playCount:Int
){
    val isPopular:Boolean
        get() = playCount >= 1000
    fun printDescripcion(){
        println("$title, interpretada por $artist, se lanzo en $yearPublished")
    }
}