package OpenClosedPrinciple.Discount;

public class VIPDiscount implements DiscountStrategy {
    @Override
    public double apply(double price) {
        return price * 0.8;
    }
}
