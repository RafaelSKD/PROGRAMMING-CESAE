package Ficha2;

import Objetos.Agenda;
import Objetos.Pessoa;

// The ex05 class demonstrates how to use the Agenda class to manage a contact list.
// It adds contacts, lists them, and filters contacts by city.

public class ex05 {
    public static void main(String[] args) {
        // Creating Pessoa objects (contacts) with full details
        Pessoa rafael = new Pessoa("Rafael", 28, "Porto", "email@email.com", "+351 911 111 111");
        Pessoa jaquim = new Pessoa("Jaquim", 35, "Lisboa", "email2@email.com", "+351 922 111 111");
        Pessoa sofia = new Pessoa("Sofia", 28, "Porto", "email3@email.com", "+351 933 111 111");
        Pessoa zacarias = new Pessoa("Zacarias", 88, "Gaviao", "email4@email.com", "+351 944 111 111");

        // Creating an Agenda with capacity for 4 contacts
        Agenda agenda = new Agenda(4);

        // Adding initial contacts and listing them
        agenda.adicionarPessoa(rafael);
        agenda.adicionarPessoa(sofia);
        agenda.listarContactos();

        System.out.println("\n");

        // Adding remaining contacts and listing again
        agenda.adicionarPessoa(jaquim);
        agenda.adicionarPessoa(zacarias);
        agenda.listarContactos();

        System.out.println("\n");

        // Searching and displaying contacts from the city "Porto"
        agenda.pesquisarContactos("Porto");
    }
}
