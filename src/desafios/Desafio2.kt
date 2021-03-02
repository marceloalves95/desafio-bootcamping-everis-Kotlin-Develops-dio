package desafios

/*
   |--------------------------------------------------------------|
   | Leia um valor inteiro X (1 <= X <= 1000).                    |
   | Em seguida mostre os ímpares de 1 até X, um valor por linha, |
   | inclusive o X, se for o caso.                                |
   |--------------------------------------------------------------|

 */
fun main(){

    for (i in 1.rangeTo(readLine()!!.toInt()).step( 2 ))
        println(i)

}