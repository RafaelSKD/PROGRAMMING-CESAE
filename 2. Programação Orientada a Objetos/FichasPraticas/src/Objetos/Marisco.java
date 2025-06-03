package Objetos;

public class Marisco {
    private String especie; // Species of the shellfish
    private double peso;    // Weight of the shellfish
    private double preco;   // Price of the shellfish in euros per kilogram

    /**
     * Constructs a new Marisco (shellfish) with a given species, weight, and price.
     *
     * @param especie the species of the shellfish
     * @param peso    the weight of the shellfish
     * @param preco   the price of the shellfish in euros per kilogram
     */
    public Marisco(String especie, double peso, double preco) {
        this.especie = especie;
        this.peso = peso;
        this.preco = preco;
    }

    // Getters for the attributes
    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }
}
