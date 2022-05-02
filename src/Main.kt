fun main() {
    val romance: Livro = Livro()
    romance.registrarLivro(isbn = "12345")
    val policial: Livro = Livro()
    policial.registrarLivro(nomeLivro = "O vento Levou", isbn = "6543")
    val terror:Livro = Livro()
    terror.registrarLivro(nomeLivro = "Todo Mundo em Pánico", isbn = "987654", autorLivro = "Vovô")
}