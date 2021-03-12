
class Pessoa {
    var nome: String = "Thaila"
    var cpf: String = "330.541.868-06"
    private set

    constructor()
    fun pessoainfo() = "$nome e $cpf"
}
fun main() {

    val thaila = Pessoa()
    println(thaila.pessoainfo())
}




