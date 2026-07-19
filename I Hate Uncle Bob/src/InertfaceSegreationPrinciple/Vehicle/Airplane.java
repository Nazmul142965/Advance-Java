package InertfaceSegreationPrinciple.Vehicle;

public class Airplane implements Fly{
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
