package com.kim.mapper;

import java.util.ArrayList;

import com.kim.model.AdDTO;
import com.kim.model.YangVO;

public interface JJunMapper {
	public ArrayList<YangVO> dht(YangVO yang);
	public ArrayList<YangVO> highTem(YangVO yang);
	public ArrayList<YangVO> lowTem(YangVO yang);
	public ArrayList<YangVO> highHum(YangVO yang);
	public ArrayList<YangVO> lowHum(YangVO yang);
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
