import java.util.Scanner;

public class p_32_handle_specific_Exception {
    public static void main(String[] args) {
        int marks [] = new int[3];
        marks[0] = 2;
        marks[1] = 7;
        marks[2] = 88;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int num = sc.nextInt();

        try {
            System.out.println("The value at array index enterd is "+ marks[ind]);
            System.out.println("The value of array-value/number " + marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured! " +e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured! " +e);
        }
        catch (Exception e){
            System.out.println("Other Exception occured! " +e);
        }

    }
}
