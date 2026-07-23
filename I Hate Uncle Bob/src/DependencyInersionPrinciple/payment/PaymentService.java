package DependencyInersionPrinciple.payment;

public class PaymentService {
    private PaymentProcessor Processor;

    //dip
    public PaymentService(PaymentProcessor Processor) {

        this.Processor = Processor;
    }

    public void pay(double amount){
        Processor.process(amount);
    }
}
