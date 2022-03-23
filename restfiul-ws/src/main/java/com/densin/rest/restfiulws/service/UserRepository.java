package com.densin.rest.restfiulws.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.densin.rest.restfiulws.User.UserC;
public interface UserRepository extends JpaRepository<UserC,Long>  {  // entity you need to manage User

}


//use simple user repository instead of DAO services , instead of writing a lot of Dao Services , 
// with simmillar logic can use spring data jpa such as  JpaRepository

// JpaRepository   is common abstraction to be extended , which will get all methods to such as save , check this and understand it as it is used to manage en

