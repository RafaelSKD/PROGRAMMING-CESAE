package Ficha2;

import Objetos.Atleta;
import Objetos.Competicao;

// The ex06 class demonstrates how to manage athletes and competitions using the Atleta and Competicao classes.
// It creates athletes, registers them in different competitions, lists participants, and highlights local athletes.

public class ex06 {
    public static void main(String[] args) {
        // Creating athlete objects
        Atleta atleta1 = new Atleta("João Silva", "Atletismo", 1.80, 75.0, "Portugal", 12);
        Atleta atleta2 = new Atleta("Maria Oliveira", "Natação", 1.70, 60.0, "Portugal", 8);
        Atleta atleta3 = new Atleta("Liam Smith", "Ciclismo", 1.78, 68.0, "Reino Unido", 15);
        Atleta atleta4 = new Atleta("Aiko Tanaka", "Judô", 1.60, 55.0, "Japão", 5);
        Atleta atleta5 = new Atleta("Carlos Méndez", "Boxe", 1.75, 70.0, "México", 10);
        Atleta atleta6 = new Atleta("Anna Müller", "Ginástica", 1.65, 50.0, "Alemanha", 3);

        // Creating two competitions with different host countries and capacities
        Competicao competicao1 = new Competicao("Olimpíadas de Verão", "Japão", 7);
        Competicao competicao2 = new Competicao("Olimpíadas de Inverno", "Portugal", 10);

        // Registering athletes to Summer Olympics
        competicao1.inscreverAtleta(atleta1);
        competicao1.inscreverAtleta(atleta2);
        competicao1.inscreverAtleta(atleta3);
        competicao1.inscreverAtleta(atleta4);
        competicao1.listarParticipantes();

        // Registering athletes to Winter Olympics
        competicao2.inscreverAtleta(atleta1);
        competicao2.inscreverAtleta(atleta2);
        competicao2.inscreverAtleta(atleta3);
        competicao2.inscreverAtleta(atleta5);
        competicao2.inscreverAtleta(atleta6);
        competicao2.listarParticipantes();

        // List home country athletes for each competition
        competicao1.atletasDaCasa();
        System.out.println();
        competicao2.atletasDaCasa();
    }
}
