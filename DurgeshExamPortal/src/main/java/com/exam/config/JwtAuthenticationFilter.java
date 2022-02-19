package com.exam.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.exam.Service.impl.UserDetailsServiceImpl;

import io.jsonwebtoken.ExpiredJwtException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String requestTokenHeader = request.getHeader("Authorisation");
		System.out.println(requestTokenHeader);
		String username=null;
		String jwtToken=null;
		
		if(requestTokenHeader!= null && requestTokenHeader.startsWith("Bearer ")) {
			//yes token found
			jwtToken = requestTokenHeader.substring(7);
			username = this.jwtUtil.extractUsername(jwtToken);
			
			try {
				username = this.jwtUtil.extractUsername(jwtToken);
				
			}catch(ExpiredJwtException e) {
				e.printStackTrace();
				System.out.println("Jwt Token has expired");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("Invalid token, not starting with bearer");
		}
		
		//If we will get the token now its time to validate it
		
		if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			
			final UserDetails userDetails =this.userDetailsService.loadUserByUsername(username);
			if(this.jwtUtil.validateToken(jwtToken, userDetails)) {
				//token is validate
			UsernamePasswordAuthenticationToken usernamePasswordAuthentication= new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
			usernamePasswordAuthentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));	
			
			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthentication);
			}
		}
		else {
			System.out.println("Token is not valid");
		}
		
		filterChain.doFilter(request, response);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
