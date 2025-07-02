package FichasPraticas.FichaPratica3.Ex02.Strategy;

public class PercentageDiscountStrategy implements DiscountStrategy{

    private double discountPer;

    public PercentageDiscountStrategy(double discountPer) {
        this.discountPer = discountPer;
    }

    @Override
    public double discount(double valor) {
        return valor * (1 - (discountPer / 100));
    }
}
