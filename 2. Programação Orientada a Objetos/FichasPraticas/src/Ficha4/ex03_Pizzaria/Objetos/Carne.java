package Ficha4.ex03_Pizzaria.Objetos;

import Ficha4.ex03_Pizzaria.Enum.OrigemProduto;
import Ficha4.ex03_Pizzaria.Enum.TiposCarne;
import Ficha4.ex03_Pizzaria.Enum.UnidadeDeMedida;

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
