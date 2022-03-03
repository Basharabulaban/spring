package com.densin.rest.restfiulws.helloworld;

public class HellowWorldBean {

	private String message;

	public HellowWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.setMessage(message);
				
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HellowWorldBean [message=" + message + "]";
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
