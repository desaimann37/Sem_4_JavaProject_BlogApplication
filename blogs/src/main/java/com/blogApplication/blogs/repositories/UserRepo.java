package com.blogApplication.blogs.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogApplication.blogs.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	Optional<User>findByEmail(String email);
	
}
