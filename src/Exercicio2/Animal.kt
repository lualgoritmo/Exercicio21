package Exercicio2

open class Animal(protected var nomeAnimal:String, protected var raca:String, protected var responsavel:String) {
    open fun movimentar(raca: String) {
    }
    open fun comer(raca: String) {
    }
    open fun dormir(raca: String){
    }
}