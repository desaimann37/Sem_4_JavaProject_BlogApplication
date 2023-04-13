package com.blogApplication.blogs;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;

import com.blogApplication.blogs.config.AppConstants;
//import com.blogApplication.blogs.entities.Role;
//import com.blogApplication.blogs.repositories.RoleRepo; 

@SpringBootApplication
public class BlogsApplication {//implements CommandLineRunner

	/*
	 * @Autowired private PasswordEncoder passwordEncoder;
	 * 
	 * @Autowired private RoleRepo roleRepo;
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(BlogsApplication.class, args);
		System.out.println("Blog Application Started...");
	}
	
	@Bean
	public ModelMapper modelMapper() { 
		return new ModelMapper();
	}

	/*
	 * @Override public void run(String... args) throws Exception { //TODO
	 * Auto-generated method stub
	 * System.out.println(this.passwordEncoder.encode("12345")); try { Role role1 =
	 * new Role(); role1.setId(AppConstants.ADMIN_USER);
	 * role1.setName("ADMIN_USER"); Role role2 = new Role();
	 * role2.setId(AppConstants.NORMAL_USER); role2.setName("NORMAL_USER");
	 * 
	 * List<Role> roles = List.of(role1 , role2); List<Role> result =
	 * this.roleRepo.saveAll(roles);
	 * 
	 * result.forEach(r->{ System.out.println(r.getName()); });
	 * 
	 * }catch(Exception ex) { System.out.println(ex.getMessage()); }
	 * 
	 * }
	 */
}


