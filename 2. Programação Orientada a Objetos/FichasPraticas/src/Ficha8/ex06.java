package Ficha8;

import Objetos.Livro;

// The ex06 class demonstrates the use of the Livro class.
// It creates a Livro object and displays its details using the exibirDetalhes() method.

public class ex06 {
    public static void main(String[] args) {
        // Create a book with title, author, page count, and ISBN
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178, "978-85-326-1234-5");

        // Display the book's details
        livro.exibirDetalhes();
    }
}
