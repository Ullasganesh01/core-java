package com.xworkz.library_mgmt.library;

import com.xworkz.library_mgmt.constants.BookType;
import com.xworkz.library_mgmt.dto.BookDTO;
import com.xworkz.library_mgmt.exception.AuthorNotFoundException;

public interface Library {
    String addBooks(BookDTO book);
    void getAllBooks();
    BookDTO getBookById(int id);
    BookDTO[] getBooksByYear(int publishedYear);
    BookDTO[] getBooksByAuthor(String author) throws AuthorNotFoundException;
    BookDTO getBookByPublisher(String publisher);
    String[] getBookNameByBookType(BookType type);
    double getBookPriceByBookName(String bookTitle);
    String[] getBookNamesByPublishedYear(int year);
    String deleteBookById(int id);
    boolean updateBookPagesByBookName(String bookTitle,int pages);
    boolean updateBookPriceByBookName(String bookTitle,double price);
    boolean updatePublisherByAuthor(String author,String publisher);
}

