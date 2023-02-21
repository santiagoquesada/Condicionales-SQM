// Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el
// promedio de notas, valide que si el estudiante saca un promedio menor que 3.5 entonces indique que el estudiante perdió la
// materia, el mensaje deberá mencionar el nombre y la materia del estudiante.

fun main() {
    println("Ingrese el nombre")
    var nombre: String? = readLine()!!.toString()
    println("nombre de la materia")
    var materia = readLine()!!.toString()
    println("Ingrese la nota 1")
    var nota1 = readLine()!!.toFloat()
    println("Ingrese la nota 2")
    var nota2 = readLine()!!.toFloat()
    println("Ingrese la nota 3")
    var nota3 = readLine()!!.toFloat()

    var promedio = (nota1 + nota2 + nota3) /3

    if (promedio >= 3.5){
        println("El estudiante $nombre ha ganado $materia con $promedio")
    }

}