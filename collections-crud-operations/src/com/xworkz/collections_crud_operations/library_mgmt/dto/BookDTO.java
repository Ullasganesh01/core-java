package com.xworkz.collections_crud_operations.library_mgmt.dto;

import com.xworkz.collections_crud_operations.library_mgmt.constants.BookType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDTO implements Comparable<BookDTO>{
    private int id;
    private String bookTitle;
    private String author;
    private String publisher;
    private BookType bookType;
    private double price;
    private int publishedYear;
    private int noOfPages;

    @Override
    public String toString() {
        return "BookDTO{" +
                "id : " + id +
                ", bookTitle : '" + bookTitle + '\'' +
                ", author : '" + author + '\'' +
                ", publisher : '" + publisher + '\'' +
                ", bookType : " + bookType +
                ", price : " + price +
                ", publishedYear : " + publishedYear +
                ", noOfPages : " + noOfPages +
                '}' + "\n";
    }

    @Override
    public int compareTo(BookDTO o) {
        return this.id - o.id;
    }
}
