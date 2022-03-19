package com.densin.rest.restfiulws;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.densin.rest.restfiulws.User.User;

import com.densin.rest.restfiulws.service.UserRepository;

@Component // to be managed from spring services

public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("KOKO", "Admin");
		userRepository.save(user);
//	User insert=userRepository.save(user);

		log.info("New User is retrieved:" + user);

		Optional<User> specficUser = userRepository.findById(2L);

		log.info("find user 1" + specficUser);

		log.info("find user2" + userRepository.findById(1L));

		List<User> users = userRepository.findAll();

	}

}
