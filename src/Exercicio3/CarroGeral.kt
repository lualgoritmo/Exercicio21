package Exercicio3

open class CarroGeral(protected var marca: String, protected var ano: Int, protected var valor: Double,
protected var cor:String, protected var portas: String, protected var velocidade:Double) {
    open fun partidaMotor(velocidade: Double) {}
    open fun frear(velocidade: Double) {}
    open fun acelerar(velocidade: Double) {}
}