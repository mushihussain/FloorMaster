package com.floormaster.auth;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	/*
	 * private final String SECRET_KEY = "your_secret_key";
	 * 
	 * public String generateToken(UserDetails userDetails) { return Jwts.builder()
	 * .setSubject(userDetails.getUsername()) .claim("role",
	 * userDetails.getAuthorities().iterator().next().getAuthority())
	 * .setIssuedAt(new Date(System.currentTimeMillis())) .setExpiration(new
	 * Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 hrs
	 * .signWith(SignatureAlgorithm.HS256, SECRET_KEY) .compact(); }
	 * 
	 * public String extractUsername(String token) { return
	 * Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token)
	 * .getBody().getSubject(); }
	 * 
	 * public boolean validateToken(String token, UserDetails userDetails) { return
	 * extractUsername(token).equals(userDetails.getUsername()); }
	 */
}
