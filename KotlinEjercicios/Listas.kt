//Creacion de listas mutables e inmutables
// fun main() {
//     var list = listOf(1, ,2 ,3 ,4, 5)
//     //Esta seria la creacion de una lista inmutable
//     var list2 = mutableListOf(9, 8 ,7 ,6)
//     //En esta la creacion de una lista mutable
// }

// fun main() {
//     var list2: List <Int> = mutableListOf(9, 8 ,7 ,6)
//     println(list2.size)
//     //Tamaño de lista
//     println(list2[2])
//     //Valor del indice
//     println(list2.indexOf(8))
//     //Indice del valor
// }

// fun main() {
//     var list2 = mutableListOf("Banana", "Limon", "Coco", "Pina", "Fresa")
//     list2.add("Mango")
//     list2.addAll(listOf("Pera", "Kiwi"))
//     list2.remove("Limon")
//     list2[0] = "Maracuya"
// }

// fun main() {
//     var list2 = mutableListOf("Banana", "Limon", "Coco", "Pina", "Fresa")
//     for (i in list2) {
//         println(i)
//     }
// }

fun main() {
    // Crear una lista de strings
    val nombres = listOf("Ana", "Juan", "Maria", "Pedro", "Luisa")
    
    // Imprimir la lista completa
    println("Lista completa: $nombres")
    
    // Acceder al primer elemento de la lista
    val primerNombre = nombres[0]
    println("Primer nombre: $primerNombre")
    
    // Acceder al último elemento de la lista
    val ultimoNombre = nombres[nombres.size - 1]
    println("Ultimo nombre: $ultimoNombre")
    
    // Recorrer la lista con un bucle for
    for (nombre in nombres) {
        println(nombre)
    }
    
    // Filtrar la lista para obtener solo los nombres que comienzan con "M"
    val nombresConM = nombres.filter { it.startsWith("M") }
    println("Nombres que comienzan con M: $nombresConM")
    
    // Ordenar la lista alfabéticamente
    val nombresOrdenados = nombres.sorted()
    println("Lista ordenada: $nombresOrdenados")
    
    // Agregar un nuevo nombre a la lista
    val nombresConNuevo = nombres.toMutableList()
    nombresConNuevo.add("Carlos")
    println("Lista con nuevo nombre: $nombresConNuevo")
}

// Este código crea una lista de nombres, accede a sus elementos, los recorre con un bucle for, filtra la lista para obtener solo los nombres que comienzan con "M", los ordena alfabéticamente y agrega un nuevo nombre a la lista. Puedes modificar este código o crear tus propias listas para practicar y experimentar con Kotlin.