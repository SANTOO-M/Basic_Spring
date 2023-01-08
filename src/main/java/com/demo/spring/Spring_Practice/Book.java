package com.demo.spring.Spring_Practice;

public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
	private double price;
	
	//parameterized constructor
	public Book(int bookId, String bookName, String author, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	
	
}
