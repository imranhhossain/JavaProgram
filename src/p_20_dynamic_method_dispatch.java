class Phone{

    public void showTime(){
        System.out.println("Show time is 8 pm");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}

class Smartphone extends Phone{

    public void music(){
        System.out.println("Playing music...");
    }
    @Override
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
}

public class p_20_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new Smartphone();
//        Smartphone smObj = new Phone(); //Not Allowed

        obj.showTime();
        obj.on();
//        obj.music(); //Not allowed //allowed only super class object
    }
}
