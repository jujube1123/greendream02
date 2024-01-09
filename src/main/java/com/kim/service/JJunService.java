package com.kim.service;

import java.util.ArrayList;

import com.kim.model.AdDTO;
import com.kim.model.YangVO;

public interface JJunService {
	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dht(YangVO yang);
	// 최대온도
	public ArrayList<YangVO> highTem(YangVO yang);
	// 최저온도
	public ArrayList<YangVO> lowTem(YangVO yang);
	// 최대습도
	public ArrayList<YangVO> highHum(YangVO yang);
	// 최저습도
	public ArrayList<YangVO> lowHum(YangVO yang);
	// 평균온도
	public double averageTem(YangVO yang);
	// 평균습도
	public double averageHum(YangVO yang);
	// 기준온도
	public void temAdjust(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNow(AdDTO ad);
	// 기준습도
	public void humAdjust(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNow(AdDTO ad);
}
