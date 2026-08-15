interface Bicycle{
    void applyingBreak();
    void speedUp();
}

interface HornBicycle{
    void horn1();
    void horn2();
}

class AvonCycle implements Bicycle, HornBicycle{
    @Override
    public void applyingBreak() {
        System.out.println("Applying Break on Bicycle");
    }

    @Override
    public void speedUp() {
        System.out.println("Applying Break on Bicycle");
    }
    public void horn1(){
        System.out.println("Pee pee pee pee.....");
    }
    public void horn2(){
        System.out.println("Poo poo poo poo.....");
    }
}



public class p_23_interface {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.applyingBreak();
        c.speedUp();
        c.horn1();
        c.horn2();
    }
}
