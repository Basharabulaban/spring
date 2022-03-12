package com.densin.rest.restfiulws;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main () {
		
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	for(int i=1 ;i<=10 ;i++) {
		String encodeString = encoder.encode("password@!@#$%");
		System.out.println(encodeString);
	}
	

}

}
