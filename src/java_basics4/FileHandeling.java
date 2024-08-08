package java_basics4;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileHandeling {
    public static void main(String[] args) {
//        File file = new File("mayur.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            FileWriter fileWriter = new FileWriter("mayur.txt");
//            fileWriter.write("This is the first statement!!\n okay now byee");
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            File file = new File("mayur.txt");
//            Scanner sc= new Scanner(file);
//            while (sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        File myfile = new File("mayur.txt");
        if(myfile.delete()){
            System.out.println("File is deleted!");

        }else{
            System.out.println("Some Error occured!");
        }



    }
}
