package sintaxis

fun main(){
    ifMultiple()
}

fun ifMultipleOR(){
    var pet = "dog"
    var isHappy = true

    if(pet == "dog" || (pet== "cat" && isHappy)){
        println("Es un gato o un perro")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true
    if(age>= 18 && parentPermission && imHappy){
        println("Puedes beber alcohol")
    }else{
        println("No puedes beber alcohol")
    }
}

fun ifInt(){
    var age = 20
    if(age>=18){
        println("Puedes beber alcohol")
    }else{
        println("No puedes beber alcohol")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean = false
    if(soyFeliz){
        println("Estoy triste :(")
    }
}

fun ifAnidado(){
    val animal = "bird"
    if(animal == "dog"){
        println("Es un perrito!")
    }else if(animal == "cat"){
        println("Es un gato")
    }else if(animal == "bird"){
        println("Es un pajaro")
    } else{
        println("No es uno de los animales esperados")
    }
}

fun ifBasico(){
    val name = "IgreenDemoni"

    if(name == "IgreenDemoni"){
        println("Oye, la variable name es IgreenDemoni")
    }else{
        println("Este no es IgreenDemoni")
    }


}