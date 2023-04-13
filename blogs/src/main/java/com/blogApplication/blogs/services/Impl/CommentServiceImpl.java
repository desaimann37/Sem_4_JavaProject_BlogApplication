package com.blogApplication.blogs.services.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogApplication.blogs.entities.Comment;
import com.blogApplication.blogs.entities.Post;
import com.blogApplication.blogs.exceptions.ResourceNotFoundException;
import com.blogApplication.blogs.payloads.CommentDto;
import com.blogApplication.blogs.repositories.CommentRepo;
import com.blogApplication.blogs.repositories.PostRepo;
import com.blogApplication.blogs.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private PostRepo postRepo;
	@Autowired
	private CommentRepo commentRepo;
	@Autowired
	private ModelMapper modelmapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		 
		Post post = this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "Post Id", postId));
		Comment comment = this.modelmapper.map(commentDto, Comment.class);
		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment);
		return this.modelmapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment comment = this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "CommentId", commentId));
		this.commentRepo.delete(comment);
	}

	
	
	
}
