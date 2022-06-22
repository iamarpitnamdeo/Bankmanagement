package com.bankDemo.controller.userController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankDemo.model.user.User;

@RestController
public class UserController {
	
	/*@PostMapping("/addUser")
	public void createUser(@RequestBody User user) throws Exception {
		if(user == null) {
			throw new Exception();
		}
		else 
		{
			System.out.println("User information saved");
		}
	}*/
	@RequestMapping("/")
	public String check() {
		System.out.println("Check method working");
		return "Check method working";
	}
}
