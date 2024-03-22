package com.bookapp.util;

public class Queries {
    public static final String  INSERTQUERY = "insert into Book(title,author,price,category)values(?,?,?,?)";
    public static final String  UPDATEQUERY = "update Book set price=?  where bookId=?";
    public static final String  DELETEQUERY = "delete from Book where bookId=?";

    public static final String  SELECTQUERY = "select * from Book";
    public static final String  SELECTBYAUTHORQUERY = "select * from Book where author=?";
    public static final String  SELECTBYPRICEQUERY = "select * from Book where price<?";
    public static final String  SELECTBYAUTHCATQUERY = "select * from Book where author=? and category=?";
    public static final String  SELECTBYIDQUERY = "select * from Book where  bookId=?";
    public static final String  SELECTBYCATEGORYQUERY = "select * from Book where category=?";


}
