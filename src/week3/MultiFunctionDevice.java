package week3;

public class MultiFunctionDevice implements IPrint, IFax, ICopy, IScan{

    @Override
    public void scan() {
        System.out.println("Scanning the document");
    }

    @Override
    public void copy() {
        System.out.println("Copying the document");
    }

    @Override
    public void fax() {
        System.out.println("Faxing the document");
    }

    @Override
    public void print(String text) {
        System.out.println("Printing the text: " + text);
    }

}
