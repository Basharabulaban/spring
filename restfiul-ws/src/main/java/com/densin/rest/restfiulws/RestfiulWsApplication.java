package com.densin.rest.restfiulws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
//////  spring auto configuration is so important once you go deeply in spring boot
public class RestfiulWsApplication {

	public static void main(String[] args) {
//	ApplicationContext applicationContext=	
			SpringApplication.run(RestfiulWsApplication.class, args);
//	for (String name : applicationContext.getBeanDefinitionNames()) {
//		System.out.println(name);
//		
//	}
	
	}

}
