package com.xworkz.collections_crud_operations.library_mgmt.exception;

public class BookPriceNotFoundException extends RuntimeException{
    public BookPriceNotFoundException(String message){
        System.out.println(message);
    }
}
