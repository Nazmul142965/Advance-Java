package DependencyInersionPrinciple.payment;

public class PaypalPayment implements PaymentProcessor{
    @Override
    public void process(double amount) {
        System.out.println("Processing payment with PayPal: $" + amount);
    }
}
