package week4;

public class TurbopropEngine implements IEngine {

    @Override
    public void startEngine() {
        System.out.println("Starting the propellers!");
    }

    @Override
    public void giveThrust() {
        System.out.println("Giving thrust to the propellers!");    
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the propellers!");
    }

}
