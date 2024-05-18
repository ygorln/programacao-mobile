// Ex03_Passaro.kt
class Passaro(nome: String, idade: Int) : Animal(nome, idade, "Canto") {
    override fun fazerSom() {
        println(som)
    }

    override fun descricao(): String {
        return "O pássaro $nome tem $idade anos e faz $som."
    }

    fun cantar() {
        println("O pássaro $nome está cantando: $som!")
    }
}
