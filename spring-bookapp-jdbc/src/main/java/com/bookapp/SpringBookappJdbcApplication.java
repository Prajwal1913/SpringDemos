package com.bookapp;

import java.util.List;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner{

	@Autowired
	private IBookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	        Scanner sc=new Scanner(System.in);
//	        Book book=new Book("Life","Basava","Moral",400);
//	        bookService.addBook(book);

		
//			 List<Book> bookList=bookService.getAll(); 
//			 for(Book book:bookList)
//				 System.out.println(book);
			 
//			 System.out.println("Enter author name"); 
//			 String author=sc.next(); List<Book>
//			 bookList1=bookService.getByAuthor(author); 
//			 for(Book book:bookList1)
//				 System.out.println(book);
			 
//			 System.out.println("Enter book category"); 
//			 String category=sc.next();
//			 List<Book> bookList2=bookService.getByCategory(category);
//			 for(Book book:bookList2)
//				 System.out.println(book);
			 			  
//			 System.out.println("Enter book price"); 
//			 double price1=sc.nextDouble();
//			 List<Book> bookList3=bookService.getByLesserprice(price1); 
//			 for(Book book3:bookList3)
//				 System.out.println(book3);
			  
//			 System.out.println("Enter author and category");
//			 String author2=sc.next();
//			 String category2=sc.next();
//			 List<Book> bookList4=bookService.getByAuthorCategory(author2,category2);
//			 for(Book book4:bookList4)
//				 System.out.println(book4);
		 
//			  System.out.println("Enter book Id"); 
//			  int id3=sc.nextInt();
//			  System.out.println(bookService.getById(id3));
			
		
	}

}
