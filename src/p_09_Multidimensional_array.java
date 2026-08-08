public class p_09_Multidimensional_array {
    public static void main(String[] args) {
//        int [][] flats = new int [2][3];
//
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//
//        for (int i=0; i< flats.length; i++){
//            for (int j=0; j<flats[i].length; j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        //matrix addition

        int [][] mat1 = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int [][] mat2 = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int [][] mat3 = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int [][] result={{0,0,0},
                         {0,0,0},
                         {0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length; j++){
                result[i][j] = mat1[i][j]+mat2[i][j]+mat3[i][j];
                System.out.printf("%d ", result[i][j]);
            }
                System.out.println();
        }
    }
}
