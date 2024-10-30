package week4;

public class Dog implements IWalk{

    private IFourLeggedBehaviour walkBehaviour;

    public Dog(IFourLeggedBehaviour walkBehaviour){
        this.walkBehaviour = walkBehaviour;
    }

    @Override
    public void walk() {
        this.walkBehaviour.walk();
    }

}
