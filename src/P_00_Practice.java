import java.util.Scanner;

public class P_00_Practice {
    public static void main(String[] args) {

        //Program 1
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your marks in Bangla :");
//        int bangla = sc.nextInt();
//        System.out.println("Enter your marks in English :");
//        int english = sc.nextInt();
//        System.out.println("Enter your marks in Math :");
//        int math = sc.nextInt();
//
//        int total = bangla + english + math;
//        float avg  = total/3.0f;
//        System.out.println(avg);
//
//        if(avg>40 && bangla>33 && english>33 && math>33){
//            System.out.println("You are pass and Your total marks is :" + total);
//        }
//        else {
//            System.out.println("You are fail and try again!");
//        }

        //Program 2
//        Scanner sc=  new Scanner(System.in);
//        float tax = 0;
//        System.out.println("Enter Your Income per Annum: ");
//        int income = sc.nextInt();
//
//        if (income <= 250000){
//            tax = tax + 0;
//            System.out.println("Don't need to pay tax!");
//        }
//        else if (income <= 500000){
//            tax = tax + 0.05f * (income - 250000);
//            System.out.println("You are under 5% tax and Your tax is :" + tax);
//        }
//        else if (income <= 1000000){
//            tax = tax + 0.05f * (income - 250000);
//            tax = tax + 0.10f * (income - 250000);
//            System.out.println("You are under 10% tax and Your tax is :" + tax);
//        }
//        else {
//            tax = tax + 0.05f * (income - 250000);
//            tax = tax + 0.10f * (income - 250000);
//            tax = tax + 0.15f * (income - 250000);
//            System.out.println("You are under 15% tax and Your tax is :" + tax);
//
//        }

        //program 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of day");
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Saturday");
//            case 2 -> System.out.println("Sunday");
//            case 3 -> System.out.println("Monday");
//            case 4 -> System.out.println("Tuesday");
//            case 5 -> System.out.println("Wednesday");
//            case 6 -> System.out.println("Thursday");
//            case 7 -> System.out.println("Friday");
//            default -> System.out.println("Invalid Input");
//        }

        //program 4
//        Scanner sc = new Scanner(System.in);
//        String website = sc.nextLine();
//
//        if (website.endsWith(".org")){
//            System.out.println("This is an organizational Website");
//        }
//        else if (website.endsWith(".com")){
//            System.out.println("This is an Commercial Website");
//        }
//        else if (website.endsWith(".in")){
//            System.out.println("This is an Indian Website");
//        }

        //program 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check : ");
        int year = sc.nextInt();

        if(year%4== 0 && year%100 != 0 || year%400== 0){
            System.out.println("Its a leap year");
        }
        else {
            System.out.println("Its not leap year");
        }

    }
}

