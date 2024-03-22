package com.bookapp.repository;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bookapp.model.Book;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setAuthor(rs.getString("author"));
		book.setBookId(rs.getInt("bookId"));
		book.setCategory(rs.getString("category"));
		book.setPrice(rs.getDouble("price"));
		book.setTitle(rs.getString("title"));
		return book;
	}

}
