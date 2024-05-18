// Ex05_GerenciadorDeTarefas.kt
import java.time.LocalDate

class GerenciadorDeTarefas {
    private val tarefas = mutableListOf<Tarefa>()

    fun adicionarTarefa(tarefa: Tarefa) {
        tarefas.add(tarefa)
    }

    fun removerTarefa(titulo: String) {
        tarefas.removeIf { it.titulo == titulo }
    }

    fun buscarTarefa(titulo: String): Tarefa? {
        return tarefas.find { it.titulo == titulo }
    }

    fun marcarTarefaComoConcluida(titulo: String) {
        val tarefa = buscarTarefa(titulo)
        tarefa?.marcarComoConcluida()
    }

    fun listarTarefasPorData(): List<Tarefa> {
        return tarefas.sortedBy { it.dataDeVencimento }
    }

    override fun toString(): String {
        return tarefas.joinToString("\n")
    }
}
