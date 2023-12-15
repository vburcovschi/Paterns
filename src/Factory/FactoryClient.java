package Factory;

public class FactoryClient {
    public static void main(String[] args) {
        // Использование factory для создания способа оплаты с помощью Credit Card и PayPal
        Payment creditCardPayment = PaymentFactory.createPayment(PayMethod.CREDIT_CARD);
        creditCardPayment.processPayment();

        Payment payPalPayment = PaymentFactory.createPayment(PayMethod.PAYPAL);;
        payPalPayment.processPayment();
    }
}
