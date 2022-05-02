package Exercicio3

class Renault(marca: String,ano: Int,valor: Double, cor:String,portas: String,velocidade:Double
):CarroGeral(marca = "",ano = 0,valor = 0.0, cor = "",portas = "",velocidade = 0.0) {
    private var recebe = 0.0
    override fun partidaMotor(velocidade: Double) {
        recebe = velocidade + 100
        super.partidaMotor(velocidade)
        println("Iniciando o motor e a minha velocidade é $velocidade")
        println("E a minha velocidade é igual a %.2f ".format(recebe) + "KM/H")
    }
    override fun frear(velocidade: Double) {
        recebe += 150
        super.acelerar(recebe)
        println("Freando à minha velocidade é %.2f ". format(recebe) + " Km/h")
        recebe -= 70
        println("E perde 5km da velocidade a cada freada %.0f".format(recebe) + "Km/h")
    }
    override fun acelerar(velocidade: Double) {
        recebe = 20.00
        super.acelerar(recebe)
        println("Freando à minha velocidade é %.2f ". format(recebe) + " Km/h")
        recebe += 20
        println("E a cada acelerada aumenta %.0f".format(recebe) + "Km/h")
    }
}