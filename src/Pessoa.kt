class Pessoa (
    var nome: String,
    var isCasada: Boolean) {
}
// Implicitamente há geters e seters para nome e isCasada, além de um método construtor que recebe valores e define estas propriedades.
// Isso significa uma grande economia em relação a um código equivalente em Java (pojo) onde tudo isto precisaria ser feito de forma explícita.

fun main(args: Array<String>) {
    val pessoa = Pessoa("João", true)
    println(pessoa.nome + " " + pessoa.isCasada)
    // alterar uma propriedade
    pessoa.nome = "Jose"
    pessoa.isCasada = false
    println(pessoa.nome + " " + pessoa.isCasada)
}
