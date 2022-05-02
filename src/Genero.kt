import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected

open class Livro() {

    open fun registrarLivro(isbn: String) {
        println("O ISBN É: $isbn")
    }
    open fun registrarLivro(nomeLivro: String, isbn: String) {
        println("O Livro foi registrado \n nome: \n $nomeLivro \n ISBN: $isbn")
    }
    open fun registrarLivro(nomeLivro: String, isbn: String, autorLivro: String) {
        println("Terceira")
        println("Nome: $nomeLivro \n ISBN: $isbn \n Autor: $autorLivro \n")

    }
}