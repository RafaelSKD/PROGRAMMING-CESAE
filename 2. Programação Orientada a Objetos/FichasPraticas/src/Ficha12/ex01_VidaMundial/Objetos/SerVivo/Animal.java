package Ficha12.ex01_VidaMundial.Objetos.SerVivo;

import Ficha12.ex01_VidaMundial.Enums.DietaAnimal;

public class Animal extends SerVivo{
    private boolean fome;
    private double peso; // em kg
    private double inteligencia; // (0-100)
    private DietaAnimal dieta; // Carnívoro, Herbívoro, Omnívoro
    private String barulho; // do animal

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, double inteligencia, DietaAnimal dieta, String barulho) {
        super(nome, especie, pais, idade);
        if (inteligencia < 0 || inteligencia > 100) {
            throw new IllegalArgumentException("O grau de inteligencia deve estar entre 0 e 100.");
        }
        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.dieta = dieta;
        this.barulho = barulho;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public boolean isFome() {
        return fome;
    }

    public double getPeso() {
        return peso;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public DietaAnimal getDieta() {
        return dieta;
    }

    public String getBarulho() {
        return barulho;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Fome: " + (fome ? "Sim" : "Não"));
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Inteligência: " + inteligencia + "/100");
        System.out.println("Dieta: " + dieta);
        System.out.println("Barulho: " + barulho);
    }
}
