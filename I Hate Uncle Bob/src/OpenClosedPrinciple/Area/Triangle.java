package OpenClosedPrinciple.Area;

public class Triangle implements Shape{
     private double base;
     private double height;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
