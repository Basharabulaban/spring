package com.densin.rest.restfiulws.Todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

// this is services
@Service
public class Bookservice {
	
	private static List<Book> books = new ArrayList();
	private static long idCounter = 0;
	static {
		books.add(new Book(1l, "book1", "Bashar"));
		books.add(new Book(2l, "book 2", "Bashar2"));
		books.add(new Book(3l, "book 3", "Bashar3"));
		books.add(new Book(4l, "book 4", "Bashar4"));


	}
	public List<Book> findall() {

		return books;
	}

}
