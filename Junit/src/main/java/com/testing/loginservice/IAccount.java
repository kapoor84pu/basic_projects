package com.testing.loginservice;

public interface IAccount {

	void setLoggedIn(boolean value);
	
	boolean passwordMatches(String candidate);
	
	void setRevoked(boolean b);

	void login(String username, String password);

	boolean isLoggedIn();	
	
}