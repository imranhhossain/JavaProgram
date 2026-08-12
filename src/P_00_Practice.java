class Cylinder{
    private int height;
    private int radius;


    public Cylinder(int height, int radius){
        this.height = height;
        this.radius = radius;
    }


//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2 *Math.PI*radius*radius;
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }

}

class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }


    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class P_00_Practice {
    public static void main(String[] args) {

        //practice 1- create getter and setter for set value
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(9);
//
//        System.out.println(myCylinder.getHeight());
//        System.out.println(myCylinder.getRadius());

        //practice 2
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.Volume());

        //practice 3 - using constructor
        Cylinder myCylinder = new Cylinder(12, 9);
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.Volume());

        //practice 4
        Rectangle myRectangle = new Rectangle(12, 9);
        System.out.println(myRectangle.getLength());
        System.out.println(myRectangle.getBreadth());
    }
}

