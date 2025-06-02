package com.floormaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floormaster.auth.JwtUtil;
import com.floormaster.auth.LoginRequest;
import com.floormaster.auth.LoginResponse;
//import com.floormaster.auth.UserDetails;
import com.floormaster.auth.UserDetailsServiceImpl;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    //@Autowired
    //private AuthenticationManager authenticationManager;

	/*
	 * @Autowired private UserDetailsServiceImpl userDetailsService;
	 * 
	 * @Autowired private JwtUtil jwtUtil;
	 * 
	 * @PostMapping("/login") public ResponseEntity<?> login(@RequestBody
	 * LoginRequest request) { try { authenticationManager.authenticate( new
	 * UsernamePasswordAuthenticationToken(request.getUsername(),
	 * request.getPassword()) );
	 * 
	 * final UserDetails userDetails =
	 * userDetailsService.loadUserByUsername(request.getUsername()); final String
	 * jwt = jwtUtil.generateToken(userDetails);
	 * 
	 * return ResponseEntity.ok(new LoginResponse(jwt)); } catch
	 * (BadCredentialsException e) { return
	 * ResponseEntity.status(HttpStatus.UNAUTHORIZED).
	 * body("Incorrect username or password"); } }
	 */
}

