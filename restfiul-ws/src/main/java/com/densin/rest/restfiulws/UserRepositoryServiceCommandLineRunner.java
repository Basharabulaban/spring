package com.densin.rest.restfiulws;

import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.densin.rest.restfiulws.User.User;
import com.densin.rest.restfiulws.service.UserDAOService;
import com.densin.rest.restfiulws.service.UserRepository;
@Component  // to be managed from spring services

public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner{
private static final Logger log= LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner.class);
	
	@Autowired private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("KOKO","Admin");
//	User insert=userRepository.save(user);
	userRepository.save(user);	
		log.info("New User is created:"+user);
	}

}
