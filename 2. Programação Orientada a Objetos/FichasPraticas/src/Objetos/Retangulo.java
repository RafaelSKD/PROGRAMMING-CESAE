package Objetos;

// The Retangulo class represents a rectangle with a color, height, and length.
// It includes methods to access each of its properties.

public class Retangulo {
    private String cor;          // Color of the rectangle
    private double altura;       // Height of the rectangle
    private double comprimento;  // Length of the rectangle

    // Constructor to initialize the rectangle with color, height, and length
    public Retangulo(String cor, Double altura, Double comprimento) {
        this.cor = cor;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    // Getter for the rectangle's color
    public String getcor() {
        return this.cor;
    }

    // Getter for the rectangle's height
    public Double getAltura() {
        return this.altura;
    }

    // Getter for the rectangle's length
    public Double getComprimento() {
        return this.comprimento;
    }
}
