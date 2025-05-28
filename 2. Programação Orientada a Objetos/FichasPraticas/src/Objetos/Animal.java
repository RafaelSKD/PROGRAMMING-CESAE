// The Animal class represents an animal with properties such as name, species, country of origin, weight, diet, and type.
// It includes behavior like making sounds based on the animal type and eating food from its accepted diet.

package Objetos;

import Enums.TipoAnimal; // Enum representing the animal type (e.g., MAMIFERO, AVE, REPTIL, etc.)
import java.util.Arrays;

public class Animal {
    private String nome;                // Animal's name
    private String especie;             // Species of the animal
    private String paisDeOrigem;       // Country of origin of the animal
    private double peso;               // Weight of the animal in kilograms
    private String[] alimentacao;      // Array containing acceptable food items for the animal
    private TipoAnimal tipoAnimal;     // Type of animal (e.g., mammal, bird, reptile)

    // Constructor that initializes all attributes of the animal
    public Animal(String nome, String especie, String paisDeOrigem, double peso, String[] alimentacao, TipoAnimal tipoAnimal) {
        this.nome = nome;
        this.especie = especie;
        this.paisDeOrigem = paisDeOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
        this.tipoAnimal = tipoAnimal;
    }

    // Simulates the animal making a sound based on its type
    public void fazerBarulho() {
        switch (tipoAnimal) {
            case MAMIFERO:
                System.out.println("The " + this.especie + " " + this.nome + " goes Tinoninoni.");
                break;
            case AVE:
                System.out.println("The " + this.especie + " " + this.nome + " goes Kwak Kwak.");
                break;
            case REPTIL:
                System.out.println("The " + this.especie + " " + this.nome + " goes Psssssss.");
                break;
            case ANFIBIO:
                System.out.println("The " + this.especie + " " + this.nome + " goes Brrrrrr.");
                break;
            case PEIXE:
                System.out.println("The " + this.especie + " " + this.nome + " goes Blub Blub Splash.");
                break;
        }
    }

    // Simulates the animal eating food if it is part of its accepted diet
    public void comer(String alimento, double pesoDoAlimento) {
        // Check if the food is part of the animal's diet
        if (Arrays.asList(this.alimentacao).contains(alimento)) {
            System.out.println("The " + this.especie + " " + this.nome + " ate " + pesoDoAlimento + "kg of " + alimento + ".");
            fazerBarulho(); // Animal makes its sound after eating
            System.out.println("Weight before meal: " + this.peso + "kg.");
            this.peso += pesoDoAlimento; // Increase the animal's weight
            System.out.println("Weight after meal: " + this.peso + "kg.\n");
        } else {
            // Animal refuses to eat food not in its diet
            System.out.println("The " + this.especie + " " + this.nome + " refused to eat " + alimento + ".\n...");
            System.out.println("Weight remained: " + this.peso + "kg.");
        }
    }
}
