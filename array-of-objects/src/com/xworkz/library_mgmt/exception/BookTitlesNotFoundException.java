package com.xworkz.library_mgmt.exception;

public class BookTitlesNotFoundException extends RuntimeException{
    public BookTitlesNotFoundException(String message){
        System.out.println(message);
    }
}
