package FichasPraticas.FichaPratica3.Ex02.PaymentProcessor;

import FichasPraticas.FichaPratica3.Ex02.Strategy.DiscountStrategy;

public class PaymentProcessor {
    private DiscountStrategy DS;

    public PaymentProcessor(DiscountStrategy DS) {
        this.DS = DS;
    }

    public double calculateTotal(double valor) {
        return DS.discount(valor);
    }
}
