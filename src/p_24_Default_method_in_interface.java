interface MyCamera{
    void takeSnap();
    void recordVideo();

    //
    private void record8KVideo(){ //cannot accessible into other class
        System.out.println("Record 8k video");
    }

    default void record4KVideo(){ //this method can override into child class
        record8KVideo();
        System.out.println("Record 4k video From MyCamera");
    }


}
interface MyWifi{
    String [] gettingNetworks();
    void connectedToWifi(String name);
}
class mySellPhone{
    void callNumber(int number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }
}

class MySmartPhone extends mySellPhone implements MyCamera, MyWifi{
    //implement Camera
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }

    //implement Wifi
    public String [] gettingNetworks(){
        String [] networks = {"aa", "bb", "cc", "dd", "ee"};
        return networks;
    }
    public void connectedToWifi(String name){
        System.out.println("Connected to " + name);
    }

//    public void record4KVideo(){ //this method can override into child class
//        System.out.println("Record 4k video from MySmartPhone");
//    }
}


public class p_24_Default_method_in_interface {
    public static void main(String[] args) {
        MySmartPhone mySmartPhone = new MySmartPhone();
        mySmartPhone.takeSnap();
        mySmartPhone.recordVideo();
        String [] arr = mySmartPhone.gettingNetworks();
        for (String a: arr){
            System.out.println(a);
        }

        mySmartPhone.record4KVideo();

    }
}
