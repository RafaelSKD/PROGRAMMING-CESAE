package FichasPraticas.FichaPratica3.Ex02.Strategy;

public class FlatDiscountStrategy implements DiscountStrategy{

    private double discountValue;

    public FlatDiscountStrategy(double discountValue) {
        this.discountValue = discountValue;
    }

    @Override
    public double discount(double valor) {
        return valor - discountValue;
    }
}
