// Ex03_Gato.kt
class Gato(nome: String, idade: Int) : Animal(nome, idade, "Miau") {
    override fun fazerSom() {
        println(som)
    }

    override fun descricao(): String {
        return "O gato $nome tem $idade anos e faz $som."
    }

    fun miar() {
        println("O gato $nome está miando: $som!")
    }
}
