package Ficha11.ex03_ex04_Pizzaria.Objetos;

import Ficha11.ex03_ex04_Pizzaria.Enum.OrigemProduto;
import Ficha11.ex03_ex04_Pizzaria.Enum.TiposCarne;
import Ficha11.ex03_ex04_Pizzaria.Enum.UnidadeDeMedida;

public class Carne extends Topping {
    private TiposCarne carne;

    public Carne(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida, double quantidade, OrigemProduto origem, TiposCarne carne) {
        super(codigo, nome, unidadeMedida, kcalPorUnidadeMedida, quantidade, origem);
        this.carne = carne;
    }

    public TiposCarne getTipo() {
        return carne;
    }
}
