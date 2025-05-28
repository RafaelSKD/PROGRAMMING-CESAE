package Ficha1;

import Objetos.Circulo;

// The ex04 class demonstrates the use of the Circulo class.
// It creates two circles, determines the larger circle based on perimeter and area,
// and prints the perimeter and area of the larger circle.

public class ex04 {
    public static void main(String[] args) {
        // Create two circles with different colors and radii
        Circulo circulo = new Circulo("verde", 5);
        Circulo circulo1 = new Circulo("azul", 10);

        // Calculate area and perimeter for the first circle
        double area = circulo.areaCirculo();
        double perimetro = circulo.perimetroCirculo();

        // Check if the second circle has a larger perimeter, update if necessary
        if (perimetro < circulo1.perimetroCirculo())
            perimetro = circulo1.perimetroCirculo();

        // Check if the second circle has a larger area, update if necessary
        if (area < circulo1.areaCirculo())
            area = circulo1.areaCirculo();

        // Output the perimeter and area of the larger circle
        System.out.println("O perimetro do maior circulo e de :" + perimetro +
                "\n A area do maior circulo e de :" + area);
    }
}
