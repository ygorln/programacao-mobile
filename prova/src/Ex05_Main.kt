// Ex05_Main.kt
import java.time.LocalDate

fun main() {
    val gerenciador = GerenciadorDeTarefas()

    val tarefa1 = Tarefa("Comprar pão", "Comprar pão na padaria", LocalDate.of(2024, 5, 18), 2)
    val tarefa2 = Tarefa("Enviar relatório", "Enviar relatório semanal", LocalDate.of(2024, 5, 20), 1)
    val tarefa3 = Tarefa("Consulta médica", "Consulta de rotina", LocalDate.of(2024, 5, 19), 3)

    gerenciador.adicionarTarefa(tarefa1)
    gerenciador.adicionarTarefa(tarefa2)
    gerenciador.adicionarTarefa(tarefa3)

    println("Tarefas adicionadas:")
    println(gerenciador)

    gerenciador.marcarTarefaComoConcluida("Comprar pão")

    println("\nTarefas após marcar 'Comprar pão' como concluída:")
    println(gerenciador)

    gerenciador.removerTarefa("Enviar relatório")

    println("\nTarefas após remover 'Enviar relatório':")
    println(gerenciador)

    println("\nTarefas ordenadas por data de vencimento:")
    val tarefasOrdenadas = gerenciador.listarTarefasPorData()
    tarefasOrdenadas.forEach { println(it) }
}
