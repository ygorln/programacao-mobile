// Ex03_Animal.kt
abstract class Animal(val nome: String, val idade: Int, val som: String) {
    abstract fun fazerSom()
    abstract fun descricao(): String
}
