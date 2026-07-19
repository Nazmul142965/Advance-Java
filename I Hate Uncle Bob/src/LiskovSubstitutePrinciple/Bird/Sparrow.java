package LiskovSubstitutePrinciple.Bird;

public class Sparrow extends Brd implements FlyingBird{


    @Override
    void eat() {

        IO.println("Sparrow eating");
    }

    @Override
    public void fly() {
        IO.println("Sparrow flying");
    }
}
