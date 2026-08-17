
class MyThreadRunnable1 implements Runnable {
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("From Thread 1................");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("From Thread 2....");
            i++;
        }
    }
}

public class p_28_Thread_using_Runnable {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        bullet1.run();
        Thread gun1 = new Thread(bullet1); //---------->Method 1
        gun1.start();
//        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(new MyThreadRunnable2()); //--------->Method 2
        gun2.start();
    }
}
