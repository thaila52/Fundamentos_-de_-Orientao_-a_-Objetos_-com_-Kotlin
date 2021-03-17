fun main(args: Array<String>) {

    println("Digite o primeiro número:")
    val a: Int = readLine()!!.toInt()

    println("Digite o segundo número:")
    val b: Int = readLine()!!.toInt()

    val resultado: Int = soma(a, b)
    println("Soma = $resultado")

}
fun soma(a: Int, b: Int) = a + b



