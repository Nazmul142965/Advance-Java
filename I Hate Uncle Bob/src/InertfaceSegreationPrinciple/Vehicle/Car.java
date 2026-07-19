package InertfaceSegreationPrinciple.Vehicle;

public class Car implements Drive{
    @Override
    public void drive() {
        IO.println("Car is driving");
    }
}
