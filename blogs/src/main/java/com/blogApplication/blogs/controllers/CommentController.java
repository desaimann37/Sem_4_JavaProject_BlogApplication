package com.blogApplication.blogs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogApplication.blogs.entities.Comment;
import com.blogApplication.blogs.payloads.ApiResponse;
import com.blogApplication.blogs.payloads.CommentDto;
import com.blogApplication.blogs.services.CommentService;

@RestController
@RequestMapping("/api")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@PostMapping("/post/{postId}/comments")
	public ResponseEntity<CommentDto>createComment(@RequestBody CommentDto commentDto , @PathVariable Integer postId){
		
		CommentDto createComment = this.commentService.createComment(commentDto, postId);
		return new ResponseEntity<CommentDto>(createComment , HttpStatus.CREATED);
		
	}
	@DeleteMapping("/comments")
	public ResponseEntity<ApiResponse>deleteComment(@PathVariable Integer postId){
		
		 this.commentService.deleteComment(postId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Comment deleted Successfully!!" , true) , HttpStatus.OK);
		
	}
	
	
}
