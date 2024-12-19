package sintaxis

fun main(){

    val weekDays = arrayOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")

    for(position in weekDays.indices){
    //    println(weekDays[position])
    }
    for((position, value )in weekDays.withIndex()){
    //    println("La posición $position, contiene $value")
    }

    for(xd in weekDays){
        println("Ahora es $xd")
    }
}