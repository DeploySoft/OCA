package Test;

import static Test.VortechSimplify.PaymentStrategy.CREDIT_CARD_FEE;
import static Test.VortechSimplify.PaymentStrategy.SERVICE_CHARGE;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 21/10/20
 **/
public class VortechSimplify {

    public interface OldWayPaymentStrategy { //Reduce
        double pay(double amount);
    }

    public class CashPaymentStrategy implements OldWayPaymentStrategy { //Reduce
        @Override
        public double pay(double amount) {
            double serviceCharge = 5.00;
            return amount + serviceCharge;
        }
    }

    public class CreditCardStrategy implements OldWayPaymentStrategy { //Reduce
        @Override
        public double pay(double amount) {
            double serviceCharge = 5.00;
            double creditCardFee = 10.00;
            return amount + serviceCharge + creditCardFee;
        }
    }

    @FunctionalInterface
    public interface PaymentStrategy {
        double SERVICE_CHARGE = 5.00;
        double CREDIT_CARD_FEE = 10.00;

        double pay(double amount);

    }

    public static void main(String[] args) {

        PaymentStrategy creditCardStrategy = amount -> amount + SERVICE_CHARGE + CREDIT_CARD_FEE;
        PaymentStrategy cashPaymentStrategy = amount -> amount + SERVICE_CHARGE;

        System.out.println(creditCardStrategy.pay(5.00));
        System.out.println(cashPaymentStrategy.pay(5.00));

    }
}
