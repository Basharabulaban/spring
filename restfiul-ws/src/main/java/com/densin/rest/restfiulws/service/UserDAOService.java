package com.densin.rest.restfiulws.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.densin.rest.restfiulws.User.User;


@Repository
@Transactional
public class UserDAOService {
private EntityManager entityManager;
public long insert (User user) {
	// open Transacton 
	entityManager.persist(user);  // make change
	// close transaction
	return user.getId();
}

}
