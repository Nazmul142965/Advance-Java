package OpenClosedPrinciple.Discount;

public class DiscountCalculator {
    public double calculate(double amount, DiscountStrategy strategy) {
        return strategy.apply(amount);
    }
}
