public class AllInOnePrinter implements Printer, Scanner ,PhotoCopy {
    @Override
    public void print() {
        System.out.println("Printing...");
    }



    @Override
    public void photoCopy() {
        System.out.println("Photocopying...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

//ISP - interface segregation principle
