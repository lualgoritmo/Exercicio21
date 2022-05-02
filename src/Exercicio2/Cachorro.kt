package Exercicio2

class Cachorro(
    nomeAnimal: String, raca: String, responsavel: String,
):Animal(nomeAnimal = "", raca = "", responsavel = "") {
    override fun movimentar(raca: String) {
        super.movimentar(raca)
    }
    override fun comer(raca: String) {
        super.comer(raca)
    }
    override fun dormir(raca: String){
        super.dormir(raca)
    }
}