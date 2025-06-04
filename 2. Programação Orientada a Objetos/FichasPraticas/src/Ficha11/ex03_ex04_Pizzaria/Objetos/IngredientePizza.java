package Ficha11.ex03_ex04_Pizzaria.Objetos;

import Ficha11.ex03_ex04_Pizzaria.Enum.UnidadeDeMedida;

public class IngredientePizza extends Ingrediente{
    double quantidade;

    public IngredientePizza(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida, double quantidade) {
        super(codigo, nome, unidadeMedida, kcalPorUnidadeMedida);
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getKcalIngrediente() {
        return this.quantidade * this.getKcalPorUnidadeMedida();
    }
}
