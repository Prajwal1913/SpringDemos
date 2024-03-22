package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;

import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.BookRepositoryImpl;
import com.bookapp.repository.IBookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
    private IBookRepository bookRepository;
	
    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    @Override
    public void updateBook(int bookId, double price) {
        bookRepository.updateBook(bookId,price);
    }

    @Override
    public void deleteBook(int bookId) {
        bookRepository.deleteBook(bookId);
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookRepository.findAll();
        return books;
    }


    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        Book book = bookRepository.findById(bookId);
        if(book == null) {
            throw new IdNotFoundException("Book by this ID is not available");
        	}
        return book;
    }

    @Override
    public List<Book> getByAuthor(String author) throws BookNotFoundException {
        List<Book> books = bookRepository.findByAuthor(author);
        if(books.isEmpty())
            throw new BookNotFoundException("Book by this author not available");
        return books;
    }

    @Override
    public List<Book> getByAuthorCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = bookRepository.findByAuthorCategory(author,category);
        if(books.isEmpty())
            throw new BookNotFoundException("Book by this author and category is not available");
        return books;
    }

	@Override
	public List<Book> getByCategory(String category) {
		List<Book> books = bookRepository.findByCategory(category);
        if(books.isEmpty())
            throw new BookNotFoundException("Book by this category is not available");
        return books;
	}

	@Override
	public List<Book> getByLesserprice(double price) throws BookNotFoundException {
		 List<Book> books = bookRepository.findByLesserprice(price);
	        if(books.isEmpty())
	            throw new BookNotFoundException("Book lesser than this price is not available");
	        return books;
	}


}
