package OpenClosedPrinciple.Discount;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double apply(double price) {
        return price * 0.9;
    }
}
