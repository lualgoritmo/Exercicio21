package Exercicio2

class Peixe(nomeAnimal: String, raca: String, responsavel: String
):Animal(nomeAnimal = "", raca = "", responsavel = "") {
    override fun movimentar(raca: String) {
        super.movimentar(raca)
        println("Nadando $raca")
    }
    override fun comer(raca: String) {
        super.comer(raca)
        println("Comendo Ração molhada")
    }
    override fun dormir(raca: String) {
        super.dormir(raca)
        println("Dormindo de olho aberto")
    }

}