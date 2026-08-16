interface MyCamera2{
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
interface MyWifi2{
    String [] gettingNetworks();
    void connectedToWifi(String name);
}
class mySellPhone2{
    void callNumber(int number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }
}

class MySmartPhone2 extends mySellPhone2 implements MyCamera2, MyWifi2{
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


public class p_26_Polymorphism {
    public static void main(String[] args) {
        MyCamera2 myCamera = new MySmartPhone2(); //You can use only MyCamera2 methods
        myCamera.record4KVideo();
        myCamera.takeSnap();
//        myCamera.gettingNetworks() //Other class methods not allowed
    }
}
