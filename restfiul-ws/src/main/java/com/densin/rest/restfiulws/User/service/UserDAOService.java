package com.densin.rest.restfiulws.User.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.densin.rest.restfiulws.User.UserC;


@Repository
@Transactional
// Command line Runner
// persistent
//User jill = new User("Jack",

public class UserDAOService {
	@PersistenceContext
	
private EntityManager entityManager;
public long insert (UserC user) {
	// open Transacton 
	entityManager.persist(user);  // make change
	// close transaction
	return user.getId();
}

}
