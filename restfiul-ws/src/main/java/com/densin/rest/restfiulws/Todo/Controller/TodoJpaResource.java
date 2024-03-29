package com.densin.rest.restfiulws.Todo.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.densin.rest.restfiulws.Todo.AuthenticationBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.densin.rest.restfiulws.Todo.Todo;
import com.densin.rest.restfiulws.Todo.TodoJpaRepository;
import com.densin.rest.restfiulws.Todo.service.TodoHardcodedServices;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TodoJpaResource {

	@Autowired
	private TodoHardcodedServices todoservice;

	@Autowired
	private TodoJpaRepository todoJpaRepository;

	@CrossOrigin
	@GetMapping("/jpa/basicauth") // http://localhost:8083/users/bashar/todos

	public AuthenticationBean validate_u_p() { // throws InterruptedException
		return new AuthenticationBean("You are authenticated");
	}

	private AuthenticationBean AuthenticationBean(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@CrossOrigin
	@GetMapping("/jpa/users/{username}/todos") // http://jpa/localhost:8083/users/bashar/todos

	public List<Todo> getAllTodos(@PathVariable String username) {

		System.out.println(username);

		return todoJpaRepository.findByusername(username);

	}

	@CrossOrigin
	@GetMapping("/jpa/users/{username}/todos/{id}") // http://localhost:8083/users/bashar/todos
	// http://localhost:8083/users/basharusr/todos

	//
	// solved by @PathVariable "message": "Optional int parameter 'id' is present
	// but cannot be translated into a null value due to being declared as a
	// primitive type. Consider declaring it as object wrapper for the corresponding
	// primitive type."
	public Optional<Todo> getspecficTodos(@PathVariable long id) throws InterruptedException { // throws
																								// InterruptedException

		// Thread.sleep(30000);
		return todoJpaRepository.findById(id);
		// return todoservice.findbyid(id);
	}

	// delete/users/{usename}/todos/{id}

	// deleteById
	// epresents the whole HTTP response: status code, headers, and body.
// use Talend API Tester - Free Edition
	//
	@CrossOrigin
	@DeleteMapping("/jpa/users/{username}/todos/{id}") // http://localhost:8083/jpa/users/basharusr/todos/10001
	public ResponseEntity<Void> deleteTodos(@PathVariable String username, @PathVariable long id) {

		todoJpaRepository.deleteById(id); // todoJpaRepository.delete(entity); ///todoservice.deleteById(id);

		return ResponseEntity.noContent().build();

		// return ResponseEntity.notFound().build();
	}

	@CrossOrigin
	@PutMapping("/jpa/users/{username}/todos/{id}") // http://localhost:8083/users/basharusr/todos/1
	public ResponseEntity<Todo> updateTodos(@PathVariable String username, @PathVariable long id,
			@RequestBody Todo todo) {
		todo.setUsername(username);
		
		Todo todoUpdate =todoJpaRepository.save(todo);

		return new ResponseEntity<Todo>(todo, HttpStatus.OK);

//update
	}

	@CrossOrigin
	@PostMapping("/jpa/users/{username}/todos") // http://localhost:8083/users/basharusr/todos/1
	public ResponseEntity<Void> updateTodos(@PathVariable String username, @RequestBody Todo todo) {

		// if you need to have @RequestBody then you need to have default constructor
		todo.setUsername(username);
		
		Todo createTodo = todoJpaRepository.save(todo); // todoservice.Savetodo(todo);

//Location
		// get the current resource url
		// {id}

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createTodo.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
//create
	}

}
