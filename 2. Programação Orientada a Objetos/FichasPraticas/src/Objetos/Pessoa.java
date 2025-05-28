package Objetos;

// The Pessoa class represents a person. It has two constructors and includes attributes from two different exercises (Ficha 1 and Ficha 2).
// Ficha 1 focuses on name, age, and height. Ficha 2 adds city, email, and phone number.

public class Pessoa {
    // Attributes from Ficha 1
    private String nome;     // Person's name
    private int idade;       // Person's age
    private double altura;   // Person's height

    // Attributes from Ficha 2
    private String cidade;   // City where the person lives
    private String email;    // Person's email
    private String telefone; // Person's phone number

    // Constructor from Ficha 1 (name, age, height)
    public Pessoa(String nome_temp, int idade_temp, Double altura_temp) {
        this.nome = nome_temp;
        this.idade = idade_temp;
        this.altura = altura_temp;
    }

    // Constructor from Ficha 2 (name, age, city, email, phone)
    public Pessoa(String nome, int idade, String cidade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters from Ficha 1
    public String getNome() {
        return this.nome;
    }

    public int getAge() {
        return this.idade;
    }

    public double getheight() {
        return this.altura;
    }

    // Method from Ficha 2 to display all personal details
    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }

    // Getter for city (used in filtering/search)
    public String getCidade() {
        return cidade;
    }
}
