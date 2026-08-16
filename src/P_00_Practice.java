abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("write");
    }

    @Override
    void refill() {
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone2 extends Telephone{
    @Override
    void ring() {
        System.out.println("ringing...");
    }
    @Override
    void lift() {
        System.out.println("lift");
    }
    @Override
    void disconnect() {
        System.out.println("disconnect....");
    }
}

public class P_00_Practice {
    public static void main(String[] args) {

        //Demonstrate Polymorphism
        Telephone telephone = new SmartPhone2();
        telephone.ring();
        telephone.lift();
        telephone.disconnect();
    }
}

