package com.bankDemo.service.userService;

import org.springframework.data.repository.CrudRepository;

import com.bankDemo.model.user.User;

public interface userServiceInterface extends CrudRepository{
	public User save(User user);
}
