package com.blogApplication.blogs.services;

import java.util.*;

import com.blogApplication.blogs.payloads.CategoryDto;

public interface CategoryService {

	//create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	public CategoryDto updateCategory(CategoryDto categoryDto , Integer categoryId);
	
	//delete
	public void deleteCategory(Integer categoryId);
	
	//get - single category
	public CategoryDto getCategory(Integer categoryId);
	
	//get - All categories;
	public List<CategoryDto>getCategories();
	
}
