// The Competicao class represents a sports competition with a name, host country,
// a maximum number of participants, and a list of registered athletes.
// It includes methods to register athletes, list all participants, and highlight local athletes.

package Objetos;

import java.util.List;

public class Competicao {
    private String nomeCompeticao;    // Name of the competition
    private String pais;              // Host country of the competition
    private int maxInscritos;         // Maximum number of registered athletes (declared but not used)
    private Atleta[] atletas;         // Array to store registered athletes

    // Constructor to initialize competition name, host country, and max number of athletes
    public Competicao(String nomeCompeticao, String pais, int numeroInscritos) {
        this.nomeCompeticao = nomeCompeticao;
        this.pais = pais;
        this.atletas = new Atleta[numeroInscritos];
        this.maxInscritos = numeroInscritos;
    }

    // Registers an athlete in the first available slot in the array
    public void inscreverAtleta(Atleta atleta) {
        for (int i = 0; i < this.atletas.length; i++) {
            if (this.atletas[i] == null) {
                this.atletas[i] = atleta;
                break; // Stop after the first empty slot is filled
            }
        }
    }

    // Lists all registered athletes
    public void listarParticipantes() {
        System.out.println("___________________\nList of Participants:\n-------------------\n");

        for (int i = 0; i < this.atletas.length; i++) {
            if (atletas[i] != null)
                atletas[i].exibirAtleta(); // Calls method to display athlete details
        }
    }

    // Lists only athletes from the host country
    public void atletasDaCasa() {
        System.out.println("___________________\nHome Athletes:\n-------------------\n");

        for (int i = 0; i < this.atletas.length; i++) {
            if (atletas[i] != null && atletas[i].getPaisOrigem().equals(this.pais)) {
                atletas[i].exibirAtleta(); // Shows only if country of origin matches host country
            }
        }
    }
}
