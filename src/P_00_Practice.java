import java.util.Scanner;

public class P_00_Practice {
    public static void main(String[] args) {

        int sum = 0;
        int n= 8;
        for (int i=1; i<=10; i++){
            sum = sum + (n*i);
            System.out.printf("%d x %d = %d\n", n, i, n*i);
            System.out.println(sum);
        }
    }
}

