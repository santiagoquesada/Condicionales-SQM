// Política de descuentos de empresa
// TARGETA/SEXO   |   Hombres  |  mujeres |
// EMPLEADO       |    15%     |    10%   |
// OBRERO         |    20%     |    15%   |

// determinar cual sera el monto de descuento ingresado para cada caso

fun main() {
    println("Ingrese el sueldo")
    var sueldo = readLine()!!.toInt()

    println("Ingrese genero: Hombre[h] o Mujer[m]")
    var genero: String? = readLine()!!.toString()

    println("Ingrese tipo de tarjeta: Empleado[1] u Obrero[2]")
    var tar: String? = readLine()!!.toString()

    if(genero == "h"){
        if(tar == "1"){
            var des = sueldo * 0.15; var total = sueldo - des
            println("Su descuento es de $des, valor a pagar: $ $total")
        } else if (tar == 2){
            var des = sueldo * 0.20; var total = sueldo - des
            println("Su descuento es de $des, valor a pagar: $ $total")
        }
    } else if (genero == "m"){
        if(tar == 1){
            var des = sueldo * 0.10; var total = sueldo - des
            println("Su descuento es de $des, valor a pagar: $ $total")
        } else if (tar == 2){
            var des = sueldo * 0.15; var total = sueldo - des
            println("Su descuento es de $des, valor a pagar: $ $total")
        }
    }
}
