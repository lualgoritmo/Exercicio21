package Exercicio3

fun main() {
    var renault:Renault = Renault(marca = "", ano = 0, 0.0, cor = "", portas = "4", velocidade = 0.0)
    renault.partidaMotor(velocidade = 0.0)
    renault.frear(velocidade = 200.00)
    renault.acelerar(velocidade = 100.00)
    var fiat: Fiat = Fiat(marca = "", ano = 0, 0.0, cor = "", portas = "4", velocidade = 0.0)
    fiat.partidaMotor(velocidade = 0.0)
    fiat.frear(velocidade = 0.0)
    fiat.acelerar(0.0)
}