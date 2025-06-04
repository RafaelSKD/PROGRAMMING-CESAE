package Ficha8;

import Objetos.Carro;

// The ex05 class demonstrates the basic usage of the Carro class from Ficha 1.
// It creates a Carro object with basic attributes and calls the 'ligar' method to simulate starting the car.

public class ex05 {
    public static void main(String[] args) {
        // Create a Car object with brand "BMW", model "e61 520d", color "verde", and year 2007
        Carro carro = new Carro("BMW ", "e61 520d ", "verde", 2007);

        // Start the car (basic version)
        carro.ligar();
    }
}
