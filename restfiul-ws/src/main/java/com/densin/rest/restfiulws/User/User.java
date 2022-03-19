package com.densin.rest.restfiulws.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String role;


	protected User() { // default constrtctor expected from jpa

	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

}
