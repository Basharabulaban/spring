package com.densin.rest.restfiulws.Todo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

// ythis to advise spring to allow recieve request from
//// @CrossOrigin(origins = "http://localhost:8083") 											// http://localhost:4200

public class TodoResource {
	@Autowired

	private TodoHardcodedServices todoservice;
	
	
	@CrossOrigin
	@GetMapping("/basicauth") // http://localhost:8083/users/bashar/todos

	public AuthenticationBean validate_u_p(@PathVariable long id)  { // throws InterruptedException

		

		return new AuthenticationBean("You are authenticated");
	}
	
	

	private AuthenticationBean AuthenticationBean(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	@CrossOrigin
	@GetMapping("/users/{username}/todos") // http://localhost:8083/users/bashar/todos
	// http://localhost:8083/users/basharusr/todos

	public List<Todo> getAllTodos(@PathVariable String username) throws InterruptedException { // throws
																								// InterruptedException

		// Thread.sleep(30000);

		return todoservice.findall();
	}

	@CrossOrigin
	@GetMapping("/users/{username}/todos/{id}") // http://localhost:8083/users/bashar/todos
	// http://localhost:8083/users/basharusr/todos

	//
	// solved by @PathVariable "message": "Optional int parameter 'id' is present
	// but cannot be translated into a null value due to being declared as a
	// primitive type. Consider declaring it as object wrapper for the corresponding
	// primitive type."
	public Todo getspecficTodos(@PathVariable long id) throws InterruptedException { // throws InterruptedException

		// Thread.sleep(30000);

		return todoservice.findbyid(id);
	}

	// delete/users/{usename}/todos/{id}

	// deleteById
	// epresents the whole HTTP response: status code, headers, and body.
// use Talend API Tester - Free Edition
	//
	@CrossOrigin
	@DeleteMapping("/users/{username}/todos/{id}") // http://localhost:8083/users/basharusr/todos/1
	public ResponseEntity<Void> deleteTodos(@PathVariable String username, @PathVariable long id) {

		Todo todo = todoservice.deleteById(id);
		if (todo != null) {
			return ResponseEntity.noContent().build();

		}
		return ResponseEntity.notFound().build();
	}
	// edit update a todo
	// put /users/{username}/todos/{id}

	@CrossOrigin
	@PutMapping("/users/{username}/todos/{id}") // http://localhost:8083/users/basharusr/todos/1
	public ResponseEntity<Todo> updateTodos(@PathVariable String username, @PathVariable long id,
			@RequestBody Todo todo) {

		// if you need to have @RequestBody then you need to have default constructor

		Todo todoUpdate = todoservice.Savetodo(todo);
		// if (todoUpdate != null) {
		return new ResponseEntity<Todo>(todo, HttpStatus.OK);

		// }
		// return ResponseEntity.notFound().build();
	}

	@CrossOrigin
	@PostMapping("/users/{username}/todos") // http://localhost:8083/users/basharusr/todos/1
	public ResponseEntity<Void> updateTodos(@PathVariable String username, @RequestBody Todo todo) {

		// if you need to have @RequestBody then you need to have default constructor

		Todo createTodo = todoservice.Savetodo(todo);

//Location
		// get the current resource url
		// {id}

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createTodo.getId())
				.toUri();

		return ResponseEntity.created(uri).build();

	}

}
