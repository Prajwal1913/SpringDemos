package com.insuranceapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AppUserMapper {
	
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private PasswordEncoder encode;
	
	//convert userdetails to appuser
	public AppUser convertToAppUser(UserDetails userDetails) {
		String username = userDetails.getUsername();
		String password = encode.encode(userDetails.getPassword());
		AppUser appUser =  new AppUser();
		appUser.setUsername(username);
		appUser.setPassword(password);
		
		return appUser;

	}
	
	//from db to frontend
	//convert appuser to userdetails
	public UserDetails convertToUserDetails(AppUser appUser) {
		String username = appUser.getUsername();
		String password = appUser.getPassword();
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		//create  roles for user
		List<String> roles = Arrays.asList("user","admin");
		for(String role:roles) {
			SimpleGrantedAuthority simpleAuthority = new SimpleGrantedAuthority(role);
			authorities.add(simpleAuthority);
		}
		
		UserDetails details = new User(username, password, authorities);
		return details;

		
	}
}
