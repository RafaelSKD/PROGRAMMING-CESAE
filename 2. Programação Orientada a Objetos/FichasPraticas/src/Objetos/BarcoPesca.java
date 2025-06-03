package Objetos;

import Enums.MarcaBarco;

import java.util.ArrayList;

/**
 * Represents a fishing boat with attributes like name, color, year of manufacture,
 * crew size, cargo capacity, brand, and lists for caught fish and seafood.
 */
public class BarcoPesca {

    // Basic attributes
    private String nome;              // Name of the boat
    private String cor;               // Color of the boat
    private String anoFabrico;        // Year of manufacture
    private int tripulacao;           // Number of crew members
    private double capacidadeCarga;   // Maximum cargo capacity in kilograms
    private MarcaBarco marca;         // Brand of the boat
    private ArrayList<Peixe> peixesPescados = new ArrayList<>();   // List of caught fish
    private ArrayList<Marisco> mariscoPescado = new ArrayList<>(); // List of caught seafood

    /**
     * Constructor to initialize a fishing boat with all attributes.
     *
     * @param nome            boat name
     * @param cor             boat color
     * @param anoFabrico      year of manufacture
     * @param tripulacao      number of crew members
     * @param capacidadeCarga maximum load capacity in kilograms
     * @param marca           brand of the boat
     */
    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga, MarcaBarco marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
    }

    // Returns the name of the boat
    public String getNome() {
        return nome;
    }

    // Attempts to add a fish to the catch, only if within the load limit
    public void pescarPeixe(Peixe peixe) {
        if ((this.cargaAtual() + peixe.getPeso()) <= this.capacidadeCarga){
            this.peixesPescados.add(peixe);
            System.out.println("\nBoa! acabaste de pescar " + peixe.getEspecie());
        }
        else
            System.out.println("\n" + peixe.getEspecie() + " muito pesado! Carga excedida! \nLibertar Peixe...");
    }

    // Attempts to add seafood to the catch, only if within the load limit
    public void pescarMarisco(Marisco marisco) {
        if ((this.cargaAtual() + marisco.getPeso()) <= this.capacidadeCarga){
            this.mariscoPescado.add(marisco);
            System.out.println("\nBoa! acabaste de pescar " + marisco.getEspecie());
        }
        else
            System.out.println("\n" + marisco.getEspecie() + " muito pesado! Carga excedida! \nLibertar Marisco...");
    }

    /**
     * Calculates and returns the current total weight of all caught fish and seafood.
     *
     * @return total weight in kilograms
     */
    public double cargaAtual() {
        double total = 0;

        for (Peixe peixe : this.peixesPescados) {
            total += peixe.getPeso();
        }

        for (Marisco marisco : this.mariscoPescado) {
            total += marisco.getPeso();
        }

        return total;
    }

    // Removes a fish from the list by index if the index is valid
    public void largarPeixe(int i){
        if (i >= 0 && i < this.peixesPescados.size())
            this.peixesPescados.remove(i);
        else
            System.out.println("Índice inválido para peixe.");
    }

    // Removes seafood from the list by index if the index is valid
    public void largarMarisco(int i) {
        if (i >= 0 && i < this.mariscoPescado.size())
            this.mariscoPescado.remove(i);
        else
            System.out.println("Índice inválido para marisco.");
    }

    // Calculates and returns the total monetary value of all caught fish and seafood
    public double calcularTotal(){
        double total = 0;

        for (Peixe peixe : this.peixesPescados) {
            total += peixe.getPeso() * peixe.getPreco();
        }

        for (Marisco marisco : this.mariscoPescado) {
            total += marisco.getPeso() * marisco.getPreco();
        }

        return total;
    }

    // Calculates and returns the salary per crew member (60% of total value divided equally)
    public double salarioTripulacao(){
        double salary = calcularTotal();

        salary *= 0.6; // 40% is for captain, general expenses, and maintenance costs

        salary /= this.tripulacao;

        return salary;
    }

}
