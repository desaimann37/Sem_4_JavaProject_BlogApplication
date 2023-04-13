package com.blogApplication.blogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogApplication.blogs.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment , Integer>{

}
