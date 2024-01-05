package com.kim.service;

import java.util.ArrayList;

import com.kim.model.YangVO;

public interface YangService {
	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dht(YangVO yang);

}
