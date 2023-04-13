package com.blogApplication.blogs.entities;


import java.util.*;
import java.util.stream.Collectors;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter//Using Lombok Dependency
@Setter
public class User {//implements UserDetails
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "user_name" , nullable = false , length = 100)
	private String name;
	
	private String email;
	
	private String password;
	private String about;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Post> posts = new ArrayList<>();
	
//	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
//	@JoinTable(name = "user_role" , joinColumns = @JoinColumn(name = "user" , referencedColumnName = "id") , inverseJoinColumns = @JoinColumn(name = "role" , referencedColumnName = "id"))
//	private Set<Role>roles = new HashSet<>();

	
	
	//UserDetails Methods...
	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		List<SimpleGrantedAuthority> authorities = this.roles.stream().map((role)->new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
//		
//		return authorities;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		
//		return this.email;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
	
	
	
}