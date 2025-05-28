// The Carro class represents a car with basic and extended attributes.
// It includes behaviors such as starting the car, simulating a race between two cars,
// and calculating fuel consumption based on distance.

package Objetos;

import Enums.TipoCombustivel; // Enum representing the type of fuel (e.g., GASOLINE, DIESEL, ELECTRIC, etc.)

import java.time.LocalDate;

public class Carro {
    // Basic attributes (Ficha 1)
    private String marca;        // Car brand
    private String modelo;       // Car model
    private String cor;          // Car color
    private int ano;             // Year of manufacture

    // Extended attributes (Ficha 2)
    private double potencia;                 // Engine power in horsepower
    private int cilindrada;                  // Engine displacement in cubic centimeters (cc)
    private TipoCombustivel combustivel;     // Type of fuel the car uses
    private double consumoLitros100km;       // Fuel consumption (liters per 100 km)

    // Constructor for basic attributes (Ficha 1)
    public Carro(String marca, String modelo, String cor, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    // Constructor for full attributes including extras (Ficha 2)
    public Carro(String marca, String modelo, String cor, int ano, double potencia, int cilindrada, TipoCombustivel combustivel, double consumoLitros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumoLitros100km = consumoLitros100km;
    }

    // Getter for car brand
    public String getMarca() {
        return marca;
    }

    // Simple method to simulate turning the car on (basic version)
    public void ligar() {
        System.out.println("The car " + this.marca + " " + this.modelo + " in " + this.cor + ", year " + this.ano + ", is now on.");
    }

    // More detailed method to simulate turning the car on, depending on year and specs
    public void ligarCarro(){
        System.out.println("\n" + this.marca + " " + this.modelo);
        if ((LocalDate.now().getYear() - 30) > this.ano) { // If the car is older than 30 years
            if (this.combustivel == TipoCombustivel.DIESEL) {
                System.out.println("Releases some smoke... Hard to start... The car is on!\nVrum-vrum-vrum");
            } else {
                System.out.println("Hard to start... The car is on!\nVrum-vrum-vrum");
            }
        }
        else {
            if (this.potencia < 250){
                System.out.println("The car is on!\nVruuuuuuuuuuuuuuuuuum");
            } else {
                System.out.println("The car is on!\nVRUUUUUUUUUUUUUMMMMMMMMMMMMMMM");
            }
        }
    }

    // Simulates a race between this car and an opponent
    // Returns the winning car based on power, engine size, and year
    public Carro corrida(Carro adversario) {
        if (this.potencia > adversario.potencia) {
            return this;
        } else if (this.potencia < adversario.potencia) {
            return adversario;
        } else if (this.cilindrada > adversario.cilindrada) {
            return this;
        } else if (this.cilindrada < adversario.cilindrada) {
            return adversario;
        } else if (this.ano > adversario.ano) {
            return this;
        } else if (this.ano < adversario.ano) {
            return adversario;
        } else {
            return null; // It's a tie
        }
    }

    // Calculates how many liters of fuel the car would consume over a given distance
    public double calcularConsumo(double distancia) {
        return (distancia * this.consumoLitros100km) / 100.0;
    }
}
