package com.kim.service;

import com.kim.model.MemberVO;

public interface MemberService {
	
	public MemberVO Login(String userid) throws Exception;
	
}
