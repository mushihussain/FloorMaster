package com.floormaster.auth;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floormaster.entities.AppUser;
import com.floormaster.repositories.AppUserRepository;

@Service
public class UserDetailsServiceImpl {
//implements UserDetailsService {

	/*
	 * @Autowired private AppUserRepository appUserRepository;
	 * 
	 * @Override public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException { AppUser user =
	 * appUserRepository.findByUsername(username) .orElseThrow(() -> new
	 * UsernameNotFoundException("User not found"));
	 * 
	 * return new org.springframework.security.core.userdetails.User(
	 * user.getUsername(), user.getPasswordHash(), Collections.singleton(new
	 * SimpleGrantedAuthority(user.getRole())) ); }
	 */
}

