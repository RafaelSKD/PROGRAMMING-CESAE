package Ficha3;

import Objetos.Pessoa;
import Objetos.Sorteio;

public class ex02 {
    public static void main(String[] args) {
        // Create people with name, age, phone number, and email
        Pessoa p1 = new Pessoa("João Matos", 34, "912345678", "joao.matos@email.pt");
        Pessoa p2 = new Pessoa("Inês Ferreira", 29, "913456789", "ines.ferreira@email.pt");
        Pessoa p3 = new Pessoa("Tiago Lopes", 41, "914567890", "tiago.lopes@email.pt");
        Pessoa p4 = new Pessoa("Marta Oliveira", 25, "915678901", "marta.oliveira@email.pt");
        Pessoa p5 = new Pessoa("Ricardo Sousa", 38, "916789012", "ricardo.sousa@email.pt");
        Pessoa p6 = new Pessoa("Sofia Almeida", 33, "917890123", "sofia.almeida@email.pt");
        Pessoa p7 = new Pessoa("Leonor Pinto", 16, "918901234", "leonor.pinto@email.pt"); // underage

        // Create a new draw with a name and a prize
        Sorteio sorteio = new Sorteio("Sorteio de Verão", "Viagem aos Açores");

        // Register all people into the draw (only those of legal age will be accepted)
        sorteio.inscreverParticipante(p1, p2, p3, p4, p5, p6, p7);

        // Print the list of valid participants
        sorteio.imprimirParticipantes();

        // Perform the draw and announce the winner
        sorteio.sortear();
    }
}
