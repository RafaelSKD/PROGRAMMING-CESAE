package Ficha11.ex02_Carros.Objetos;

import Enums.TipoCombustivel;

import java.time.LocalDate;

public class Veiculo {
    private String marca;        // vehicle brand
    private String modelo;       // vehicle model
    private int ano;             // Year of manufacture
    private double potencia;                 // Engine power in horsepower
    private int cilindrada;                  // Engine displacement in cubic centimeters (cc)
    private TipoCombustivel combustivel;     // Type of fuel the car uses
    private double consumoLitros100km;       // Fuel consumption (liters per 100 km)

    // Constructor


    public Veiculo(String marca, String modelo, int ano, double potencia, int cilindrada, TipoCombustivel combustivel, double consumoLitros100km) {
        this.marca = marca;
        this.modelo = modelo;
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

    // Getter for car model
    public String getModelo() {
        return modelo;
    }
    // Getter for car year
    public int getAno() {
        return ano;
    }
    // Getter for car power
    public double getPotencia() {
        return potencia;
    }
    // Getter for car displacement
    public int getCilindrada() {
        return cilindrada;
    }
    // Getter for car fuel type
    public TipoCombustivel getCombustivel() {
        return combustivel;
    }
    // Getter for fuel consumption
    public double getConsumoLitros100km() {
        return consumoLitros100km;
    }

    // Simple method to simulate turning the car on
    public void ligar(){
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
    public Veiculo corrida(Veiculo adversario) {
        if (this.potencia > adversario.potencia) {
            System.out.println("\n" + this.marca + " " + this.modelo + " ganhou a corrida contra " + adversario.getMarca() + " " + adversario.getModelo());
            return this;
        } else if (this.potencia < adversario.potencia) {
            System.out.println("\n" + adversario.getMarca() + " " + adversario.getModelo() + " ganhou a corrida contra "  + this.marca + " " + this.modelo);
            return adversario;
        } else if (this.cilindrada > adversario.cilindrada) {
            System.out.println("\n" + this.marca + " " + this.modelo + " ganhou a corrida contra " + adversario.getMarca() + " " + adversario.getModelo());
            return this;
        } else if (this.cilindrada < adversario.cilindrada) {
            System.out.println("\n" + adversario.getMarca() + " " + adversario.getModelo() + " ganhou a corrida contra "  + this.marca + " " + this.modelo);
            return adversario;
        } else if (this.ano > adversario.ano) {
            System.out.println("\n" + this.marca + " " + this.modelo + " ganhou a corrida contra " + adversario.getMarca() + " " + adversario.getModelo());
            return this;
        } else if (this.ano < adversario.ano) {
            System.out.println("\n" + adversario.getMarca() + " " + adversario.getModelo() + " ganhou a corrida contra "  + this.marca + " " + this.modelo);
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
