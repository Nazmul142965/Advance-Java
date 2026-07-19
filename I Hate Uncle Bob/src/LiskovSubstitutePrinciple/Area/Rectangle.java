package LiskovSubstitutePrinciple.Area;

public class Rectangle implements Shape {
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public int area(){
        return (int) (width * height);
    }


}
