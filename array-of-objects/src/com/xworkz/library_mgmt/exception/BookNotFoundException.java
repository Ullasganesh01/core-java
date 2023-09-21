package com.xworkz.library_mgmt.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String message){
        System.out.println(message);
    }
}
