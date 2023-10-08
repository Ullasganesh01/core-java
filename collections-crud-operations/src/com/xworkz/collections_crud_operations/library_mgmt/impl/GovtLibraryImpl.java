package com.xworkz.collections_crud_operations.library_mgmt.impl;

import com.xworkz.collections_crud_operations.library_mgmt.constants.BookType;
import com.xworkz.collections_crud_operations.library_mgmt.dto.BookDTO;
import com.xworkz.collections_crud_operations.library_mgmt.exception.*;
import com.xworkz.collections_crud_operations.library_mgmt.library.Library;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.Scanner;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GovtLibraryImpl implements Library {
    private String libraryName;
    private BookDTO[] books = new BookDTO[0];
    private int bookIndex;
    private int bookSize;
    private int bookId;
    private int totalSize;

    Scanner s = new Scanner(System.in);

    @Override
    public String toString() {
        return "GovtLibraryImpl{" +
                "libraryName : '" + libraryName + '\'' +
                ", books : " + Arrays.toString(books) +
                '}';
    }

    public GovtLibraryImpl(String libraryName){
        this.libraryName = libraryName;
    }

    public void options(){
        System.out.println("-------Welcome to Govt library------");
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To Add Books\n" +
                    "2 -> To Get Book Details\n" +
                    "3 -> To Delete Book\n" +
                    "4 -> To Update Book Details\n" +
                    "5 -> To Get Details of the Book\n" +
                    "6 -> Exit");
            int choice = s.nextInt();
            if (choice>0 && choice<6 ){
                switch (choice){
                    case 1 : createBooks();
                        break;
                    case 2 : getAllBooks();
                        break;
                    case 3 : deleteBook();
                        break;
                    case 4 : updateOptions();
                        break;
                    case 5 : fetchOptions();
                        break;
                }
            }else {
                break;
            }
        }
    }

    public void updateOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To Update Book Pages\n" +
                    "2 -> To Update Book Price\n" +
                    "3 -> To Update Book Publisher\n" +
                    "4 -> Exit");
            int choice = s.nextInt();
            if (choice>0 && choice<4){
                switch (choice){
                    case 1 : updateBookPages();
                        break;
                    case 2 : updateBookPrice();
                        break;
                    case 3 : updateBookPublisher();
                        break;
                }
            }else {
                break;
            }
        }
    }

    public void fetchOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To fetch book by Id\n" +
                    "2 -> To fetch books by Year\n" +
                    "3 -> To fetch books by Author\n" +
                    "4 -> To fetch book  by Publisher\n" +
                    "5 -> To fetch book titles by Book Type\n" +
                    "6 -> To fetch book price by Book Title\n" +
                    "7 -> To fetch book titles by Year of Publication\n" +
                    "8 -> Exit");
            int choice = s.nextInt();
            if (choice>0 && choice<8){
                switch (choice){
                    case 1 : fetchBookById();
                        break;
                    case 2 : fetchBooksByYear();
                        break;
                    case 3 : fetchBooksByAuthor();
                        break;
                    case 4 : fetchBookByPublisher();
                        break;
                    case 5 : fetchBookTitlesByBookType();
                        break;
                    case 6 : fetchBookPriceByBookName();
                        break;
                    case 7 : fetchBookNamesByPublishedYear();
                        break;
                }
            }else {
                break;
            }
        }
    }

    public void provideBookDetails(BookDTO book){
        book.setId(++bookId);
        s.nextLine();
        System.out.println("Enter the Title of the book : ");
        book.setBookTitle(s.nextLine().toLowerCase());

        System.out.println("Enter Author name : ");
        book.setAuthor(s.nextLine().toLowerCase());

        System.out.println("Enter the publisher name : ");
        book.setPublisher(s.nextLine().toLowerCase());

        System.out.println("Enter the book type from values below : ");
        for (BookType bookType : BookType.values()){
            System.out.print(bookType + ", ");
        }
        System.out.println();
        book.setBookType(BookType.valueOf(s.next().toUpperCase()));

        System.out.println("Enter the price : ");
        book.setPrice(s.nextDouble());

        System.out.println("Enter the published year : ");
        book.setPublishedYear(s.nextInt());

        System.out.println("Enter the no of pages : ");
        book.setNoOfPages(s.nextInt());

        System.out.println(addBooks(book));
    }

    public void createBooks(){
        System.out.println("Enter the no of books to be added : ");
        int size = s.nextInt();
        totalSize = bookSize + size;
        books = Arrays.copyOf(books,totalSize);
        for (int i=bookSize; i<totalSize; i++){
            BookDTO bookDTO = new BookDTO();
            provideBookDetails(bookDTO);
            //books[i] = bookDTO;
            bookSize++;
        }

    }
    @Override
    public String addBooks(BookDTO book){
        if (book != null){
            if (bookSize < books.length){
                books[bookIndex++] = book;
                return  "Book data has been saved\n";
            }else {
                return "No more space\n";
            }
        }else {
            return "Book is null\n";
        }
    }

    public boolean checkBookId(int id){
        boolean idFound = false;
        for (BookDTO book : books){
            if(book.getId() == id){
                 idFound = true;
            }
        }
        if (idFound){
            return true;
        }else {
            throw new BookIdNotFoundException("Book Id not found");
        }
    }

    public void deleteBook(){
        System.out.println("Enter the Book Id to be deleted : ");
        int id = s.nextInt();
        System.out.println(deleteBookById(id));
        getAllBooks();
    }

    public String deleteBookById(int id){
        int newIndex =0 ;
        if (checkBookId(id)){
            for (int i=0;i<bookIndex;i++){
                if (books[i].getId() == id){
                    System.out.println("Book to be deleted : " + books[i]);
                }else {
                    books[newIndex++] = books[i];
                }
            }
            bookIndex--;
            bookSize--;
            books = Arrays.copyOf(books,bookSize);
            return "Book with Id : " + id + " has been deleted\n";
        }
        else {
            return "Book not found\n";
        }
    }

    @Override
    public void getAllBooks(){
        if (bookIndex>0){
            System.out.println("Available books : ");
            for (BookDTO book : books){
                System.out.println(book);
            }
        }
        else {
            System.out.println("There are no books");
        }
    }

    public void fetchBookById(){
        System.out.println("Enter the Book Id : ");
        try {
            System.out.println(getBookById(s.nextInt()));
        }catch (BookIdNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override
    public BookDTO getBookById(int id){
        //try {
            if (checkBookId(id)){
                for (BookDTO book : books){
                    if (book.getId() == id){
                        return book;
                    }
                }
            }
        //}
        /*catch (BookIdNotFoundException e){
            System.out.println(e);
        }
       */
        /*
        else {
            System.out.println("Book not found");
        }
         */
        return null;
    }

    public void fetchBooksByYear(){
        System.out.println("Enter the Year of publication : ");
        try {
            System.out.println(Arrays.toString(getBooksByYear(s.nextInt())));
        }catch (BooksNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override //Using for loop dynamic initialization
    public BookDTO[] getBooksByYear(int publishedYear){
        if (publishedYear > 1800){
            int getBooksIndex = 0 ;
            for(BookDTO book : books){
                if (book.getPublishedYear() == publishedYear){
                    getBooksIndex++;
                }
            }

            if(getBooksIndex > 0 ){
                BookDTO[] getBooks = new BookDTO[getBooksIndex];
                getBooksIndex =0;
                for(int i=0;i<bookIndex;i++){
                    if (books[i].getPublishedYear() == publishedYear){
                        getBooks[getBooksIndex++] = books[i];
                    }
                }
                return getBooks;
            }
            throw new BooksNotFoundException("No Books Found");
        }
        return null;
    }

    public void fetchBooksByAuthor(){
        s.nextLine();
        System.out.println("Enter Author name : ");
        try {
            System.out.println(Arrays.toString(getBooksByAuthor(s.nextLine().toLowerCase())));
        }catch (AuthorNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override // Using Arrays.copyOf for dynamic initialization
    public BookDTO[] getBooksByAuthor(String author) throws AuthorNotFoundException {
        BookDTO[] getBooks = new BookDTO[0];
        int getBooksIndex = 0 ;
        if (author != null){
            for(int i=0;i<bookIndex;i++){
                if (books[i].getAuthor().equals(author)){
                    getBooks = Arrays.copyOf(getBooks,getBooks.length+1);
                    getBooks[getBooksIndex++] = books[i];
                }
            }
            //return getBooks;
        }
        if (getBooks.length > 0){
            return getBooks;
        }
        else {
            throw new AuthorNotFoundException("Author not found");
        }
        //return getBooks;
    }

    public void fetchBookByPublisher(){
        s.nextLine();
        System.out.println("Enter the book publisher name : ");
        try {
            System.out.println(getBookByPublisher(s.nextLine().toLowerCase()));
        }catch (BookNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override
    public BookDTO getBookByPublisher(String  publisher){
        if (publisher != null){
            for (BookDTO book : books){
                if (book.getPublisher().equals(publisher)){
                    return book;
                }
            }
            throw new BookNotFoundException("Book Not Found");
        }else {
            System.out.println("Book not found");
        }
        return null;
    }

    public void fetchBookTitlesByBookType(){
        System.out.println("Enter Book Type : ");
        for (BookType bookType : BookType.values()){
            System.out.print(bookType + ", ");
        }
        System.out.println();
        try {
            System.out.println(Arrays.toString(getBookNameByBookType(BookType.valueOf(s.next().toUpperCase()))));
        }catch (BookTitlesNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override
    public String[] getBookNameByBookType(BookType type){
        String[] getBookNames = new String[0];
        int getBooksIndex = 0 ;
            for(int i=0;i<bookIndex;i++){
                if (books[i].getBookType().equals(type)){
                    getBookNames = Arrays.copyOf(getBookNames,getBookNames.length+1);
                    getBookNames[getBooksIndex++] = books[i].getBookTitle();
                }
            }

        if (getBookNames.length > 0) {
            return getBookNames;
        }else {
            throw new BookTitlesNotFoundException("No Book titles found");
        }
    }

    public void fetchBookPriceByBookName() {
        s.nextLine();
        System.out.println("Enter Book Title : ");
        try {
            throw new BookPriceNotFoundException("Book Price not found ");
        }
        catch (BookPriceNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public double getBookPriceByBookName(String bookTitle){
        if (bookTitle!=null){
            for (BookDTO book : books){
                if (book.getBookTitle().equals(bookTitle)){
                    return book.getPrice();
                }
                else {
                    throw new BookPriceNotFoundException("Book Price not found ");
                }
            }
        }else {
            System.out.println("Book not found");
        }
        return 0;
    }

    public void fetchBookNamesByPublishedYear(){
        System.out.println("Enter Year of publication : ");
        try {
            System.out.println(Arrays.toString(getBookNamesByPublishedYear(s.nextInt())));
        }catch (BookTitlesNotFoundException e){
            e.printStackTrace();
        }

    }

    @Override
    public String[] getBookNamesByPublishedYear(int year){
        String[] getBookNames = new String[0];
        int getBooksIndex = 0 ;
        if (year > 1800){
            for(int i=0;i<bookIndex;i++){
                if (books[i].getPublishedYear() == year){
                    getBookNames = Arrays.copyOf(getBookNames,getBookNames.length+1);
                    getBookNames[getBooksIndex++] = books[i].getBookTitle();
                }
            }
            if (getBookNames.length > 0)
                return getBookNames;
            else
                throw new BookTitlesNotFoundException("Book titles not found");
        }else {
            System.out.println("Not found");
        }
        return getBookNames;
    }

    public void updateBookPages(){
        s.nextLine();
        System.out.println("Enter the Title of the Book : ");
        String title = s.nextLine().toLowerCase();
        System.out.println("Enter the No of Pages to be updated : ");
        int pages = s.nextInt();
        if (updateBookPagesByBookName(title,pages)){
            System.out.println("Updated");
        }
        else {
            System.out.println("Not updated");
        }
    }

    @Override
    public boolean updateBookPagesByBookName(String bookTitle,int pages){
        if (bookTitle != null && pages > 0){
            for (int i=0;i<bookIndex;i++){
                if (books[i].getBookTitle().equals(bookTitle)){
                    books[i].setNoOfPages(pages);
                    return true;
                }
            }
        }
        return false;
    }

    public void updateBookPrice(){
        s.nextLine();
        System.out.println("Enter the Title of the Book : ");
        String title = s.nextLine().toLowerCase();
        System.out.println("Enter the price to be updated : ");
        double price = s.nextInt();
        if (updateBookPriceByBookName(title,price)){
            System.out.println("Updated");
        }
        else {
            System.out.println("Not updated");
        }
    }

    @Override
    public boolean updateBookPriceByBookName(String bookTitle,double price){
        if (bookTitle != null && price > 0){
            for (int i=0;i<bookIndex;i++){
                if (books[i].getBookTitle().equals(bookTitle)){
                    books[i].setPrice(price);
                    return true;
                }
            }
        }
        return false;
    }

    public void updateBookPublisher(){
        s.nextLine();
        System.out.println("Enter the Author : ");
        String author = s.nextLine().toLowerCase();
        System.out.println("Enter the Publisher to be updated : ");
        String publisher = s.nextLine().toLowerCase();
        if (updatePublisherByAuthor(author,publisher)){
            System.out.println("Updated");
        }
        else {
            System.out.println("Not updated");
        }
    }

    @Override
    public boolean updatePublisherByAuthor(String author,String publisher){
        boolean isUpdated=false;
        if (author != null && publisher != null){
            for (int i=0;i<bookIndex;i++){
                if (books[i].getAuthor().equals(author)){
                    books[i].setPublisher(publisher);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }
}
