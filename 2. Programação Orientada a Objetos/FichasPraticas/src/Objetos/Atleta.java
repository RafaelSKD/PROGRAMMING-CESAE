// The Atleta class represents an athlete, storing personal and professional details
// such as name, sport (modality), height, weight, country of origin, and world ranking.
// It includes a method to display the athlete's information.

package Objetos;

public class Atleta {
    private String nome;            // Athlete's name
    private String modalidade;      // Sport or modality the athlete competes in
    private double altura;          // Athlete's height in meters
    private double peso;            // Athlete's weight in kilograms
    private String paisOrigem;      // Country of origin
    private int rankingMundial;     // Athlete's world ranking

    // Constructor to initialize all attributes of the athlete
    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem, int rankingMundial) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
        this.rankingMundial = rankingMundial;
    }

    // Displays all information about the athlete in a formatted way
    public void exibirAtleta() {
        System.out.println("===================");
        System.out.println("Name: " + this.nome);
        System.out.println("Sport: " + this.modalidade);
        System.out.println("Height: " + this.altura + " m");
        System.out.println("Weight: " + this.peso + " kg");
        System.out.println("Country of Origin: " + this.paisOrigem);
        System.out.println("World Ranking: " + this.rankingMundial);
        System.out.println("===================\n");
    }

    // Returns the country of origin of the athlete
    public String getPaisOrigem() {
        return paisOrigem;
    }
}
