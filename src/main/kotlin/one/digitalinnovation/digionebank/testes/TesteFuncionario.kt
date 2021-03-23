package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val andre = Pessoa(nome="André Nascimento", cpf = "123.456.789-10")

    println(andre.nome)
    println(andre.cpf)

    val joao = Funcionario(nome = "João Petro", cpf = "987.654.321-01", salario = BigDecimal(1200.98))
    println(joao.nome)
    println(joao.cpf)
    println(String.format("%.2f", joao.salario))

}