package Ficha11.ex03_ex04_Pizzaria.Objetos;

import Ficha11.ex03_ex04_Pizzaria.Enum.OrigemProduto;
import Ficha11.ex03_ex04_Pizzaria.Enum.TiposQueijo;
import Ficha11.ex03_ex04_Pizzaria.Enum.UnidadeDeMedida;

public class Queijo extends Topping{
    private TiposQueijo queijo;

    public Queijo(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida, double quantidade, OrigemProduto origem, TiposQueijo queijo) {
        super(codigo, nome, unidadeMedida, kcalPorUnidadeMedida, quantidade, origem);
        this.queijo = queijo;
    }

    public TiposQueijo getTipo() {
        return this.queijo;
    }
}