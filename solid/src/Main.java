//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        IO.println("Hello to Solid");

        Payment payment = new Payment();
        payment.pay("Cash");

        PaymentInterface cashPayment = new CashPayment();
        cashPayment.pay();

        PaymentInterface bkashPayment = new CashPayment();
        bkashPayment.pay();

        Switch s1 = new Switch(new AppleBulb());
        s1.press();



}

