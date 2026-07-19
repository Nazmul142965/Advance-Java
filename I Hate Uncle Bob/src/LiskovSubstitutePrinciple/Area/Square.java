package LiskovSubstitutePrinciple.Area;

public class Square implements Shape{
    private double side;

    public int area(){
        return (int) (side * side);
    }
}
