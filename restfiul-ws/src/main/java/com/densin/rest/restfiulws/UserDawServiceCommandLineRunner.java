package com.densin.rest.restfiulws;

import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.densin.rest.restfiulws.User.User;
import com.densin.rest.restfiulws.service.UserDAOService;
@Component  // to be managed from spring services

public class UserDawServiceCommandLineRunner implements CommandLineRunner{
private static final Logger log= LoggerFactory.getLogger(UserDawServiceCommandLineRunner.class);
	
	@Autowired private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Bashar","Admin");
	long insert=userDaoService.insert(user);
		
		log.info("New User is created:"+user);
	}

}
