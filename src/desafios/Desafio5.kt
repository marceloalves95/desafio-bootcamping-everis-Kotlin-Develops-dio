package desafios

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * (raio*raio)
    val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)

    println("A=$resultado")

}

