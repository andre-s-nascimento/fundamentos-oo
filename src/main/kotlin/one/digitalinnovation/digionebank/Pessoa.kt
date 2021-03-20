package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "André"
    var cpf: String = "123.456.789-10"

    inner class Endereco {
        var rua: String = "Rua A, 1"
    }
}

fun main() {
    val andre = Pessoa()

    println(andre.nome)
    println(andre.cpf)

    println(andre.Endereco().rua)
}