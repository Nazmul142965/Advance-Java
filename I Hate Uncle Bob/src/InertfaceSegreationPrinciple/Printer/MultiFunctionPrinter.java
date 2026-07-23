package InertfaceSegreationPrinciple.Printer;

public class MultiFunctionPrinter implements Printer, Scanner, Fax{
    @Override
    public void print() {
        IO.println("MultiFunctionPrinter");
    }
    @Override
    public void scan() {
        IO.println("Scanning");
    }
    @Override
    public void fax() {
        IO.println("Faxing");
    }

}
