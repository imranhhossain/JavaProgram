import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "From toString";
    }

    @Override
    public String getMessage() {
        return "From getMessage";
    }
}


public class p_33_Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        a = sc.nextInt();
        if(a<9){
            try {
                System.out.println("The value of a is: "+ a);
//                throw new MyException();
                throw new ArithmeticException("This is an Arithmetic Exception");
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("The value of a is: "+ a);
        }
    }
}
