package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public interface IBookService {
    void addBook(Book book);
    void updateBook(int bookId ,double price);
    void deleteBook(int BookId);

    Book getById(int bookId) throws IdNotFoundException;
    List<Book> getAll();
    List<Book> getByAuthor(String author) throws BookNotFoundException;
    List<Book> getByLesserprice(double price) throws BookNotFoundException;
    List<Book> getByAuthorCategory(String author, String category) throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException; 
}
