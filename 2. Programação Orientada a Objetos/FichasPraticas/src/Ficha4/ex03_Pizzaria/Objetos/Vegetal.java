package Ficha4.ex03_Pizzaria.Objetos;

import Ficha4.ex03_Pizzaria.Enum.OrigemProduto;
import Ficha4.ex03_Pizzaria.Enum.TiposQueijo;
import Ficha4.ex03_Pizzaria.Enum.TiposVegetais;
import Ficha4.ex03_Pizzaria.Enum.UnidadeDeMedida;

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
