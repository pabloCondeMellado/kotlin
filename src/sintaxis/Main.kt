package sintaxis

fun main() {
    // Hola mundo
    //println("JAVI CALLATE PORFA")

    var myString = "Esto es una cadena de texto"
    myString = "Aqui cambio el valor de la cadena de texto"
    // myAtring = 6 Error
    // println(myString)

    var myString2: String = "Esta es otra cadena de texto"

    var myInt = 7
    //myInt = myInt + 4
    //println(myInt)

    var myDouble = 6.5
    // println(myDouble)

    var myFloat = 6.5f

    val myBool = true
    /*if(myInt ==10){
        println("El valor es: 10")
    }else{
        println("El valor es distinto a 10")
    }
*/

    var myList = mutableListOf<String>("Conde", "Pablo", "Igreendemoni")
    println(myList)
    myList.add("David")
    println(myList)

    val mySet = setOf("Javi", "Tonto", "David", "Javi")

    val myMap = mutableMapOf("Pablo" to 20, "Javi" to 19, "David" to 2, "Angela" to 17)
    println(myMap["Pablo"])

    for (value in myList) {
        println(value)
    }

    for (value in mySet) {
        println(value)
    }

    for (value in myMap) {
        println(value)
    }

    var myCounter = 0
    while (myCounter < myList.count()) {
        println(myList[myCounter])
        myCounter++
    }

    var myOptional: String? = null
    println(myOptional)
    myOptional = "Mi cadena de texto opcional"
    println(myOptional)

    myFunction()
}


fun myFunction() {
    println("Esto es una funcion")
}

class MyClass(val name: String, val age: Int) {

}