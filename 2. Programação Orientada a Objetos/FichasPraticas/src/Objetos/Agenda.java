// The Agenda class represents an address book for storing and managing a list of people (contacts).
// It allows adding contacts, listing all contacts, and searching for contacts by city.

package Objetos;

public class Agenda {
    private int anoDeCriacao = 2025;             // Year the agenda was created (defaulted to 2025)
    private Pessoa[] listaDeContactos;           // Array to hold the list of contacts (Pessoa objects)

    // Constructor that initializes the contacts list with the given size
    public Agenda(int tamanhoDaLista) {
        this.listaDeContactos = new Pessoa[tamanhoDaLista];
    }

    // Adds a new contact (Pessoa) to the list in the first available (null) slot
    public void adicionarPessoa(Pessoa pessoa) {
        for (int i = 0; i < this.listaDeContactos.length; i++) {
            if (this.listaDeContactos[i] == null) {
                this.listaDeContactos[i] = pessoa;
                break; // Stop after adding the person to the first empty slot
            }
        }
    }

    // Lists all contacts currently stored in the agenda
    public void listarContactos() {
        System.out.println("List of contacts:");

        for (int i = 0; i < this.listaDeContactos.length; i++) {
            if (listaDeContactos[i] != null)
                listaDeContactos[i].exibirDetalhes(); // Displays details of the contact
        }
    }

    // Searches and lists contacts based on a specified city
    public void pesquisarContactos(String cidadePesquisa) {
        System.out.println("Contacts in the city of " + cidadePesquisa + ":");

        for (int i = 0; i < this.listaDeContactos.length; i++) {
            if (listaDeContactos[i] != null) {
                if (listaDeContactos[i].getCidade().equals(cidadePesquisa))
                    listaDeContactos[i].exibirDetalhes(); // Displays if city matches
            }
        }
    }
}
