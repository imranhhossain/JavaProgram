abstract class Parent{
    public Parent(){
        System.out.println("From Parent...");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child1 extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class child2 extends Parent{
    public void th(){
        System.out.println("Hello!.....");
    }
}


public class p_22_Abstract_class_and_Method {
    public static void main(String[] args) {
//        Parent p = new Child1();
//        p.sayhello();
//        p.greet();
//        p.greet2();
        Child1 c = new Child1();
        c.sayhello();
        c.greet();
        c.greet2();

    }
}
