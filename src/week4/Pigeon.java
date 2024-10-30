package week4;

public class Pigeon implements IFly{

    private IFlapBehaviour flap;

    public Pigeon(IFlapBehaviour flap){
        this.flap = flap;
    }

    @Override
    public void fly() {
        this.flap.flapWings();
        System.out.println("The pigeon is flying");
    }

}
