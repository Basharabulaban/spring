package com.densin.rest.restfiulws.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.densin.rest.restfiulws.User.User;
public interface UserRepository extends JpaRepository<User,Long>  {  // entity you need to manage User

}
