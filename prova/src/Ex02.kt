//Ex02
fun main() {
    println("Digite um número inteiro positivo n:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        var soma = 0.0
        for (i in 1..n) {
            soma += i.toDouble() / (n - i + 1)
        }
        println("O valor da soma é: $soma")
    } else {
        println("Erro: O número deve ser um inteiro positivo.")
    }
}