package com.xworkz.collections_crud_operations.library_mgmt.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String message){
        System.out.println(message);
    }
}
