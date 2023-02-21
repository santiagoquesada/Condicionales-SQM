//Creacion de un array y acceso a array
// fun main() {
//     var arreglo: Array <String> = arrayOf("san", "manuel", "luis")
//     println(arreglo.get(2))
    
//     arreglo.set(0, "santiago")
//     println(arreglo.contentToString())
// }

// fun main() {
//     var arreglo = arrayOf("san", "manuel", "luis")

//     for (i in arreglo) {
//         println(i)
//     }
// }

fun main() {
    // Crear un array de números enteros
    val numeros = arrayOf(3, 7, 1, 4, 2, 9)

    // Imprimir el array
    println("Array original: ${numeros.joinToString()}")

    // Ordenar el array en orden ascendente
    numeros.sort()

    // Imprimir el array ordenado
    println("Array ordenado: ${numeros.joinToString()}")

    // Calcular el promedio de los números en el array
    val promedio = numeros.average()

    // Imprimir el promedio
    println("El promedio de los numeros es: $promedio")
}

// En este ejemplo, primero creamos un array llamado numeros que contiene varios números enteros. Luego, utilizamos el método sort() para ordenar los números en orden ascendente y lo imprimimos.

// Después, utilizamos el método average() para calcular el promedio de los números en el array y lo imprimimos también.