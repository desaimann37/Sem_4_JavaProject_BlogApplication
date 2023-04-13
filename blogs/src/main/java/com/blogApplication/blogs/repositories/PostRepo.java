package com.blogApplication.blogs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blogApplication.blogs.entities.Category;
import com.blogApplication.blogs.entities.Post;
import com.blogApplication.blogs.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	//-->"Custom finders" Methods --> Internally Executes SQL on declaration of findBy...()
	List<Post> findByCategory(Category cat);

	List<Post> findByUser(User user);
	
	@Query("select p from Post p where p.title like :key")
	List<Post>searchByTitle(@Param("key")String title);//for searching purpose
	
}
