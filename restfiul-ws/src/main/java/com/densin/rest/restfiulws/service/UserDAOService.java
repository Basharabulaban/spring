package com.densin.rest.restfiulws.service;

import javax.persistence.EntityManager;

import com.densin.rest.restfiulws.User.User;

public class UserDAOService {
private EntityManager entityManager;
public long insert (User user) {
	
	entityManager.persist(user);
	return user.getId();
}

}
