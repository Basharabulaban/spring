package com.densin.rest.restfiulws.Book;
//test
public class Book {
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", auther=" + auther + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	long id;
	String name;
	String auther;

	public Book(long id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuther() {
		return auther;
	}

}
