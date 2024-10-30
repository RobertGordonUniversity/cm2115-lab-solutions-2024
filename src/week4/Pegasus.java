package week4;

public class Pegasus implements IWalk, IFly {

    private IFlapBehaviour wings;
    private IFourLeggedBehaviour legs;

    public Pegasus(IFlapBehaviour wings, IFourLeggedBehaviour legs){
        this.wings = wings;
        this.legs = legs;
    }

    @Override
    public void fly() {
        this.wings.flapWings();
        System.out.println("Pegasus is flying!");
    }

    @Override
    public void walk() {
        this.legs.walk();
        System.out.println("Pegasus is walking!");
    }

}
