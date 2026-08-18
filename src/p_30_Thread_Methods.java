
class MyNewThr1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("The Value of i is : " + i);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

}


class MyNewThr2 extends Thread{
    @Override
    public void run() {
        int j=0;
        while(j<100){
            System.out.println("The Value of K is : " + j);
            j++;
        }
    }

}


public class p_30_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 t1 =  new MyNewThr1();
        System.out.println(t1.getState());
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println(t1.getState());
        try{
        t1.join();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(t1.getPriority());

        MyNewThr2 t2 = new  MyNewThr2();
        t2.start();
        System.out.println(t1.getState());
    }
}
