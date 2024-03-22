package com.bookapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}

	@Autowired
	IBookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("1. All books \n 2. By Author name \n 3. By Category\n 4. By Price\n 5. By Author name and category \n ");
	        System.out.println("Please enter the choice : ");
	        int choice = sc.nextInt();
	        switch (choice){
	            case 1 :
	                System.out.println("Available books --->");
	                List<Book> books = bookService.getAll();
	                for(Book book : books){
	                    System.out.println(book);
	                }
	                break;
	            case 2 :
	                System.out.println("Enter the author name you want to search with : ");
	                String authorName = sc.next();
	                List<Book> bookByAuthor = null;
	                bookByAuthor = bookService.getByAuthorStartsWith(authorName);
	                    for(Book book : bookByAuthor){
	                        System.out.println(book);
	                }
	                break;
	            case 3 :
	                System.out.println("Enter the category you want : ");
	                String category = sc.next();
	                List<Book> bookByCategory = null;
	                    bookByCategory = bookService.getByCategory(category);
	                    for(Book book : bookByCategory){
	                        System.out.println(book);
	                    }
	                break;
	            case 4 :
	                System.out.println("Enter the book price : ");
	                int cost = sc.nextInt();
	                List<Book> bookByPrice = null;
	                    bookByPrice = bookService.getByPriceLessThan(cost);
	                    for(Book book : bookByPrice){
	                        System.out.println(book);
	                    }
	                break;
	            case 5 :
	                System.out.println("Enter the author name and category of book you want : ");
	                String auth = sc.next();
	                String cat = sc.next();
	                List<Book> bookByauthCat = null;
	                    bookByauthCat = bookService.getByAuthorContainsAndCategory(auth,cat);
	                    for(Book book : bookByauthCat){
	                        System.out.println(book);
	                    }
	                break;
//	            case 6 :
//	                System.out.println("Enter the book ID you want : ");
//	                int bookid = sc.nextInt();
//	                Book bookByID = null;
//	                    bookByID = bookService.getById(bookid);
//	                    for(Book book : bookByID){
//	                        System.out.println(book);
//	                break;
//	        }
		
	    }
	}
}
