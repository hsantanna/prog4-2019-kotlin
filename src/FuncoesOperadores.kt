// função com um parâmetro inteiro e retorno String
fun jogoDaVelha(param: Int) : String {
    return if (param % 2 == 0) "X" else "O"
}

// -= operador Elvis: =-

// o operador Elvis (que é o ?: servirá para testar se essa variável tem um conteúdo,
// então ele atribui este conteúdo, senão atribui outro valor especificado no :? )
fun enviarMensagem(msg: String?): String {
    var teste : String = msg ?: "nada"
    // ou
    // var teste = msg ?: "nada"

    return teste
}

fun main(args: Array<String>) {
    println(jogoDaVelha(2))  // imprime X
    println(jogoDaVelha(3))  // imprime O
    println(enviarMensagem("Brasil"))  // imprime Brasil
    println(enviarMensagem(null)) // imprime "nada"
}