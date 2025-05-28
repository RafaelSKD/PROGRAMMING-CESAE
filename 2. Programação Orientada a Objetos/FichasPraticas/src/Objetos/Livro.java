// The Livro class represents a book with basic bibliographic details.
// It also contains a nested static class Edificio, which represents a building with structural and location details.

package Objetos;

public class Livro {
    private String titulo;    // Title of the book
    private String autor;     // Author of the book
    private int paginas;      // Number of pages in the book
    private String isbn;      // ISBN code of the book

    // Constructor to initialize a book with all its attributes
    public Livro(String titulo, String autor, int paginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.isbn = isbn;
    }

    // Displays all the book details
    public void exibirDetalhes() {
        System.out.println("Title: " + this.titulo);
        System.out.println("Author: " + this.autor);
        System.out.println("Pages: " + this.paginas);
        System.out.println("ISBN: " + this.isbn);
    }

    // Static nested class representing a building
    public static class Edificio {
        private String nome;       // Name of the building
        private String rua;        // Street where the building is located
        private String cor;        // Color of the building
        private int andares;       // Number of floors
        private boolean garagem;   // Whether the building has a garage

        // Constructor to initialize all building attributes
        public Edificio(String nome, String rua, String cor, int andares, boolean garagem) {
            this.nome = nome;
            this.rua = rua;
            this.cor = cor;
            this.andares = andares;
            this.garagem = garagem;
        }

        // Getter for building name
        public String getNome() {
            return this.nome;
        }

        // Getter for street
        public String getRua() {
            return this.rua;
        }

        // Getter for color
        public String getCor() {
            return this.cor;
        }

        // Getter for number of floors
        public int getAndares() {
            return this.andares;
        }

        // Getter for garage availability
        public Boolean getGaragem() {
            return this.garagem;
        }

        // Setter to update color (other setters are commented out)
        public void setCor(String cor) {
            this.cor = cor;
        }

        // The following setters were commented out:
        // public void setNome(String nome) { this.nome = nome; }
        // public void setRua(String rua) { this.rua = rua; }
        // public void setAndares(int andares) { this.andares = andares; }
        // public void setGaragem(Boolean garagem) { this.garagem = garagem; }
    }
}
