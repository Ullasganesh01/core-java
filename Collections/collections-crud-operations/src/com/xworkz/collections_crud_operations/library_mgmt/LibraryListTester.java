package com.xworkz.collections_crud_operations.library_mgmt;

import com.xworkz.collections_crud_operations.library_mgmt.constants.BookType;
import com.xworkz.collections_crud_operations.library_mgmt.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryListTester {
    public static void main(String[] args) {
        List<BookDTO> books = new ArrayList<>();
        books.add(new BookDTO(3,"let me die","daniel","sapna", BookType.CRIME,1500,2012,450));
        books.add(new BookDTO(1,"die another day","craig","mcgraw hill", BookType.CRIME,2700,2021,250));
        books.add(new BookDTO(5,"stay alive","john","sapna", BookType.CRIME,1300,2023,300));
        books.add(new BookDTO(4,"die hard","abraham","mcgraw hill", BookType.CRIME,2000,2018,500));
        books.add(new BookDTO(2,"live longer","chris","sapna", BookType.CRIME,2500,2016,200));
        System.out.println(books);
        Collections.sort(books);
        System.out.println(books);
    }
}
