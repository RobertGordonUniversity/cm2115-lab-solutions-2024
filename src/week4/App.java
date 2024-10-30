package week4;

public class App {
    public static void main(String[] args) {
        FastFlap flap = new FastFlap();
        Pigeon percy = new Pigeon(flap);

        percy.fly();

        FourLegs legs = new FourLegs();
        Dog fido = new Dog(legs);
        fido.walk();

        Pegasus p = new Pegasus(flap, legs);
        p.walk();
        p.fly();

        JetEngine jet = new JetEngine();
        TurbopropEngine propeller = new TurbopropEngine();

        Aeroplane boeing747 = new Aeroplane(jet);
        Aeroplane atr72 = new Aeroplane(propeller);

        boeing747.fly();
        atr72.fly();
    }
}
