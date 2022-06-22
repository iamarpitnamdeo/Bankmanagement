package com.bankDemo.UserRegistratio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bankDemo.controller.userController")
public class UserRegistratioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistratioApplication.class, args);
	}

}
