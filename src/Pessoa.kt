
class Pessoa {
    var nome: String = "Thaila"
    var cpf: String = "330.541.868-06"
    private set

}
fun main() {

    val Thaila = Pessoa()
    Thaila.cpf ="000"
    println(Thaila.nome)
    println(Thaila.cpf)
}




