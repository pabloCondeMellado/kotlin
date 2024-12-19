package sintaxis/*
* Variables
* */
val age:Int = 20
fun main(){
    showMyName()
    showMyAge(age)
    add(25,76)
    val mySubtract = subtract(10,5)
    print(mySubtract)
}

fun showMyName(){
    println("Me llamo IgreenDemoni")
}

fun showMyAge(currentAge: Int){
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int){
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int):Int{
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber


fun variablesAlfaNumericas(){
    /*
    * Variables Alfanuméricas
    * */

    //Char
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    //String
    val name:String = "IgreenDemoni"
    val stringExample2 = "4"
    val stringExample3 = "23"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $name y tengo $age años"
    println(stringConcatenada)
    val example123:String = age.toString()

}

fun variablesBooleanas(){
    /*
     * Variables booleanas
    * */

    //Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
}

fun variablesNumericas(){

    /*
    * Variables Numericas
    * */
    //Int

    var age2:Int = 31
    age2= 29

    //Long
    val example:Long = 30

    //Float
    val floatExample:Float = 30.5f

    //Double
    val doubleExample:Double = 3241.258

        println("Sumar")
        println(age + age2)

        println("Restar")
        println(age - age2)

        println("Multiplicar")
        println(age * age2)

        println("División")
        println(age / age2)

        println("Módulo")
        println(age % age2)


    var exampleSuma: Int = age + floatExample.toInt()
}