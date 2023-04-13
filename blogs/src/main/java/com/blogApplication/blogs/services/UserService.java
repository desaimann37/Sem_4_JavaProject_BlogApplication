package com.blogApplication.blogs.services;

import java.util.List;

import com.blogApplication.blogs.payloads.UserDto;

public interface UserService {

	//UserDto registerNewuser(UserDto user);
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user , Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto>getAllUsers();
	void deleteUser(Integer userId);
	
	
	
}
