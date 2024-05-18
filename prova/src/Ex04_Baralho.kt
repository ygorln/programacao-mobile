// Ex04_Baralho.kt
import kotlin.random.Random

class Baralho {
    private val naipes = listOf("♠️", "♥️", "♦️", "♣️")
    private val valores = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    private val cartas = mutableListOf<Carta>()

    init {
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(naipe, valor))
            }
        }
    }

    fun embaralhar() {
        cartas.shuffle(Random(System.currentTimeMillis()))
    }

    fun distribuir(numCartas: Int): List<Carta> {
        val mao = cartas.take(numCartas)
        cartas.removeAll(mao)
        return mao
    }

    fun reset() {
        cartas.clear()
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(naipe, valor))
            }
        }
        embaralhar()
    }
}
