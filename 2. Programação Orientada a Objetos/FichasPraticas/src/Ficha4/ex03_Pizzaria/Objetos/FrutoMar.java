package Ficha4.ex03_Pizzaria.Objetos;

import Ficha4.ex03_Pizzaria.Enum.OrigemProduto;
import Ficha4.ex03_Pizzaria.Enum.TiposFrutoMar;
import Ficha4.ex03_Pizzaria.Enum.UnidadeDeMedida;

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