package com.kim.mapper;

import com.kim.model.MemberVO;

public interface MemberMapper {
	// 설정된 기준온도
	public MemberVO Login(String userid);
}