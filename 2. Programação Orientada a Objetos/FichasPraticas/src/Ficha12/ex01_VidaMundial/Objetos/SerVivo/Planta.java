package Ficha12.ex01_VidaMundial.Objetos.SerVivo;

import Ficha12.ex01_VidaMundial.Enums.FamiliaPlantas;

public class Planta extends SerVivo{
    private FamiliaPlantas familia;
    private int grauDefesa;

    public Planta(String nome, String especie, String pais, int idade, FamiliaPlantas familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        if (grauDefesa < 0 || grauDefesa > 5) {
            throw new IllegalArgumentException("O grau de defesa deve estar entre 0 e 5.");
        }
        this.familia = familia;
        this.grauDefesa = grauDefesa;
    }

    public FamiliaPlantas getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Família: " + familia);
        System.out.println("Grau de Defesa: " + grauDefesa + "/5");
    }
}
