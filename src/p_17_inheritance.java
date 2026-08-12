class Base{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Set X from base");
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Set Y from base");
        this.y = y;
    }
}

class Drived extends Base{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        System.out.println("Set Z from drived class");
        this.z = z;
    }
}

public class p_17_inheritance {
    public static void main(String[] args) {

//        Base b = new Base();
//        b.setX(10);
//        System.out.println(b.getX());

        Drived d = new Drived();
        d.setX(10);
        d.setZ(10);
        System.out.println(d.getZ());
        System.out.println(d.getX());

    }

}
