package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val andre = Pessoa(nome="André Nascimento", cpf = "123.456.789-10")

    println(andre.nome)
    println(andre.cpf)
}