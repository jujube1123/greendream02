package com.kim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kim.mapper.JJunMapper;
import com.kim.model.AdDTO;
import com.kim.model.YangVO;

@Service
public class JJunServiceImpl implements JJunService {
	
	@Autowired
	JJunMapper jm;
	
	//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dht(YangVO yang) {
		return jm.dht(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTem(YangVO yang) {
		return jm.highTem(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTem(YangVO yang) {
		return jm.lowTem(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHum(YangVO yang) {
		return jm.highHum(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHum(YangVO yang) {
		return jm.lowHum(yang);
	};
	// 평균온도
	public double averageTem(YangVO yang) {
		return jm.averageTem(yang);
	};
	// 평균습도
	public double averageHum(YangVO yang) {
		return jm.averageHum(yang);
	};
	// 기준온도
	public void temAdjust(AdDTO ad) {
		jm.temAdjust(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNow(AdDTO ad) {
		return jm.temAdNow(ad);
	}
	// 기준습도 
	public void humAdjust(AdDTO ad) {
		jm.humAdjust(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNow(AdDTO ad) {
		return jm.humAdNow(ad);
	}
}
