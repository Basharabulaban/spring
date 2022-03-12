package com.densin.rest.restfiulws.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "basharusr","$2a$10$M9rbcPEl.Fqm.y4xQmHUnOjw.D8MsRffxu9BNLgZX7/4RWzZyOop.","ROLE_USER_2"));
    inMemoryUserList.add(new JwtUserDetails(1L, "bashar72","$2a$10$LWYy3HSrBGo4tpR.3jQKB.fBM7U/wfe68KjyWAxsMZ3dvHC9VNSTi","ROLE_USER_2"));

//   basharusr  basharpw
   // {
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXNoYXJ1c3IiLCJleHAiOjE2NDc2OTE1MTcsImlhdCI6MTY0NzA4NjcxN30._JlEt6FV6S49dEzqqgTGSg9rLJKonrpEHGhyTVxFC8AAF3-W9NL9s96z04L9ygmn6PgGQHHbzTVzmF3pxwSOrA"
//    	}
    
    // bashar72 , KOKO77
    
//    {
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXNoYXI3MiIsImV4cCI6MTY0NzY5MTQ1MCwiaWF0IjoxNjQ3MDg2NjUwfQ.RYze91XEt2047yiRclHChayCEa4oQsLxHEGam8Gs7FeBmm77zdjlehJGZ3QWQBJXCL6lSX4RZB3C5NEQfU6Y_g"
//    	}
//    
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}
