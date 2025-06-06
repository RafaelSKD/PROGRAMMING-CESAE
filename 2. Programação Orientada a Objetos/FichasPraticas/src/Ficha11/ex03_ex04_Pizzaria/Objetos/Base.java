package Ficha11.ex03_ex04_Pizzaria.Objetos;

import Ficha11.ex03_ex04_Pizzaria.Enum.PizzaBase;
import Ficha11.ex03_ex04_Pizzaria.Enum.UnidadeDeMedida;

public class Base extends IngredientePizza {
    private PizzaBase base;

    public Base(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida, double quantidade, PizzaBase base) {
        super(codigo, nome, unidadeMedida, kcalPorUnidadeMedida, quantidade);
        this.base = base;
    }

    public PizzaBase getBase() {
        return base;
    }
}
