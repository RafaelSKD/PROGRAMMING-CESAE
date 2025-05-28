package Ficha1;

import Objetos.Pessoa;

// The ex01 class demonstrates the use of the Pessoa class from Ficha 1.
// It creates two Pessoa objects and prints their details: name, age, and height.

public class ex01 {
    public static void main(String[] args) {
        // Creating two Pessoa objects using the constructor from Ficha 1
        Pessoa rafael = new Pessoa("Rafael", 28, 1.85);
        Pessoa sofia = new Pessoa("Sofia", 28, 1.50);

        // Displaying Rafael's details
        System.out.println("Nome: " + rafael.getNome());
        System.out.println("Idade: " + rafael.getAge());
        System.out.println("Altura: " + rafael.getheight());
        System.out.println();

        // Displaying Sofia's details
        System.out.println("Nome: " + sofia.getNome());
        System.out.println("Idade: " + sofia.getAge());
        System.out.println("Altura: " + sofia.getheight());
    }
}
