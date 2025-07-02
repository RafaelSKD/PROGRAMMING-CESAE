package FichasPraticas.FichaPratica3.Ex03.ShippingStrategy;

public class ExpressShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double peso) {
        return peso * 10;
    }
}
