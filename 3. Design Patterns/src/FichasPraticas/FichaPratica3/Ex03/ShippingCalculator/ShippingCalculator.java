package FichasPraticas.FichaPratica3.Ex03.ShippingCalculator;

import FichasPraticas.FichaPratica3.Ex02.Strategy.DiscountStrategy;
import FichasPraticas.FichaPratica3.Ex03.ShippingStrategy.ShippingStrategy;

public class ShippingCalculator {

    private ShippingStrategy SS;

    public ShippingCalculator(ShippingStrategy ss) {
        SS = ss;
    }


    public double calculateShippingCost(double valor){
        return SS.calculateShippingCost(valor);
    }
}
