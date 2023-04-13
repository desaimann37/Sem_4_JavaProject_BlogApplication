package com.blogApplication.blogs.services;

import com.blogApplication.blogs.payloads.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto , Integer postId);
	void deleteComment(Integer commentId);
	
}
