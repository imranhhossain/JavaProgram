import java.util.Scanner;

public class P_00_Practice {
    public static void main(String[] args) {

        //Program 1

//        int n =4;
//        for (int i=n; i>0; i--){
//            for (int j=0; j<i; j++ ){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        //program 2
//        int sum = 0;
//        int n = 3;
//        int i = 0;
//        while(i<n){
//            sum = sum +(2*i);
//            i++;
//        }
//
//        System.out.println("Sum of even number is: "+ sum);


        //program 3
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number for multiplication : ");
//        int mul = sc.nextInt();
//
//        for (int i = 1; i<=10; i++) {
//            System.out.printf("%d X %d = %d \n", mul, i, mul*i);
//        }


        //program 5
        int factorial = 1;
        for (int i=1; i<=5; i++){
            factorial *= i;
        }

        System.out.println(factorial);
    }
}

