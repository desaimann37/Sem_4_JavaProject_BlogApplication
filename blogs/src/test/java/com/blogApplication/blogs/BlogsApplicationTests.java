package com.blogApplication.blogs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blogApplication.blogs.repositories.UserRepo;

@SpringBootTest
class BlogsApplicationTests {

	
	@Autowired
	private UserRepo userRepo;
	
	@Test
	void contextLoads() {
	}
	@Test
	public void repoTest() {
		
		String className = this.userRepo.getClass().getName();
		String packName = this.userRepo.getClass().getPackageName();
		System.out.println(className);
		System.out.println(packName);
	}
	

}
