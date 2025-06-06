package Ficha14.ex02_Jogo.Objetos;

import Ficha14.ex02_Jogo.Enum.Categoria;

public class Personagem extends Entidade{
    private int nivel;
    private Categoria categoria;
    private String arma;

    public Personagem(String nome, int vida, int forca, int nivel, Categoria categoria, String arma) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.categoria = categoria;
        this.arma = arma;
    }

    public int getNivel() {
        return nivel;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getArma() {
        return arma;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
