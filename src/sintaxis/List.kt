package sintaxis

fun main(){
    inmutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")
    weekDays.add(3,"IgreenDemoni")
    println(weekDays)

    if(weekDays.isEmpty()){

    }else{
        weekDays.forEach{ println(it) }
    }
    if (weekDays.isNotEmpty()){
        weekDays.forEach{ println(it) }
    }

    weekDays.last()
    for(i in weekDays){

    }
}

fun inmutableList(){
  //  val readOnly:List<String> = listOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")
//    println(readOnly.size)
//    println(readOnly)
//    println(readOnly[0])
//    println(readOnly.last())
//    println(readOnly.first())
    //Filtrar
 //   val example = readOnly.filter { it.contains("A") }
 //   println(example)

   // readOnly.forEach{weekDay -> println(weekDay) }
}