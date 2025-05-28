package Ficha1;

import Objetos.Retangulo;

// The ex03 class demonstrates the use of the Retangulo class.
// It creates a rectangle and calculates its perimeter and area manually using getter methods.

public class ex03 {
    public static void main(String[] args) {
        // Create a rectangle with color "verde", height 5.0, and length 10.0
        Retangulo retangulo = new Retangulo("verde", 5., 10.);

        // Print the perimeter and area using manual calculations (without dedicated methods)
        System.out.println("perimetro = " + ((retangulo.getComprimento() * 2) + (retangulo.getAltura() * 2)) +
                "\narea = " + (retangulo.getComprimento()) * (retangulo.getAltura()));
    }
}
