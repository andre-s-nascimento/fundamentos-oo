package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "André"

    var cpf: String = "123.456.789-10"
    private set

}

fun main() {
    val andre = Pessoa()

    println(andre.nome)
    println(andre.cpf)


}