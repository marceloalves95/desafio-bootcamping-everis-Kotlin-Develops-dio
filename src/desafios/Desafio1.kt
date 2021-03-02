package desafios

import java.util.*

/*
|----------------------------------------------------------------|
| Leia dois valores inteiros identificados como variáveis A e B. |
| Calcule a soma entre elas e chame essa variável de SOMA.       |
| A seguir escreva o valor desta variável.                       |
|----------------------------------------------------------------|
 */

fun main() {

    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val soma = a.plus(b)
    println("SOMA = $soma")

}