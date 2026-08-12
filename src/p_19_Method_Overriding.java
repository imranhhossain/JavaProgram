class A{

    public void math1(){
        System.out.println("From A");
    }
    public void math2(){
        System.out.println("From A");
    }
}

class B extends A{

    @Override
    public void math2() {
        System.out.println("Math 2 From B");
//        super.math2();
    }
    public void math3() {
        System.out.println("math 3 From B");
    }
}


public class p_19_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.math1();


        B b = new B();
        b.math2();
        b.math3();
    }
}
