import java.util.Scanner;

public class p_05_elseif_Switch_Case_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

//        //else if Statement
//        if(age > 56){
//            System.out.println("You are Experienced");
//        }
//        else if (age > 45) {
//            System.out.println("You are semi Experienced");
//        }
//        else if (age > 36){
//            System.out.println("You Are less Experienced");
//        }
//        else {
//            System.out.println("You are Not Experienced");
//        }

        // Switch Statement
        switch (age){
            case 18:
                System.out.println("You are become an adult");
                break;
            case 24:
                System.out.println("You are going to join a job");
                break;
            case 65:
                System.out.println("You are going to get retired!");
            default:
                System.out.println("Enjoy your life");
        }
    }
}
