package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
	

	private BookDetails details;
	
	@Autowired
    public void setDetails(BookDetails details) {
		this.details = details;
	}
	
    @Override
    public List<Book> getAll() {
    	  return details.showBooks();
        
    }


	@Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books = details.showBooks();
        List<Book> newBooks = new ArrayList<>();
        for (Book book:books){
            if(book.getAuthor().startsWith(author)){
                newBooks.add(book);
            }
        }
        if(newBooks.isEmpty()){
            throw new BookNotFoundException("unable to find the  book");
        }
        return newBooks;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books = details.showBooks();
        List<Book> newCategory = new ArrayList<>();
        for (Book categories:books){
            if(categories.getCategory().equals(category)){
                newCategory.add(categories);
            }
        }
        if(newCategory.isEmpty()){
            throw new BookNotFoundException("Unable to find the category");
        }
        return newCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books = details.showBooks();
        List<Book> newPrice = new ArrayList<>();
        for (Book prices:books){
            if(prices.getPrice()<price){
                newPrice.add(prices);
            }
        }
        if(newPrice.isEmpty()){
            throw new BookNotFoundException("Price is less");
        }
        return newPrice;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = details.showBooks();
        List<Book> authCate = new ArrayList<>();
        for (Book book:books){
            if(book.getCategory().equals(category) && book.getAuthor().equals(author)){
                authCate.add(book);
            }
        }
        if(authCate.isEmpty()){
            throw new BookNotFoundException("Unable to find the author and category");
        }
        return authCate;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books = details.showBooks();
        for (Book newBook:books){
            if(newBook.getBookId()==bookId){
                return newBook;
            }
        }
            throw new IdNotFoundException("ID not found");
    }
}
