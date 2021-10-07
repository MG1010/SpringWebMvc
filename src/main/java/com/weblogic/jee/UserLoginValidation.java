package com.weblogic.jee;

public class UserLoginValidation {

	public boolean isUserValid(String user, String password) {
		
		if (user.equals("test") && password.equals("test"))
			return true;
		
		return false;
		
	}

}
