package week4;

public class JetEngine implements IEngine {

    @Override
    public void startEngine() {
        System.out.println("Starting the jet engine!");    
    }

    @Override
    public void giveThrust() {
        System.out.println("Giving thrust to the jet engines!");    
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the jet engine!");
    }

}
