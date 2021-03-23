package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val maria = Gerente(nome = "Maria Antonia", cpf = "999.888.777-01", salario = 5000.0)
//    println(joao.nome)
//    println(joao.cpf)
//    println(String.format("%.2f", joao.salario))
    ImprimeRelatorioFuncionario.imprime(maria)


}

