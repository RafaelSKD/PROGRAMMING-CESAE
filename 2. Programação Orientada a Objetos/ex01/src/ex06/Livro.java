package ex06;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private String isbn;

    public Livro(String titulo, String autor, int paginas, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.paginas);
        System.out.println("ISBN: " + this.isbn);
    }
}
