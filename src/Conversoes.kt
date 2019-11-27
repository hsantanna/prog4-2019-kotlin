fun main() {
    // criar metodo (função) main:
    // var texto = "Brasil"
    // se quisermos que a variável receba valores de qualquer tipo:
    var texto:Any = "Brasil"
    // então podemos forçar que seja impressa como string:
    println(texto as String)  // cast (conversão)
    // no entanto receberíamos um erro se tentássemos forçar a conversão para inteiro:
    // println(texto as Int)
    // para evitarmos esse tipo de erro de conversão podemos usar as?:
    println(texto as? Int)  // resulta em null quando a conversão não é possível
    // ou usar um if:
        if (texto is String) {
            println("$texto é uma String")
        }
    // é por causa do if que não precisa fazer cast de Any para String.
    // [TESTE isso sem o if]

    // se tentarmos atribuir um null para o tipo Any:
    // texto = null  // um erro será disparado

    // se quisermos forçar essa permissão ao declarar:
    var texto2:Any? = "Brasil"
    texto2 = null  // agora sim funciona

    // da mesma maneira, uma String que aceita null:
    var texto3:String? = "Brasil"
    texto3 = null  // agora sim funciona

    // mas desta maneira NÃO aceita length
    // println(texto2.length)
    // println(texto3.length)

    // para poder usar uma propriedade de um possível null:
    println(if (texto2 is String) texto2.length else null)
    println(texto3?.length)
    // o que vai imprimir null se texto for null
}