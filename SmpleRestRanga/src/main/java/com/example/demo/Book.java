package com.example.demo;

public class Book {

	private long id;
	private String bookname;
	private String author;
	
	public Book(long id, String bookname, String author) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
