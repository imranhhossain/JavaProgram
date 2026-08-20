
@FunctionalInterface
interface functionalInterface{
    void mathod();
//    void mathod2();
}

class NewPhone extends Phone {
    @Override
    public void showTime() {
        super.showTime();
    }
    @Deprecated
    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}

public class p_39_Annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone p = new NewPhone();
        p.showTime();

        p.sum(1, 2);
    }
}
