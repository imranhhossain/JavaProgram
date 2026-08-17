
class MyThr extends Thread{
    MyThr(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("MyThr is running");
    }

}
class MyThr2 extends Thread{
    MyThr2(String name) {
        super(name);
    }
    @Override
    public void run() {
        while (true) {
        System.out.println(this.getName());
        }
    }

}

public class p_29_Thread_Constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("jk");
        t1.start();
        System.out.println("Thread name is "+t1.getName());
        System.out.println("Thread ID is "+t1.threadId());

        MyThr2 t0 = new MyThr2("DK1");
        MyThr2 t2 = new MyThr2("DK2");
        MyThr2 t3 = new MyThr2("DK3");
        MyThr2 t4 = new MyThr2("DK4...");
        MyThr2 t5 = new MyThr2("DK5............");
        t0.start();
        t2.start();
        t3.start();
        t4.setPriority(Thread.MIN_PRIORITY);
        t4.start();
        t5.setPriority(Thread.MAX_PRIORITY);
        t5.start();
    }
}
