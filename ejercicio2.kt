// Calcular el salario semanal de x trabajador, el salario se calcula en horas semanales, si las horas semanales son mayor a 40, el pago por hora es doble

fun main() {
    println("Ingrese nombre")
    var nombre: String? = readLine()!!.toString()

    println("Ingrese las horas de $nombre")
    var horas = readLine()!!.toFloat()

    println("Cuanto pagan por hora?")
    var valorH = readLine()!!.toInt()

    if(horas <= 40){
        var pago = hora * valorH
        println("El pago de $nombre es de: $ $pago")
    } else{
        var extra = horas - 40
        var pago = 40 * valorH
        var pagoFinal = pago + (extra * valorH * 2)
        println("El pago de $nombre es de: $pagoFina")
    }
}