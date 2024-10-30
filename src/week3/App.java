package week3;

public class App {
    public static void main(String[] args) {
        
        LaserPrinter myPrinter = new LaserPrinter();
        sendToPrinter(myPrinter, "Hello world");

        MultiFunctionDevice device = new MultiFunctionDevice();
        
        sendToPrinter(device, "Hello again world");
        sendToFax(device);
        sendToCopy(device);
        sendToScan(device);

        SimpleScanner scanner = new SimpleScanner();
        sendToScan(scanner);
    }

    public static void sendToPrinter(IPrint printer, String text){
        printer.print(text);
    }

    public static void sendToFax(IFax faxMachine){
        faxMachine.fax();
    }

    public static void sendToCopy(ICopy copier){
        copier.copy();
    }

    public static void sendToScan(IScan scanner){
        scanner.scan();
    }


}
