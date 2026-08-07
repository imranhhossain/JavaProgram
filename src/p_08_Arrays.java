public class p_08_Arrays {
    public static void main(String[] args) {
        //3 type of array declaration


        //1. declaration and memory allocation
//        int [] marks= new int[5];

        //2. declaration and then memory allocation
//        int [] marks;
//        marks = new int[5];

        //Initialization
//        marks [0] = 10;
//        marks [1] = 20;
//        marks [2] = 30;
//        marks [3] = 40;
//        marks [4] = 50;

        //2. declaration, memory allocation, Initialization

        int []marks = {10, 20, 30, 40, 50};


        System.out.println(marks[4]);

        for (int i=0; i<marks.length; i++){
            System.out.printf(" marks [%d] = %d\n", i, marks[i]);
        }
    }
}
