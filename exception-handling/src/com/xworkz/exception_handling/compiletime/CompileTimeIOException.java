package com.xworkz.exception_handling.compiletime;

import java.io.File;
import java.io.IOException;

public class CompileTimeIOException {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ullas\\Desktop\\ullas1.txt"); // To create new file object in the specified path
        try{                                                                    // File is also a class in java
            if (!file.exists()){
                file.createNewFile(); // To create a file using reference
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        // Optimized code

        try{
            File f1 = new File("C:\\Users\\ullas\\Desktop\\ullas.csv");
            if (f1.createNewFile()){
                System.out.println("File created " + f1.getName());
            }
            else {
                System.out.println("Something went wrong");
            }
        }catch (IOException e){
            e.getMessage();
        }
    }
}
