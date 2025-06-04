package Ficha11.ex03_ex04_Pizzaria.Objetos;

import Ficha11.ex03_ex04_Pizzaria.Enum.OrigemProduto;
import Ficha11.ex03_ex04_Pizzaria.Enum.UnidadeDeMedida;

public class Topping extends IngredientePizza {
    private OrigemProduto origem;

    public Topping(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida, double quantidade, OrigemProduto origem) {
        super(codigo, nome, unidadeMedida, kcalPorUnidadeMedida, quantidade);
        this.origem = origem;
    }
}
