// Haga un algoritmo que solicite el nombre de n cantidad de personas que llegan a una clase, se permitirá el ingreso
// hasta que el usuario decida, el sistema deberá indicar al final la cantidad de personas que llegaron

var resp = "si"
var cont = 0

fun main() {
    while (resp == "si"){
        println("\nIngrese el nombre: ")
        var nombre = readLine()!!
        println("Hola $nombre bienvenido a la clase! \n")
        cont++
        println("Ingrese si, si hay mas personas: ")
        resp = readLine()!!
    }
    println("Llegaron $cont personas!")
    println("Fin del ciclo!")
}