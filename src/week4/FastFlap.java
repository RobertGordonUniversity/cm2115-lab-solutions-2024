package week4;

public class FastFlap implements IFlapBehaviour{

    @Override
    public void flapWings() {
        System.out.println("The wings are flapping fast!");
    }

    @Override
    public String getLeftWing() {
        return "<=";    
    }

    @Override
    public String getRightWing() {
        return "=>";    
    }

}
