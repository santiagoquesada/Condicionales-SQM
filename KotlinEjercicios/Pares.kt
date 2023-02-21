//Creacion de pares
fun main() {
    val miPar = Pair("hola", 123)

    val myPair2 = Pair("Hola", 10)
    val nuevoPair2 = myPair2.copy(first = "Mandar saludos") //se crea el par duplicado con el nuevo elemento
    println(nuevoPair2)

    val miPar = Pair("Hola", 123)
    println(miPar.first)  // Imprime "Hola"
    println(miPar.second) // Imprime 123

}