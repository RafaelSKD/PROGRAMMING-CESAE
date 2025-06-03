package Ficha4.ex03_Pizzaria.Objetos;

import Ficha4.ex03_Pizzaria.Enum.UnidadeDeMedida;

public class Ingrediente {
    private int codigo;
    private String nome;
    private UnidadeDeMedida unidadeMedida;
    private double kcalPorUnidadeMedida;

    public Ingrediente(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.kcalPorUnidadeMedida = kcalPorUnidadeMedida;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeDeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getKcalPorUnidadeMedida() {
        return kcalPorUnidadeMedida;
    }
}
