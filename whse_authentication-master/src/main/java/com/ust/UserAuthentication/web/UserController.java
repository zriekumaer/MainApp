package com.ust.UserAuthentication.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.UserAuthentication.service.UserService;

@RestController
@RequestMapping("/login")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	public String login(@RequestParam String userName, @RequestParam String password) {
		boolean isValidUser = userService.validateUser(userName, password);
		if(isValidUser){
			return userName;
		}
		else{
			return "Invalid UserName or Password";
		}
	}
}
