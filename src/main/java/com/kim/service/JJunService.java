package com.kim.service;

import java.util.ArrayList;

import com.kim.model.AdDTO;
import com.kim.model.YangVO;

public interface JJunService {
	
	//OpA	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dht(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTem(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTem(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHum(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHum(YangVO yang);
	// 평균 온도
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
	
	//OpB	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dhtOpB(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTemOpB(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTemOpB(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHumOpB(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHumOpB(YangVO yang);
	// 평균 온도
	public double averageTemOpB(YangVO yang);
	// 평균습도
	public double averageHumOpB(YangVO yang);
	// 기준온도
	public void temAdjustOpB(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNowOpB(AdDTO ad);
	// 기준습도
	public void humAdjustOpB(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNowOpB(AdDTO ad);
	
	//OpC	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dhtOpC(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTemOpC(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTemOpC(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHumOpC(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHumOpC(YangVO yang);
	// 평균 온도
	public double averageTemOpC(YangVO yang);
	// 평균습도
	public double averageHumOpC(YangVO yang);
	// 기준온도
	public void temAdjustOpC(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNowOpC(AdDTO ad);
	// 기준습도
	public void humAdjustOpC(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNowOpC(AdDTO ad);
	
	//InA	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dhtInA(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTemInA(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTemInA(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHumInA(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHumInA(YangVO yang);
	// 평균 온도
	public double averageTemInA(YangVO yang);
	// 평균습도
	public double averageHumInA(YangVO yang);
	// 기준온도
	public void temAdjustInA(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNowInA(AdDTO ad);
	// 기준습도
	public void humAdjustInA(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNowInA(AdDTO ad);
	
	//InB	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dhtInB(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTemInB(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTemInB(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHumInB(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHumInB(YangVO yang);
	// 평균 온도
	public double averageTemInB(YangVO yang);
	// 평균습도
	public double averageHumInB(YangVO yang);
	// 기준온도
	public void temAdjustInB(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNowInB(AdDTO ad);
	// 기준습도
	public void humAdjustInB(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNowInB(AdDTO ad);
	
	//InC	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dhtInC(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTemInC(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTemInC(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHumInC(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHumInC(YangVO yang);
	// 평균 온도
	public double averageTemInC(YangVO yang);
	// 평균습도
	public double averageHumInC(YangVO yang);
	// 기준온도
	public void temAdjustInC(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNowInC(AdDTO ad);
	// 기준습도
	public void humAdjustInC(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNowInC(AdDTO ad);
	
	//TrA	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dhtTrA(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTemTrA(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTemTrA(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHumTrA(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHumTrA(YangVO yang);
	// 평균 온도
	public double averageTemTrA(YangVO yang);
	// 평균습도
	public double averageHumTrA(YangVO yang);
	// 기준온도
	public void temAdjustTrA(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNowTrA(AdDTO ad);
	// 기준습도
	public void humAdjustTrA(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNowTrA(AdDTO ad);
	
	//TrB	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dhtTrB(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTemTrB(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTemTrB(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHumTrB(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHumTrB(YangVO yang);
	// 평균 온도
	public double averageTemTrB(YangVO yang);
	// 평균습도
	public double averageHumTrB(YangVO yang);
	// 기준온도
	public void temAdjustTrB(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNowTrB(AdDTO ad);
	// 기준습도
	public void humAdjustTrB(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNowTrB(AdDTO ad);
	
	//TrC	
	// 라즈베리파이 온도,습도, 로그시간
	public ArrayList<YangVO> dhtTrC(YangVO yang);
	// 최고 온도
	public ArrayList<YangVO> highTemTrC(YangVO yang);
	// 최저 온도
	public ArrayList<YangVO> lowTemTrC(YangVO yang);
	// 최고 습도
	public ArrayList<YangVO> highHumTrC(YangVO yang);
	// 최저 습도
	public ArrayList<YangVO> lowHumTrC(YangVO yang);
	// 평균 온도
	public double averageTemTrC(YangVO yang);
	// 평균습도
	public double averageHumTrC(YangVO yang);
	// 기준온도
	public void temAdjustTrC(AdDTO ad);
	// 설정된 기준온도
	public AdDTO temAdNowTrC(AdDTO ad);
	// 기준습도
	public void humAdjustTrC(AdDTO ad);
	// 설정된 기준습도
	public AdDTO humAdNowTrC(AdDTO ad);
}
