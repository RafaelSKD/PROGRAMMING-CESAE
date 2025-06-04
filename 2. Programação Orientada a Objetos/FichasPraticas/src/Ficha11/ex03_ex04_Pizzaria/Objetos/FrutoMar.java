package Ficha11.ex03_ex04_Pizzaria.Objetos;

import Ficha11.ex03_ex04_Pizzaria.Enum.OrigemProduto;
import Ficha11.ex03_ex04_Pizzaria.Enum.TiposFrutoMar;
import Ficha11.ex03_ex04_Pizzaria.Enum.UnidadeDeMedida;

public class FrutoMar extends Topping {
    private TiposFrutoMar frutoMar;

    public FrutoMar(int codigo, String nome, UnidadeDeMedida unidadeMedida, double kcalPorUnidadeMedida, double quantidade, OrigemProduto origem, TiposFrutoMar frutoMar) {
        super(codigo, nome, unidadeMedida, kcalPorUnidadeMedida, quantidade, origem);
        this.frutoMar = frutoMar;
    }

    public TiposFrutoMar getTipo() {
        return this.frutoMar;
    }
}