package com.kim.mapper;

import java.util.ArrayList;

import com.kim.model.MemberVO;
import com.kim.model.YangVO;

public interface YangMapper {
	
	public ArrayList<YangVO> dht(YangVO yang);

	public ArrayList<MemberVO> dht(MemberVO member);
	
}
