package desafios

fun main() {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val salario = readLine()!!.toFloat()
    val imposto: Float

    when {
        //Imposto de Renda Isento
        salario in 0.0..2000.0 -> {
            println("Isento")
        }
        //8% de Imposto de Renda
        salario in 2000.01..3000.00 -> {
            imposto = (salario - 2000) * 0.08.toFloat()
            println("R$ ${imposto.format(2)}")
        }
        //18% de Imposto de Renda
        salario in 3000.01..4500.00 -> {
            imposto = (salario - 3000) * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()
            println("R$ ${imposto.format(2)}")
        }
        //28% de Imposto de Renda
        salario > 4500 -> {
           imposto = ((salario - 4500.00) * 0.28.toFloat() + 1500.00.toFloat() * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()).toFloat()
            println("R$ ${imposto.format(2)}")
        }
    }

}