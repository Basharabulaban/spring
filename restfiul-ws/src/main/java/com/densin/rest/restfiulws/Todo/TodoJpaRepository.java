package com.densin.rest.restfiulws.Todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{ // which entity to manage and what is the primary key
//List<Todo> findByusername(String username);  // the way to create search method

List<Todo> findByusername( String username);




}

