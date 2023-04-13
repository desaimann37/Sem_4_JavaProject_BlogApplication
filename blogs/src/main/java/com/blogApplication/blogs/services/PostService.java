package com.blogApplication.blogs.services;

import java.util.List;

import com.blogApplication.blogs.entities.Post;
import com.blogApplication.blogs.payloads.PostDto;
import com.blogApplication.blogs.payloads.PostResponse;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto , Integer userId , Integer categoryId);
	//update
	PostDto updatePost(PostDto postDto , Integer PostId);
	//delete
	void deletePost(Integer postId);
	//getAll Posts
	PostResponse getAllPost(Integer pageNumber , Integer pageSize , String sortBy , String sortDir);
	//get single post
	PostDto getPostById(Integer postId);
	//get All Posts By Category
	List<PostDto>getPostsByCategory(Integer categoryId);
	//get All Posts by user
	List<PostDto>getPostsByUser(Integer userId);
	//search Posts
	List<PostDto> searchPosts(String keyword);
	
}
