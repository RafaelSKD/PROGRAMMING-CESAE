package Objetos;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private String name; // Name of the draw
    private String award; // Prize for the winner
    private ArrayList<Pessoa> participants = new ArrayList<>(); // List to store eligible participants

    /**
     * Constructs a new Sorteio (draw) with a given name and prize.
     *
     * @param name  the name of the draw
     * @param award the prize to be awarded to the winner
     */
    public Sorteio(String name, String award) {
        this.name = name;
        this.award = award;
    }

    /**
     * Registers one or more participants in the draw.
     * Only individuals aged 18 or older will be added.
     *
     * @param pessoas one or more Pessoa objects to register
     */
    public void inscreverParticipante(Pessoa... pessoas) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAge() >= 18) {
                this.participants.add(pessoa); // Add participant if age is 18 or older
                System.out.println(pessoa.getNome() + " foi adicionado com sucesso à lista de participantes.");
            } else {
                System.out.println(pessoa.getNome() + " ainda é menor de idade (" + pessoa.getAge() + " anos).");
            }
        }
    }

    /**
     * Randomly selects and announces the winner of the draw.
     * If no participants are registered, prints a message instead.
     */
    public void sortear() {
        Random rd = new Random();
        if (!this.participants.isEmpty()) {
            int ramdomWinner = rd.nextInt(this.participants.size()); // Generate random index
            Pessoa winner = this.participants.get(ramdomWinner); // Select the winner
            System.out.println("\nO vencedor do sorteio " + this.name + " e: " + winner.getNome() + " com o premio: " + this.award);
        } else {
            System.out.println("\nNenhum participante inscrito para o sorteio.");
        }
    }

    /**
     * Prints the list of registered participants along with their details.
     * If no participants are registered, prints a message instead.
     */
    public void imprimirParticipantes() {
        int i = 1;
        if (!this.participants.isEmpty()) {
            System.out.println("\n\nLista de participantes do sorteio " + this.name + ":\n");
            for (Pessoa participante : this.participants) {
                System.out.println("Participante " + i + ": " + participante.getNome() + " | " + participante.getAge() + " | " + participante.getTelefone() + " | " + participante.getEmail());
                i++;
            }
        } else {
            System.out.println("\nNenhum participante inscrito.");
        }
    }
}
