public class p_31_try_catch {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;

        //without try-catch block
//        System.out.println(a/b);

        //with try-catch block
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason : ");
            System.out.println(e);
        }

    }
}
