package Objetos;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao; // em segundos

    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public void exibirDetalhes(int i) {
        System.out.println("\nMúsica " + i + ": " + this.titulo + " | " + this.genero + " | " + this.artista + " | " + this.duracao);
    }

    public int getDuracao() {
        return duracao;
    }
}
