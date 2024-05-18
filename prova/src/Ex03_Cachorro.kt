// Ex03_Cachorro.kt
class Cachorro(nome: String, idade: Int) : Animal(nome, idade, "Latido") {
    override fun fazerSom() {
        println(som)
    }

    override fun descricao(): String {
        return "O cachorro $nome tem $idade anos e faz $som."
    }

    fun latir() {
        println("O cachorro $nome está latindo: $som!")
    }
}
