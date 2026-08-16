interface Sampleinterface{
    void math1();
    void math2();
}

interface ChildSampleinterface extends Sampleinterface{
    void math3();
    void math4();
}
class MySampleClass implements ChildSampleinterface{
    @Override
    public void math1(){
        System.out.println("Math1");
    }
    @Override
    public void math2() {
        System.out.println("Math1");
    }

    @Override
    public void math3() {
        System.out.println("Math1");
    }

    @Override
    public void math4() {
        System.out.println("Math1");
    }

}


public class p_25_inheritance_interface {
    public static void main(String[] args) {
        MySampleClass mySampleClass = new MySampleClass();
        mySampleClass.math1();
        mySampleClass.math2();
        mySampleClass.math3();
        mySampleClass.math4();
    }
}
