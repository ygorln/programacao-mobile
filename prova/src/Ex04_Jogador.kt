// Ex04_Jogador.kt
class Jogador(val nome: String) {
    val mao = mutableListOf<Carta>()

    fun receberCartas(cartas: List<Carta>) {
        mao.clear()
        mao.addAll(cartas)
    }

    fun verificarCombinacoes(): String {
        val valores = mao.groupBy { it.valor }.map { it.value.size }
        val naipes = mao.groupBy { it.naipe }.map { it.value.size }

        return when {
            4 in valores -> "Four of a Kind"
            3 in valores && 2 in valores -> "Full House"
            5 in naipes -> "Flush"
            3 in valores -> "Trinca"
            valores.count { it == 2 } == 2 -> "Two Pair"
            2 in valores -> "Par"
            else -> "No Combination"
        }
    }

    override fun toString(): String {
        return "$nome's hand: ${mao.joinToString(", ")}"
    }
}
