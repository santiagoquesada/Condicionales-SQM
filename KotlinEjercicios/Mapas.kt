// //crear un mapa

// fun main() {
//     val poblaciones = mutableMapOf(
//     "Madrid" to 3_200_000,
//     "Barcelona" to 1_600_000,
//     "Valencia" to 800_000
//     )
//     poblaciones.put("Mayorca", 900_500)
//     poblaciones["Catalunia"] = 400_100
//     poblaciones.remove("Valencia")
//     println(poblaciones)

//     for ((ciudad, codigo) in poblaciones) {
//         println("$ciudad -> $codigo")
//     }
// }

// fun main() {
//     val mapa = hashMapOf(
//     "clave1" to "valor1",
//     "clave2" to "valor2",
//     "clave3" to "valor3"
//     )
// }

fun main() {
    // Crear un mapa de estudiantes con sus edades
    var estudiantes = mapOf(
        "Juan" to 20,
        "María" to 22,
        "Pedro" to 19,
        "Ana" to 21
    )

    // Imprimir el mapa
    println(estudiantes)

    // Acceder a un valor del mapa usando su clave
    println("La edad de Juan es ${estudiantes["Juan"]}")

    // Iterar sobre las entradas del mapa
    for ((nombre, edad) in estudiantes) {
        println("$nombre tiene $edad años")
    }

    // Añadir una nueva entrada al mapa
    estudiantes["Luisa"] = 23

    // Eliminar una entrada del mapa
    estudiantes.remove("Pedro")

    // Imprimir el mapa actualizado
    println(estudiantes)
}