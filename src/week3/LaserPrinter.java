package week3;

public class LaserPrinter implements IPrint{

    @Override
    public void print(String text) {
        System.out.println("Printed the text: " + text);
    }
}
