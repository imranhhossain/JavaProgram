import java.io.*;
import java.util.Scanner;

public class p_42_File_handling {
    public static void main(String[] args) {

        //Creating a file
//        File myFile = new File("MyFile.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }

        //File Writing
//        try {
//            FileWriter fileWriter = new FileWriter("MyFile.txt");
//            fileWriter.write("Hello, Good morning.");
//            fileWriter.close();
//            System.out.println("Writing to file success");
//        } catch (IOException e) {
//            System.out.println("Error writing to file");
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }

        //File Reading
//        File file = new File("MyFile.txt");
//        try {
//        Scanner sc = new Scanner(file);
////            System.out.println(sc.nextLine());
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //File Deleting
        File myFile = new File("MyFile.txt");
        if (myFile.delete()){
            System.out.println("File deleted "+ myFile.getName());
        }
        else {
            System.out.println("File not deleted "+ myFile.getName());
        }

//        if(myFile.exists()){
//            myFile.delete();
//            if(myFile.delete()){
//                System.out.println("File deleted successfully");
//            }
//            else {
//                System.out.println("File not deleted successfully");
//            }
//        }
//        else{
//            System.out.println("File does not exist");
//        }


    }
}
