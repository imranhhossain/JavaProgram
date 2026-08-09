public class p_11_recursion {

    static  int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static  int factorial_iterative(int n){

        if(n==0 || n==1){
            return  1;
        }
        else {
            int result = 1;
            for(int i=1;i<=n; i++){
                result *=i;
            }
            return result;
        }
    }


    public static void main(String[] args) {

        int n = 5;
        System.out.println("factorial of " + n + " is " + factorial(n));
        System.out.println("factorial of " + n + " is " + factorial_iterative(n));
    }
}
