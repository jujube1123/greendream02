package com.kim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kim.mapper.YangMapper;
import com.kim.model.YangVO;

@Service
public class YangServiceImpl implements YangService {
	
	@Autowired
	YangMapper ym;
	
	//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dht(YangVO yang) {
		return ym.dht(yang);
	};
}
