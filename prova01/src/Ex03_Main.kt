// Ex03_Main.kt
fun main() {
    val cachorro = Cachorro("Rex", 5)
    val gato = Gato("Mimi", 3)
    val passaro = Passaro("Piu", 2)

    val animais = listOf(cachorro, gato, passaro)

    for (animal in animais) {
        println(animal.descricao())
        animal.fazerSom()

        when (animal) {
            is Cachorro -> animal.latir()
            is Gato -> animal.miar()
            is Passaro -> animal.cantar()
        }
    }
}
