package com.densin.rest.restfiulws.Todo;

public class AuthenticationBean {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public AuthenticationBean(String message) {
	super();
	this.message = message;
}


}
