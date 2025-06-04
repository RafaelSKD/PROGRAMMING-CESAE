package Ficha8;

import Objetos.Livro;

// The ex02 class demonstrates the use of the static inner class Edificio inside the Livro class.
// It creates an Edificio object, prints its details, changes its color, and prints the updated details.

public class ex02 {
    public static void main(String[] args) {
        // Creating an Edificio (building) object with initial values
        Livro.Edificio elCorteIngles = new Livro.Edificio(
                "El Corte Ingles",
                "rua dos quintos, 666",
                "verde",
                6,
                true
        );

        // Displaying the original details
        System.out.println("nome = " + elCorteIngles.getNome());
        System.out.println("rua = " + elCorteIngles.getRua());
        System.out.println("cor = " + elCorteIngles.getCor());
        System.out.println("andares = " + elCorteIngles.getAndares());
        System.out.println("Tem garagem? = " + elCorteIngles.getGaragem());

        // Changing the building's color
        elCorteIngles.setCor("Rosa");

        System.out.println();

        // Displaying updated details
        System.out.println("nome = " + elCorteIngles.getNome());
        System.out.println("rua = " + elCorteIngles.getRua());
        System.out.println("cor = " + elCorteIngles.getCor());
        System.out.println("andares = " + elCorteIngles.getAndares());
        System.out.println("Tem garagem? = " + elCorteIngles.getGaragem());
    }
}
