package com.insuranceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.util.JwtTokenUtil;
import com.insuranceapp.model.AppUser;
import com.insuranceapp.model.AppUserMapper;
import com.insuranceapp.service.AppUserServiceImpl;

@RestController
@RequestMapping("/user-api/v1")
public class AppUserController {

	@Autowired
	private AppUserServiceImpl userServiceImpl;
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired 
	private PasswordEncoder encoder;
	@Autowired
    JwtTokenUtil tokenUtil;

	@Autowired
	private UserDetailsManager appUserServiceImpl;
	
	@Autowired
	private AppUserMapper appUserMapper;
	
	@PostMapping("/register")
	ResponseEntity<Void> createUser(@RequestBody AppUser appUser) {
		UserDetails details = appUserMapper.convertToUserDetails(appUser);
		appUserServiceImpl.createUser(details);
		return ResponseEntity.status(HttpStatus.CREATED.value()).build();
	}
	
	@PostMapping("/authenticate")
	ResponseEntity<String> authenticateUser(@RequestBody AppUser appUser) {
		System.out.println(appUser);
		authenticate(appUser.getUsername(), appUser.getPassword());
		UserDetails userDetails = appUserServiceImpl.loadUserByUsername(appUser.getUsername());
		String token = tokenUtil.generateToken(userDetails);
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
	}
	
	private void authenticate(String username, String password) {
		try {
			System.out.println(username);
			Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			SecurityContextHolder.getContext().setAuthentication(authentication);
			System.out.println(authentication.getPrincipal());
		} catch (BadCredentialsException e) {
			System.out.println("Invalid credentials");
		} catch (DisabledException e) {
			System.out.println("disabled");
		}
	}
}
