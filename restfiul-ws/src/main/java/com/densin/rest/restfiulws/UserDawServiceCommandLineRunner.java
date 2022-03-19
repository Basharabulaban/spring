package com.densin.rest.restfiulws;

import javax.persistence.PersistenceContext;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.densin.rest.restfiulws.User.User;
@Component  // to be managed from spring services

public class UserDawServiceCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Bashar","Admin");
	}

}
