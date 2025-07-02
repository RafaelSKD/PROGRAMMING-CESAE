package FichasPraticas.FichaPratica3.Ex02.Strategy;

public class NoDiscountStrategy implements DiscountStrategy{
    @Override
    public double discount(double valor) {
        return valor;
    }
}
