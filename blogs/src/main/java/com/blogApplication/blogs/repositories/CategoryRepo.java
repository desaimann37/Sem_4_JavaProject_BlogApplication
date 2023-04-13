package com.blogApplication.blogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogApplication.blogs.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

	
	
}
