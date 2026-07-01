public class p_06_Break_and_Continue {
    public static void main(String[] args) {
        //Break and Continue using loops

        //Break - Ending the loop
//        for (int i=0; i<=10; i++){
//            if (i==3){
//                System.out.println("Ending the loop");
//                break;
//            }
//            System.out.println("Value of i is: " + i);
//        }

        //continue - skip the value
        for (int i=0; i<=10; i++){
            if (i==2){
                System.out.println("Skip the value");
                continue;
            }
            System.out.println("Value of i is: " + i);
        }
    }
}
