//package my.demo

import kotlin.text.*

fun main() {
    println("Hello world!")
    val a: Int = 1  // Declarando direto
    val b = 2   // Tipo `Int` subententido
    val c: Float  // Tipo fornecido, porem sem declaração
    c = 3.2F       // Delcarando o valor

    println(c)

    val retangulo = FormaGeometrica.Retangulo(5.0, 2.0)
    println("O perimetro eh ${retangulo.perimetro}")

    val sequencia = 1..9

    for (item in sequencia) {
        print(item)
    }

    var nums = 0
    val serie = 1..9

    while (nums < serie.last) {
        println(serie.elementAt(nums))
        nums++
    }
    val comentario = "Ola mundo de novo!"
    println(printaAlgo(comentario))
}
fun printaAlgo(comentarioParametro: String): String {
    return "$comentarioParametro"
}