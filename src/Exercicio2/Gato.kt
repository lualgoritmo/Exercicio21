package Exercicio2

class Gato(nomeAnimal: String, raca: String, responsavel: String
):Animal(nomeAnimal = "", raca = "", responsavel = "") {
    override fun movimentar(raca: String) {
        super.movimentar(raca)
        println("Andando e Saltando em 4 patas: $raca")
    }
    override fun comer(raca: String) {
        super.comer(raca)
        println("whiskas sachê")
    }
    override fun dormir(raca: String){
        super.dormir(raca)
        println("Dormindo na CAIXA!!")
    }
}