package Test;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 21/10/20
 **/
public class VortechSimplify {

    public interface OldWayPaymentStrategy {
        double pay(double amount);
    }

    public class CashPaymentStrategy implements OldWayPaymentStrategy {
        @Override
        public double pay(double amount) {
            double serviceCharge = 5.00;
            return amount + serviceCharge;
        }
    }

    public class CreditCardStrategy implements OldWayPaymentStrategy {
        @Override
        public double pay(double amount) {
            double serviceCharge = 5.00;
            double creditCardFee = 10.00;
            return amount + serviceCharge + creditCardFee;
        }
    }

    public interface PaymentStrategy {

        //write here your solution
    }

    public static void main(String[] args) {

    }
}
