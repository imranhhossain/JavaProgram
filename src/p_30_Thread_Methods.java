
class MyNewThr1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<1000){
            System.out.println("The Value of i is : " + i);
            try {
                Thread.sleep(55);
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
        while(j<1000){
            System.out.println("The Value of K is : " + j);
            j++;
        }
    }

}


public class p_30_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 t1 =  new MyNewThr1();
        t1.start();
        try{
        t1.join();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        MyNewThr2 t2 = new  MyNewThr2();
        t2.start();
    }
}
