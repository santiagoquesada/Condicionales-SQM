// Haga un algoritmo que solicite el nombre de n cantidad de personas que llegan a una clase, se permitirá el ingreso
// hasta que el usuario decida, el sistema deberá indicar al final la cantidad de personas que llegaron

var resp = "si"
var cont = 0

fun main() {
    while (resp == "si") {
        print("\nIngrese su nombre: ")
        val nombre = readLine()!!
        println("Hola $nombre bienvenido a la clase!\n")
        cont++
        print("Ingrese si, si hay más personas: ")
        resp = readLine()!!
    }
    println("Llegaron $cont Personas!")
    println("Fin del Ciclo!")
}