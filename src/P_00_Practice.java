import java.util.Scanner;

public class P_00_Practice {
    public static void main(String[] args) {

        //practice 1
//        float [] ary = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum= 0;
//        for (int i = 0; i<ary.length; i++){
//            sum+=ary[i];
//        }
//
//        System.out.printf("The sum is %.2f",sum);
//

        //practice 2
//        float [] ary = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        boolean isInArray = false;
//        float num = 62.4f;
//        for (float element: ary){
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else {
//            System.out.println("the value is not present in the array");
//        }


        //practice 3
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum= 0;
//        for (int i = 0; i<marks.length; i++){
//            sum+=marks[i];
//        }
//
//        System.out.printf("The value of average marks  is %.2f", sum/marks.length);

        //practice 4 -matrix addition

//        int [][]mat1 = {{1,2,3},
//                        {4,5,6}};
//        int [][]mat2 = {{2,4,13},
//                        {3, 7,1}};
//        int [][]result = {{0,0,0},
//                          {0,0,0}};
//
//
//        for (int i= 0; i<mat1.length; i++){
//            for (int j= 0; j<mat1[i].length; j++){
//                System.out.printf("mat1[%d][%d] + mat2[%d][%d] = %d ", i,j, i, j, mat1[i][j] + mat2[i][j]);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println();
//        }
//
//        System.out.println("Final result");
//
//        for (int i= 0; i<mat1.length; i++){
//            for (int j= 0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }


        //practice 5 - reverse an array element
//        int [] ary = {1,2,3,4,5,6};
//        int l = ary.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for( int i =0; i<n; i++){
//            temp = ary[i];
//            ary[i] = ary[l-i-1];
//            ary[l-i-1] = temp;
//        }
//
//        for (int element: ary){
//            System.out.print(" " + element);
//        }

        //practice 6 maximam element in array
//        int [] marks = {1,78,3,4,5,6};
//        int max =0;
//
//        for (int i=0; i<marks.length; i++){
//            if(marks[i]>max){
//                max = marks[i];
//            }
//        }
//
//        System.out.println("the value of maximum element is " + max);


        //practice 7 minimum element in array
//        int [] marks = {54,11,68,33,99};
//        int min = Integer.MAX_VALUE;
//        System.out.println(min);
//
//        for (int i=0; i<marks.length; i++){
//            if(marks[i]<min){
//                min = marks[i];
//            }
//        }
//
//        System.out.println("the value of minimum element is " + min);


        //practice 8
        int [] ary = {1,2,3,9,4,5,6,7};
        boolean isSorted = true;

        for (int i=0; i<ary.length-1; i++){
            if(ary[i]>ary[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is not sorted");
        }

    }
}

