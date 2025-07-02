package FichasPraticas.FichaPratica3.Ex02;

import FichasPraticas.FichaPratica3.Ex02.PaymentProcessor.PaymentProcessor;
import FichasPraticas.FichaPratica3.Ex02.Strategy.FlatDiscountStrategy;
import FichasPraticas.FichaPratica3.Ex02.Strategy.NoDiscountStrategy;
import FichasPraticas.FichaPratica3.Ex02.Strategy.PercentageDiscountStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new NoDiscountStrategy());
        double total = paymentProcessor.calculateTotal(100.0);
        System.out.println("Total sem desconto: " + total);

        paymentProcessor = new PaymentProcessor(new FlatDiscountStrategy(10.0));
        total = paymentProcessor.calculateTotal(100.0);
        System.out.println("Total com desconto fixo: " + total);

        paymentProcessor = new PaymentProcessor(new PercentageDiscountStrategy(20));
        total = paymentProcessor.calculateTotal(100.0);
        System.out.println("Total com desconto percentual: " + total);
    }
}
