package com.demo.spring.Spring_Practice;

public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
	private double price;
	
	//default constructor
	public Book() {
		System.out.println("Book Object Created...");
	}	

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//parameterized constructor
	/*
	 * public Book(int bookId, String bookName, String author, double price) {
	 * //super(); this();//calling default constructo... this.bookId = bookId;
	 * this.bookName = bookName; this.author = author; this.price = price; }
	 */
	



	public void display() {
		System.out.println("Book Printed..."+"\n Book Id= "+bookId+
				"\nBook Name= "+bookName+"\nAuthor= "+author+"\n Price= "+price);
		
	}
	
}
