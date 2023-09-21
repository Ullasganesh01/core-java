package com.xworkz.library_mgmt.exception;

public class BookPriceNotFoundException extends RuntimeException{
    public BookPriceNotFoundException(String message){
        System.out.println(message);
    }
}
