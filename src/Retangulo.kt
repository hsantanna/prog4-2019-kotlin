class Retangulo (val altura: Int, val largura: Int) {
    val isQuadrado: Boolean
        get() {
            return altura == largura
        }
}

fun main(args: Array<String>) {
    val retangulo = Retangulo(30, 30)
    println("Retangulo = [ ${retangulo.altura}, ${retangulo.largura} ]")
    println("Quadrado? ${retangulo.isQuadrado}")
}