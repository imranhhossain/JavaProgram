class Base1{
    Base1(){
        System.out.println("From Base1");
    }
    Base1(int x){
        System.out.println("From Base1 with value of x is : " + x);
    }
}

class Drived1 extends Base1{
    public Drived1(){
        super();
        System.out.println("From Drived1");
    }
    public Drived1(int x){
        super(x);
        System.out.println("From Drived1 with value of x is : " + x);
    }
    public Drived1(int x,int y){
        System.out.println("from Drived1 with value of x is : " + x + " and y is : " + y);
    }
}

class Chidl_of_Drived1 extends Drived1{
    public Chidl_of_Drived1(){
        System.out.println("From Chidl_of_Drived1");
    }
    public Chidl_of_Drived1(int x){
        super(14,15);
        System.out.println("From Chidl_of_Drived1 with value of x is : " + x);
    }
}


public class p_18_Constructor_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b= new Base1(12);
//        Drived1 d= new Drived1(18);

        Chidl_of_Drived1 c = new Chidl_of_Drived1(11);

    }
}
