package Objetos;

// The Pessoa class represents a person. It has three constructors and includes attributes from multiple exercises.
// Ficha 1 focuses on name, age, and height. Ficha 2 and 3 introduce city, email, and phone number.

public class Pessoa {
    // Attributes from Ficha 1
    private String nome;     // Person's name
    private int idade;       // Person's age
    private double altura;   // Person's height

    // Attributes from Ficha 2
    private String cidade;   // City where the person lives
    private String email;    // Person's email
    private String telefone; // Person's phone number

    /**
     * Constructor from Ficha 1.
     * Initializes name, age, and height.
     *
     * @param nome_temp   person's name
     * @param idade_temp  person's age
     * @param altura_temp person's height
     */
    public Pessoa(String nome_temp, int idade_temp, Double altura_temp) {
        this.nome = nome_temp;
        this.idade = idade_temp;
        this.altura = altura_temp;
    }

    /**
     * Constructor from Ficha 2.
     * Initializes name, age, city, email, and phone number.
     *
     * @param nome     person's name
     * @param idade    person's age
     * @param cidade   city where the person lives
     * @param email    person's email
     * @param telefone person's phone number
     */
    public Pessoa(String nome, int idade, String cidade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
    }

    /**
     * Constructor from Ficha 3.
     * Initializes name, age, phone number, and email.
     *
     * @param nome     person's name
     * @param idade    person's age
     * @param telefone person's phone number
     * @param email    person's email
     */
    public Pessoa(String nome, int idade, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters from Ficha 1

    /**
     * Gets the person's name.
     *
     * @return name
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Gets the person's age.
     *
     * @return age
     */
    public int getAge() {
        return this.idade;
    }

    /**
     * Gets the person's height.
     *
     * @return height
     */
    public double getheight() {
        return this.altura;
    }

    /**
     * Gets the person's phone number.
     *
     * @return phone number
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Gets the person's email.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Displays all available details about the person.
     */
    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }

    /**
     * Gets the person's city.
     *
     * @return city
     */
    public String getCidade() {
        return cidade;
    }
}
