import java.util.Scanner;

public class P_04_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You can drive...");
        }
        else{
            System.out.println("You cannot drive...");
        }
    }
}
