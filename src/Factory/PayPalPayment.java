package Factory;

public class PayPalPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Processing payment using PayPal...");
    }
}
