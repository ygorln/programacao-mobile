// Ex04_Main.kt
fun main() {
    val baralho = Baralho()
    val jogador = Jogador("Jogador 1")

    baralho.embaralhar()
    val cartas = baralho.distribuir(5)
    jogador.receberCartas(cartas)

    println(jogador)
    println("Combinacao: ${jogador.verificarCombinacoes()}")
}
