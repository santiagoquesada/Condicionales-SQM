//Haga un algoritmo que solicite el numero de horas trabajadas de un empleado, teniendo que el valor de la hora es igual
// a $2000 calcule el salario base y realicele un descuento del 10% por concepto de derechos medicos, posteriormente solicite
// el tipo de empleado y realice el aumento del salario basado en la siguiente tabla:
// Tipo A - Aumento del 30%
// Tipo B - Aumento del 20%
// Tipo C - Aumento del 10%
//  En caso de que el usuario no tenga un tipo definido, entonces no se le realizará ningún aumento, indique cual seria el
// salario final basado en los calculos anteriores.
fun main() {
    println("ingrese horas trabajadas")
    var horasT = readLine()!!.toInt()
    var valorH = 2000
    var salario = horasT * valorH
    println("Salario base es de: $salario")
    var porcent = 0.1
    var descuento = salario * porcent
    println("Se realizo descuento de 10% que es igual a: $descuento")
    var salarioT = salario - (descuento)
    println("Salario a pagar aplicando el descuento es de: $salarioT")

    println("Ingrese tipo de empleado: (A,B,C)")
    var tipoEmple = readLine()

    var porcentAumento = 0.0

    when (tipoEmple){
        "a","A" -> {
            porcentAumento = 0.30
            println("Es tipo A")
        }
        "b","B" -> {
            porcentAumento = 0.20
            println("Es tipo B")
        }
        "c","C" -> {
            porcentAumento = 0.10
            println("Es tipo C")
        }
        else -> {
            println("No se realiza ningun descuento")
            porcentAumento = 0.0
        }
    }
    if (porcentAumento != 0.0){
        var aumento = salarioT * (porcentAumento/100)
        salarioT = salarioT + aumento
        println("se realizo un aumento de $aumento, que es igual a $porcentAumento")
        println("El salario final es: $salarioT")
    }
}