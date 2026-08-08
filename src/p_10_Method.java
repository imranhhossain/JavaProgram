public class p_10_Method {
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


    }
}
