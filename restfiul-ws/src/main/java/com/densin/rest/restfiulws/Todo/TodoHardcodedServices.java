package com.densin.rest.restfiulws.Todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

// this is services
@Service
public class TodoHardcodedServices {
	private static List<Todo> todos = new ArrayList();
	private static long idCounter = 0;
	static {
		todos.add(new Todo(++idCounter, "basharusr", "Learn about openshift", new Date(), true));
		todos.add(new Todo(++idCounter, "basharusr", "Learn about Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "basharusr", "Learn about MicroProfile", new Date(), false));
		todos.add(new Todo(++idCounter, "basharusr", "Learn about React", new Date(), false));

	}

	public List<Todo> findall() {

		return todos;
	}

	public Todo deleteById(long id) {

		Todo todo = findbyid(id);
		if (todo == null)
			return null;

		if (todos.remove(todo))
			return todo;

		return null;
	}

	public Todo Savetodo(Todo todo) {

		if (todo.getId() == -1 || todo.getId() == 0 ) {
			todo.setId(++idCounter);
			todos.add(todo);

		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}

		return todo;

	}

	public Todo findbyid(long id) {
		// TODO Auto-generated method stub
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
				// sdfgsdg
			}

		}
		return null;

	}

}
