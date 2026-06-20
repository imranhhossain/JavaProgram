import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //convert string to lowercase
        String str = "Imran Hossain";
        System.out.println(str.toLowerCase());

        //convert string to Uppercase
        System.out.println(str.toUpperCase());

        //replace space with underscore
        String text = "   Hello   world   ";
        System.out.println(text.replace(' ', '_'));

        //replace Word
        String letter = "Hello <|name|>, thank a lot";
        letter = letter.replace("<|name|>", "Imran");
        System.out.println(letter);
    }
}

