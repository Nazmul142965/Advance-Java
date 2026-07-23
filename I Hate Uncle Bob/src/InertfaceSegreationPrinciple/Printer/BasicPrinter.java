package InertfaceSegreationPrinciple.Printer;

public class BasicPrinter implements Printer{
    @Override
    public void print() {
       IO.println("Basic Printer");
    }
}
