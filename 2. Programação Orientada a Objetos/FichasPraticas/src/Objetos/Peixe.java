package Objetos;

public class Peixe {
    private String especie; // Species of the fish
    private double peso;    // Weight of the fish
    private double preco;   // Price of the fish in euros per kilogram

    /**
     * Constructs a new Peixe (fish) with a given species, weight, and price.
     *
     * @param especie the species of the fish
     * @param peso    the weight of the fish
     * @param preco   the price of the fish in euros per kilogram
     */
    public Peixe(String especie, double peso, double preco) {
        this.especie = especie;
        this.peso = peso;
        this.preco = preco;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getPreco() {
        return this.preco;
    }
}
