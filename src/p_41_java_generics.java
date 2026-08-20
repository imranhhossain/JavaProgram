class Generics<T1, B1> {
    int val1;
    T1 t1;
    B1 b1;

    public Generics(int val1, T1 t1, B1 b1) {
        this.val1 = val1;
        this.t1 = t1;
        this.b1 = b1;
    }

    public B1 getB1() {
        return b1;
    }

    public void setB1(B1 b1) {
        this.b1 = b1;
    }

    public int getVal1(){
        return this.val1;
    }
    public void setVal1(int val1){
        this.val1 = val1;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}


public class p_41_java_generics {
    public static void main(String[] args) {
        //Generics
        Generics<String, Integer> g1 = new Generics<>(5, "Hello", 51);
        System.out.println(g1.getVal1());
        System.out.println(g1.getT1());
        System.out.println(g1.getB1());
    }
}
