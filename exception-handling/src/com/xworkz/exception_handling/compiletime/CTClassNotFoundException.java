package com.xworkz.exception_handling.compiletime;

public class CTClassNotFoundException {
    public static void main(String[] args) {
        try{
            Class.forName("com.xworkz.exception_handling.compiletime.CTClassNotFoundException");
            System.out.println("Class loaded"); // forName method returns Class. It used to load class into the java memory
        }catch (ClassNotFoundException e){       // It is static method of Class file. Use FQCN to load the class.
            e.printStackTrace();
            //System.out.println(e);
        }
        System.out.println("Finished");
    }
}
