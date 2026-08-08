public class p_10_Method {

    //Method Overloading
    static void foo() {
        System.out.println("Good Morning");
    }
    static void foo(int a) {
        System.out.println("Good Morning " + a + " Jhon");
    }
    static void foo(int a, int b) {
        System.out.println("Good Morning " + (a + b) + " Jhon");
    }




    static int logic(int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else {
            z= (x+y) * 5;
        }
        return z;
    }

    int logic2(int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else {
            z= (x+y) * 5;
        }
        return z;
    }

    static void change(int [] arr){
        arr[0]=75;
    }


    public static void main(String[] args) {
        int a,b,c;
        a= 5;
        b= 7;
        c = 7;
        System.out.println(logic(a,b));
        System.out.println(logic(c,a));

        //create a class object for call not static method
        p_10_Method obj = new p_10_Method();

        int d = obj.logic(a,b);
        System.out.println(d);
        System.out.println(obj.logic2(c,a));

        int []marks = {1,2,3,4,5};
        System.out.println("The value of marks 0 element is Before calling method: " + marks[0]);
        change(marks);
        System.out.println("The value of marks 0 element is after calling method: " + marks[0]);



        //Method Overloading
        foo();
        foo(5);
        foo(12, 8);

    }
}
