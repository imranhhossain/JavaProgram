import java.util.Scanner;

public class P_00_Practice {

    static void mul(int a){
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",a,i,a*i);
        }
    }

    static void strPtrn(int a){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static int sum(int a){
        int sum = 0;
        for(int i=1; i<=a; i++){
            sum += i;
        }
        return sum;
    }

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static void revPtrn(int n){

        for (int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

    }
    
    
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    static int avg(int ...arr){
        int sum = 0;
        int l = arr.length;
        for(int i=0; i<l; i++){
            sum+=arr[i];
            System.out.printf("The value of %d is : %d \n", i, arr[i]);
        }
        return sum/l;
    }


    static void strRec(int n){
        if (n>0){
            strRec(n-1);
            for (int i=1; i<=n; i++){
                System.out.print("*");
            }
                System.out.println();
        }

    }
    
    static float temConvert(int c){
        float f = 0;
        f =  (c * ((float) 9 /5)) + 32;
        return f;
    }



    public static void main(String[] args) {
//        Practice 1 Method of multiplication table
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number for a multiplication");
//        int n = sc.nextInt();
//
//        mul(n);

        //practice 2 -Print star pattern
//        int n= 4;
//        strPtrn(n);

        //practice 3
//        int n=4;
////        sum(n);
//        System.out.println("The Value of sum is : " +  sum(n));
//        //another way of practice 3
//        int c= sumRec(4);
//        System.out.println("The Value of sum is : " +  c);


        //practice4 reverse star pattern
//        revPtrn(4);
        
        
        //practice 5 -Fibonacci

//        System.out.println("The value of fibonacci is : "+ fib(5));

        //practice 5- Calculate average of pass as argument
//        int result= avg(1,2,3,4,5);
//
//        System.out.println("The average value of passing argument is : " +  result);


        //practice 6 -repeat 4 using recursion

//        strRec(4);

        //practice 7- convert Celsius to Fahrenheit

        float result = temConvert(99);
        System.out.println("The result is : " + result);

    }
}

