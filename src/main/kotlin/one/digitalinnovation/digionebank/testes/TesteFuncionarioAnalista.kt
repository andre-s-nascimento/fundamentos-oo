package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val joao = Analista(nome = "João Petro", cpf = "987.654.321-01", salario = 2000.0)
//    println(joao.nome)
//    println(joao.cpf)
//    println(String.format("%.2f", joao.salario))
    ImprimeRelatorioFuncionario.imprime(joao)


}
