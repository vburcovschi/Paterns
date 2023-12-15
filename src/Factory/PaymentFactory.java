package Factory;

public class PaymentFactory {
    public static Payment createPayment(PayMethod payMethod) {
        if (payMethod == PayMethod.CREDIT_CARD) {
            return new CreditCardPayment();
        } else if (payMethod == PayMethod.PAYPAL) {
            return new PayPalPayment();
        } else return null;
    }
}
