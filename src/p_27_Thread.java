class Thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("From Thread 1................");
            i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("From Thread 2....");
            i++;
        }
    }
}

public class p_27_Thread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
