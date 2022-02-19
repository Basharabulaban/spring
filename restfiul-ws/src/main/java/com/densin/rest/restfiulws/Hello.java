package com.densin.rest.restfiulws;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins="http://localhost:4200")     // ythis to advise spring to allow recieve request from http://localhost:4200

public class Hello {
	
	@RequestMapping(method=RequestMethod.GET, path="hi")
	
	public String hi() {
		return "HI";
		
	}
	
	@GetMapping( path="hello")
	public String his() {
		return "hello";
		
	}
	@GetMapping( path="hello-world-been")
	public HellowWorldBean hellowWorldBean() {
		return  new HellowWorldBean("Hello World bean");
		
	}
	
	@GetMapping( path="hello-world-path-variable/{name}")
	public HellowWorldBean hellowWorldBean(@PathVariable String name) {
		return  new HellowWorldBean(String.format("Hello World,%s",name));
		
	}

}
