// Ex04_Carta.kt
data class Carta(val naipe: String, val valor: String) {
    override fun toString(): String {
        return "$valor$naipe"
    }
}
