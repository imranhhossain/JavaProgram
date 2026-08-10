import java.util.Random;
import java.util.Scanner;

public class p_14_Exercise_RPC {
    public static void main(String[] args) {
     /*
     * 0=Rock
     * 1=paper
     * 2=Scissor
     * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Rock\n" +
                           "Enter 1 for paper\n" +
                           "Enter 2 for Scissor");
        int userInput = sc.nextInt();
        if (userInput == 0) {
            System.out.println("You Chose Rock");
        } else if (userInput == 1) {
            System.out.println("You Chose Paper");
        }
        else if (userInput == 2) {
            System.out.println("You Chose Scissor");
        }
        else {
            System.out.println("Invalid Input");
        }

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Win!!");
        }


        if (computerInput == 0) {
            System.out.println("Computer Chose Rock");
        }
        else if (computerInput == 1) {
            System.out.println("Computer Chose Paper");
        }
        else {
            System.out.println("Computer Chose Scissor");
        }

    }
}
