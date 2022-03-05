package com.densin.rest.restfiulws.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration  // enable spring configuraiton 
@EnableWebSecurity

public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();	
		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/**").permitAll().anyRequest().authenticated();
			//	.and()
			//.formLogin().and()
			http.httpBasic();
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http
//		.csrf().disable()
//		.authorizeRequests((requests) -> requests.anyRequest().authenticated());
//		//http.formLogin();
//		http.httpBasic();
//	}
}