package com.densin.rest.restfiulws.service;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.densin.rest.restfiulws.User.User;


@Repository

public class UserDAOService {
private EntityManager entityManager;
public long insert (User user) {
	// open Transacton 
	entityManager.persist(user);  // make change
	// close transaction
	return user.getId();
}

}
