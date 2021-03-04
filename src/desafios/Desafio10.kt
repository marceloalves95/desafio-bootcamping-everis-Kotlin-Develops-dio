package desafios

fun main() {

    val patternHexadecimal = """0[a-zA-Z].*""".toRegex()
    val patternHex = """[a-zA-Z].*""".toRegex()
    val listatotal = mutableListOf<String>()
    var valor = true
    while(valor) {

        val leitura = readLine()!!.toString()

        //Se o número for decimal
        if (!leitura.contains(patternHexadecimal) && leitura.toInt() > 0 && leitura.toInt() < Integer.MAX_VALUE)  {

            val n = leitura.toInt()

            val decimal = Integer.toHexString(n).toUpperCase()
            val decimalCompleto = "0x$decimal"
            listatotal.add(decimalCompleto)

        }
        if(leitura == "-1"){

            valor = false
        }

        //Se o número for hexadecimal
        if (leitura.contains(patternHexadecimal) && leitura.contains(patternHex)) {

            val remover = leitura.removeRange(0,2)
            val result: Int = remover.toInt(16)
            listatotal.add(result.toString())

        }
    }
    for (i in listatotal){

        println(i)

    }


}