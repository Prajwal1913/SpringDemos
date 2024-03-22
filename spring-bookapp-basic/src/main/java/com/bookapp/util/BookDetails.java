package com.bookapp.util;

import com.bookapp.model.Book;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class BookDetails {
    public List<Book> showBooks() {
        return Arrays.asList(
                new Book("Java everywhere", "James", "Technical", 101, 1000),
                new Book("History", "Basva", "GK", 102, 400),
                new Book("Geography", "Basva", "Geo", 103, 900),
                new Book("Moral Science", "Nikhil", "Moral", 104, 300),
                new Book("Physics", "George", "Science", 105, 1500)
        );
    }

}
