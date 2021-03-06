package com.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")

public class LoginController{
	
	@Autowired
	LoginService loginValidation;
			
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String username, @RequestParam String password, ModelMap model) {
		
		Boolean isUserValid = loginValidation.isUserValid(username, password); //User credentials validation.
		
		if(isUserValid){
			model.put("username", username);
			model.put("password", password);
			return "welcome";
		}
		else{
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
	}

}
