package week4;

public class FourLegs implements IFourLeggedBehaviour{

    @Override
    public void walk() {
       System.out.println("The four-legged animal is walking!");
    }

    @Override
    public String getFrontLeftLeg() {
        return "Front left leg";
    }

    @Override
    public String getFrontRightLeg() {
        return "Front right leg";    
    }

    @Override
    public String getRearLeftLeg() {
        return "Rear left leg";    
    }

    @Override
    public String getRearRightLeg() {
        return "Rear right leg";    
    }

}
