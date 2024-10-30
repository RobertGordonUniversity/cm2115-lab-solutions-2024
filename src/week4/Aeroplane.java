package week4;

public class Aeroplane implements IFly {

    private IEngine engine;

    public Aeroplane(IEngine engine){
        this.engine = engine;
    }

    @Override
    public void fly() {
        engine.giveThrust();
    }

}
