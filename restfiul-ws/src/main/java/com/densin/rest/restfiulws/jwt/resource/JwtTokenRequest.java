package com.densin.rest.restfiulws.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
  
//    {
//    	  "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXNoYXJ1c3IiLCJleHAiOjE2NDc2ODkxNDcsImlhdCI6MTY0NzA4NDM0N30.5thgJ2NJdTJAMVH1B0ec75-eYDjEP0dnqNoEqZFc6PsJpr0APTodFco4lo0zSXTXpIl61VswB7okm1lqXrmNtw"

    // after 
    // verified    "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXNoYXJ1c3IiLCJleHAiOjE2NDc2ODkxNDcsImlhdCI6MTY0NzA4NDM0N30.aptrQyM1Pct11Y-k2mBf4X8oLufgNhjgHxMfJ4Udm8iahGuoyPfJQuroK2Du9ff8UJm4HrGRc3_yH8rmIqv87Q"
    //    	}
    
    //   Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXNoYXJ1c3IiLCJleHAiOjE2NDc2ODkxNDcsImlhdCI6MTY0NzA4NDM0N30.5thgJ2NJdTJAMVH1B0ec75-eYDjEP0dnqNoEqZFc6PsJpr0APTodFco4lo0zSXTXpIl61VswB7okm1lqXrmNtw
    
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
