package testes

import Banco

fun main() {
    val digiOneBank = Banco (nome = "DigiOne", numero = 122)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    print(banco2.info())

}