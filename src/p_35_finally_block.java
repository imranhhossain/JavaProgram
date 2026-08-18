public class p_35_finally_block {

    public static int greet(){
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println("Something went wrong : " + e);
        }
        finally{ //--------> This block run on every state
            System.out.println("This is end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k =greet();
        System.out.println(k);

        int a =7;
        int b =9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println("Exception is : " + e);
                break;
            }
            finally{
                System.out.println("From finally and value of b is: " + b);
            }
            b--;
        }

    }
}
