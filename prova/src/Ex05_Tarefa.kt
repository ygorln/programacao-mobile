// Ex05_Tarefa.kt
import java.time.LocalDate

data class Tarefa(
    val titulo: String,
    val descricao: String,
    val dataDeVencimento: LocalDate,
    val prioridade: Int,
    var concluida: Boolean = false
) {
    fun marcarComoConcluida() {
        concluida = true
    }

    override fun toString(): String {
        return "Tarefa(titulo='$titulo', descricao='$descricao', dataDeVencimento=$dataDeVencimento, prioridade=$prioridade, concluida=$concluida)"
    }
}
