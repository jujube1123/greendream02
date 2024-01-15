package com.kim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kim.mapper.MemberMapper;
import com.kim.model.MemberVO;
import com.kim.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper mm;
	
	@Override
	public MemberVO Login(String userid) throws Exception {
		return mm.Login(userid);
	}

}
