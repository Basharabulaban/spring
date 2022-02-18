package com.densin.rest.restfiulws;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
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
		return  new HellowWorldBean("Hello World");
		
	}

}
