package com.xworkz.library_mgmt.exception;

public class BooksNotFoundException extends RuntimeException{
    public BooksNotFoundException(String message){
        System.out.println(message);
    }
}
