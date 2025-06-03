package Ficha4.ex03_Pizzaria.Objetos;

import Ficha4.ex03_Pizzaria.Enum.OrigemProduto;
import Ficha4.ex03_Pizzaria.Enum.UnidadeDeMedida;

public class Topping extends IngredientePizza {
    private OrigemProduto origem;

    public Topping(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida, double quantidade, OrigemProduto origem) {
        super(codigo, nome, unidadeMedida, kcalPorUnidadeMedida, quantidade);
        this.origem = origem;
    }
}
