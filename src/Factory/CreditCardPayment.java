package Factory;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Credit Card...");
    }
}
