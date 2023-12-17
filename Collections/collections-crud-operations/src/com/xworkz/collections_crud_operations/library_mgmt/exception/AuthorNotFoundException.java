package com.xworkz.collections_crud_operations.library_mgmt.exception;
// custom checked Exception
public class AuthorNotFoundException extends Exception{
    public AuthorNotFoundException(String message){
        System.out.println(message);
    }
}
