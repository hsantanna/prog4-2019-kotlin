fun main() {
    var nome: String = "Henrique"  // Declaração de variável especificando o tipo
    var sobrenome = "Sant'Anna"  // Na inicialização para um valor, o tipo é opcional
    val msg = "Bem vindo ao Kotlin"  // val é uma constante, não pode ser modificada
    println("Hello World!")  // Para imprimir na saída padrão temos println() e print()
    println("Olá $nome $sobrenome")  // É possível compor texto com o conteúdo de variáveis
    println("Quantidade de caracteres: ${nome.length}") // Ou compor com retornos de expressões

    // Se quisermos criar uma variável do tipo inteiro:
    var teste1: Int
    // ou
    var teste2 = 4
    // não é possível criar uma variável sem definir o tipo ou definir um valor
    // (através do qual o tipo será detectado).

}
