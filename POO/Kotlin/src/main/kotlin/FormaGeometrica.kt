//package my.demo

open class FormaGeometrica {

    class Retangulo(var altura: Double, var largura: Double): FormaGeometrica() {
        var perimetro = (altura + largura) * 2
    }
}