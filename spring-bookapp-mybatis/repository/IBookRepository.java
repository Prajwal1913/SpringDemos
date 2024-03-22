package com.bookapp.repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public interface IBookRepository {
    void addBook(Book book);
    void updateBook(int bookId ,double price);
    void deleteBook(int bookId);
    Book findById(int bookId);

    List<Book> findAll();
    List<Book> findByAuthor(String author) throws BookNotFoundException;
    List<Book> findByLesserprice(double price) throws BookNotFoundException;
    List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException;
	List<Book> findByCategory(String category);


}
