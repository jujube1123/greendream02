package com.kim.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, 
										HttpServletResponse response,
										Authentication authentication) 
		throws IOException, ServletException {
		
		List<String> rolenames = new ArrayList<String>();
		
				System.out.println("로그인 성공");
				
		authentication.getAuthorities().forEach(authority -> {
			rolenames.add(authority.getAuthority());
		});
		
		if(rolenames.contains("ROLE_ADMIN")) {
			response.sendRedirect("/main");
			return;
		}
			
		response.sendRedirect("/");
		
	}
}
