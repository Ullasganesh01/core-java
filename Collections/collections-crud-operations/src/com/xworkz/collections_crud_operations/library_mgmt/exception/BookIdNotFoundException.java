package com.xworkz.collections_crud_operations.library_mgmt.exception;
//Custom unchecked Exception
public class BookIdNotFoundException extends RuntimeException{
    public BookIdNotFoundException(String errorMessage){
        //System.out.println(errorMessage);
        System.out.println(errorMessage);
    }

    @Override
    public String toString() {
        return "Book id not found";
    }
}
