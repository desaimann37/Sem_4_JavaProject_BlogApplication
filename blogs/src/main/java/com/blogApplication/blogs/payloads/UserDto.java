 package com.blogApplication.blogs.payloads;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * 
 * This Class is Used When We Want to transfer Data...
 * 
 */

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	@NotEmpty
	@Size(min=5 , message="Username must be min of 5 characters!!")
	private String name;
	
	@Email(message = "Email address is not valid !!")
	private String email;
	
	@NotEmpty
	@Size(min=5 , max = 16 ,  message="Password must be min of 5 chars and max of 16 characters!!")
	private String password;
	@NotNull
	private String about;
	
	
}
