package Ficha11.ex03_ex04_Pizzaria.Objetos;

import Ficha11.ex03_ex04_Pizzaria.Enum.OrigemProduto;
import Ficha11.ex03_ex04_Pizzaria.Enum.TiposVegetais;
import Ficha11.ex03_ex04_Pizzaria.Enum.UnidadeDeMedida;

public class Vegetal extends Topping{
    private TiposVegetais vegetal;

    public Vegetal(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida, double quantidade, OrigemProduto origem, TiposVegetais vegetal) {
        super(codigo, nome, unidadeMedida, kcalPorUnidadeMedida, quantidade, origem);
        this.vegetal = vegetal;
    }

    public TiposVegetais getTipo() {
        return this.vegetal;
    }
}
