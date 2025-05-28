// The Circulo class represents a geometric circle with a specific color and radius.
// It includes methods to calculate the circle's perimeter and area using standard formulas.

package Objetos;

public class Circulo {
    private String cor;     // Color of the circle
    private double raio;    // Radius of the circle

    // Constructor to initialize the circle's color and radius
    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    // Calculates and returns the perimeter (circumference) of the circle
    public double perimetroCirculo() {
        return 2 * Math.PI * this.raio; // Formula: 2πr
    }

    // Calculates and returns the area of the circle
    public double areaCirculo() {
        return Math.PI * this.raio * this.raio; // Formula: πr²
    }
}
