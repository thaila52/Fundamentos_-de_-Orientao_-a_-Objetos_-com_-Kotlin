package testes

import Analista

fun main() {
    val joao = Analista("Joao Pedro", "330.541.868-06", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}


