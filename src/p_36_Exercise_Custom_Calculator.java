
class InvalidInputException  extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "From GetMessage";
    }
}
class CannotDividedByZeroException  extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by zero";
    }

    @Override
    public String getMessage() {
        return "From GetMessage";
    }
}
class MaxInputException  extends Exception {
    @Override
    public String toString() {
        return "Input can't be greater then 100000";
    }

    @Override
    public String getMessage() {
        return "From GetMessage";
    }
}
class MaxMultiplyInputException  extends Exception {
    @Override
    public String toString() {
        return "Input can't be greater then 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return "From GetMessage";
    }
}



class CustomCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a == 8 || b == 9){
            throw new InvalidInputException();
        }
        else if (a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a+b;
    }
    double subtract(double a, double b) throws InvalidInputException,MaxInputException{
        if (a == 8 || b == 9){
            throw new InvalidInputException();
        }
        else if (a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws InvalidInputException, MaxInputException, MaxMultiplyInputException{
        if (a == 8 || b == 9){
            throw new InvalidInputException();
        }
        else if (a>100000 || b>100000) {
            throw new MaxInputException();
        } else if (a>=7000 || b>=7000) {
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double divide(double a, double b) throws InvalidInputException, CannotDividedByZeroException, MaxInputException{
        if (a == 8 || b == 9){
            throw new InvalidInputException();
        }
        else if (a == 0 || b == 0) {
            throw new CannotDividedByZeroException();
        }
        else if (a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a/b;
    }
}


public class p_36_Exercise_Custom_Calculator {
    public static void main(String[] args) throws InvalidInputException, CannotDividedByZeroException, MaxInputException, MaxMultiplyInputException{
        CustomCalculator c = new CustomCalculator();
//        c.add(8,2);
//        c.subtract(5,98000);
//        c.multiply(2,8);
        c.divide(8,2);
    }
}
