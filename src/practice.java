import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // && - AND operator
        if(a && b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        // || - OR Operator
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // ! -NOT operator

        System.out.println(!a);
        System.out.println(!b);

    }
}

