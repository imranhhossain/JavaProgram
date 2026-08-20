

interface DemoAno{
    void meth1();
    void meth2();
}

@FunctionalInterface
interface DemoLambda{
    void meth1(int x);
}



public class p_40_Anonymous_class_Lambda_Expression {
    public static void main(String[] args) {


        DemoAno demoAno = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("From Meth 1");
            }

            @Override
            public void meth2() {
                System.out.println("From Meth 1");
            }
        };
        demoAno.meth1();


        //Lambda Expression
        DemoLambda demoLambda = (a) -> {
            System.out.println("From Lambda " + a);
        };
        demoLambda.meth1(5);

    }
}
