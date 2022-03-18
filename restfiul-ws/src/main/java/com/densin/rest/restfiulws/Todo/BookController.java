package com.densin.rest.restfiulws.Todo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Autowired
	private Bookservice booksvc;
	
	@CrossOrigin
	@GetMapping("/book")

	public List<Book> getAllBooks() throws InterruptedException { // throws
																								// InterruptedException

		 Thread.sleep(1000);

		return booksvc.findall();
	}

}
