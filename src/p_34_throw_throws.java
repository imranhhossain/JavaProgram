class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}


public class p_34_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }


    public static int divide(int a,  int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try {
//            int c = divide(6, 0);
//            System.out.println(c);
            System.out.println("The value of area is : " + area(-1));
        }
        catch (Exception e){
            System.out.println("Exception occured! " + e.getMessage());
        }
    }
}
