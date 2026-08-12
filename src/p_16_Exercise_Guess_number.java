import java.util.Random;
import java.util.Scanner;
class Guess_game {
    private int number;
    private int inputNumber;
    private int numberGuess = 0;


    public Guess_game (){
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void takeUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number for Guess: ");
        this.inputNumber = input.nextInt();
    }

    boolean isCorrectNumber(){
        numberGuess++;
        if (this.inputNumber > this.number) {
            System.out.println("You guess higher");
            return false;
        }
        else if (this.inputNumber < this.number) {
            System.out.println("You guess lower");
            return false;
        }
        else{
            System.out.printf("You guessed the correct number! and it was %d! \nYou guessed it in %d attempts", number, numberGuess);
            return true;
        }
    }
}

public class p_16_Exercise_Guess_number {
    public static void main(String[] args) {
        Guess_game game = new Guess_game ();
        boolean b = false;

        while (!b){
            game.takeUserInput();
            b= game.isCorrectNumber();
        }

    }
}
