package com.kim.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kim.mapper.MemberMapper;
import com.kim.model.MemberVO;

import lombok.Setter;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Setter(onMethod_ = { @Autowired })
	private MemberMapper mm;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MemberVO vo = new MemberVO();
		
		try {
			vo = mm.Login(username);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return vo == null ? null : new CustomUser(vo);
	}
}