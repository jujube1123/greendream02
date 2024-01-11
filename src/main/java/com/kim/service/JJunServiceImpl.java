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
	
	//opA
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
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
	
	//OpB
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dhtOpB(YangVO yang) {
		return jm.dhtOpB(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTemOpB(YangVO yang) {
		return jm.highTemOpB(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTemOpB(YangVO yang) {
		return jm.lowTemOpB(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHumOpB(YangVO yang) {
		return jm.highHumOpB(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHumOpB(YangVO yang) {
		return jm.lowHumOpB(yang);
	};
	// 평균온도
	public double averageTemOpB(YangVO yang) {
		return jm.averageTemOpB(yang);
	};
	// 평균습도
	public double averageHumOpB(YangVO yang) {
		return jm.averageHumOpB(yang);
	};
	// 기준온도
	public void temAdjustOpB(AdDTO ad) {
		jm.temAdjustOpB(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNowOpB(AdDTO ad) {
		return jm.temAdNowOpB(ad);
	}
	// 기준습도 
	public void humAdjustOpB(AdDTO ad) {
		jm.humAdjustOpB(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNowOpB(AdDTO ad) {
		return jm.humAdNowOpB(ad);
	}
	
	//OpC
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dhtOpC(YangVO yang) {
		return jm.dhtOpC(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTemOpC(YangVO yang) {
		return jm.highTemOpC(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTemOpC(YangVO yang) {
		return jm.lowTemOpC(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHumOpC(YangVO yang) {
		return jm.highHumOpC(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHumOpC(YangVO yang) {
		return jm.lowHumOpC(yang);
	};
	// 평균온도
	public double averageTemOpC(YangVO yang) {
		return jm.averageTemOpC(yang);
	};
	// 평균습도
	public double averageHumOpC(YangVO yang) {
		return jm.averageHumOpC(yang);
	};
	// 기준온도
	public void temAdjustOpC(AdDTO ad) {
		jm.temAdjustOpC(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNowOpC(AdDTO ad) {
		return jm.temAdNowOpC(ad);
	}
	// 기준습도 
	public void humAdjustOpC(AdDTO ad) {
		jm.humAdjustOpC(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNowOpC(AdDTO ad) {
		return jm.humAdNowOpC(ad);
	}
	
	//InA
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dhtInA(YangVO yang) {
		return jm.dhtInA(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTemInA(YangVO yang) {
		return jm.highTemInA(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTemInA(YangVO yang) {
		return jm.lowTemInA(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHumInA(YangVO yang) {
		return jm.highHumInA(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHumInA(YangVO yang) {
		return jm.lowHumInA(yang);
	};
	// 평균온도
	public double averageTemInA(YangVO yang) {
		return jm.averageTemInA(yang);
	};
	// 평균습도
	public double averageHumInA(YangVO yang) {
		return jm.averageHumInA(yang);
	};
	// 기준온도
	public void temAdjustInA(AdDTO ad) {
		jm.temAdjustInA(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNowInA(AdDTO ad) {
		return jm.temAdNowInA(ad);
	}
	// 기준습도 
	public void humAdjustInA(AdDTO ad) {
		jm.humAdjustInA(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNowInA(AdDTO ad) {
		return jm.humAdNowInA(ad);
	}
	
	//InB
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dhtInB(YangVO yang) {
		return jm.dhtInB(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTemInB(YangVO yang) {
		return jm.highTemInB(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTemInB(YangVO yang) {
		return jm.lowTemInB(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHumInB(YangVO yang) {
		return jm.highHumInB(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHumInB(YangVO yang) {
		return jm.lowHumInB(yang);
	};
	// 평균온도
	public double averageTemInB(YangVO yang) {
		return jm.averageTemInB(yang);
	};
	// 평균습도
	public double averageHumInB(YangVO yang) {
		return jm.averageHumInB(yang);
	};
	// 기준온도
	public void temAdjustInB(AdDTO ad) {
		jm.temAdjustInB(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNowInB(AdDTO ad) {
		return jm.temAdNowInB(ad);
	}
	// 기준습도 
	public void humAdjustInB(AdDTO ad) {
		jm.humAdjustInB(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNowInB(AdDTO ad) {
		return jm.humAdNowInB(ad);
	}
	
	//InC
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dhtInC(YangVO yang) {
		return jm.dhtInC(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTemInC(YangVO yang) {
		return jm.highTemInC(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTemInC(YangVO yang) {
		return jm.lowTemInC(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHumInC(YangVO yang) {
		return jm.highHumInC(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHumInC(YangVO yang) {
		return jm.lowHumInC(yang);
	};
	// 평균온도
	public double averageTemInC(YangVO yang) {
		return jm.averageTemInC(yang);
	};
	// 평균습도
	public double averageHumInC(YangVO yang) {
		return jm.averageHumInC(yang);
	};
	// 기준온도
	public void temAdjustInC(AdDTO ad) {
		jm.temAdjustInC(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNowInC(AdDTO ad) {
		return jm.temAdNowInC(ad);
	}
	// 기준습도 
	public void humAdjustInC(AdDTO ad) {
		jm.humAdjustInC(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNowInC(AdDTO ad) {
		return jm.humAdNowInC(ad);
	}
	
	//TrA
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dhtTrA(YangVO yang) {
		return jm.dhtTrA(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTemTrA(YangVO yang) {
		return jm.highTemTrA(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTemTrA(YangVO yang) {
		return jm.lowTemTrA(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHumTrA(YangVO yang) {
		return jm.highHumTrA(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHumTrA(YangVO yang) {
		return jm.lowHumTrA(yang);
	};
	// 평균온도
	public double averageTemTrA(YangVO yang) {
		return jm.averageTemTrA(yang);
	};
	// 평균습도
	public double averageHumTrA(YangVO yang) {
		return jm.averageHumTrA(yang);
	};
	// 기준온도
	public void temAdjustTrA(AdDTO ad) {
		jm.temAdjustTrA(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNowTrA(AdDTO ad) {
		return jm.temAdNowTrA(ad);
	}
	// 기준습도 
	public void humAdjustTrA(AdDTO ad) {
		jm.humAdjustTrA(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNowTrA(AdDTO ad) {
		return jm.humAdNowTrA(ad);
	}
	
	//TrB
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dhtTrB(YangVO yang) {
		return jm.dhtTrB(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTemTrB(YangVO yang) {
		return jm.highTemTrB(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTemTrB(YangVO yang) {
		return jm.lowTemTrB(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHumTrB(YangVO yang) {
		return jm.highHumTrB(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHumTrB(YangVO yang) {
		return jm.lowHumTrB(yang);
	};
	// 평균온도
	public double averageTemTrB(YangVO yang) {
		return jm.averageTemTrB(yang);
	};
	// 평균습도
	public double averageHumTrB(YangVO yang) {
		return jm.averageHumTrB(yang);
	};
	// 기준온도
	public void temAdjustTrB(AdDTO ad) {
		jm.temAdjustTrB(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNowTrB(AdDTO ad) {
		return jm.temAdNowTrB(ad);
	}
	// 기준습도 
	public void humAdjustTrB(AdDTO ad) {
		jm.humAdjustTrB(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNowTrB(AdDTO ad) {
		return jm.humAdNowTrB(ad);
	}
	
	//TrC
	// 페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
	public ArrayList<YangVO> dhtTrC(YangVO yang) {
		return jm.dhtTrC(yang);
	};
	
	// 최대온도
	public ArrayList<YangVO> highTemTrC(YangVO yang) {
		return jm.highTemTrC(yang);
	};
	// 최저온도
	public ArrayList<YangVO> lowTemTrC(YangVO yang) {
		return jm.lowTemTrC(yang);
	};
	// 최대습도
	public ArrayList<YangVO> highHumTrC(YangVO yang) {
		return jm.highHumTrC(yang);
	};
	// 최저습도
	public ArrayList<YangVO> lowHumTrC(YangVO yang) {
		return jm.lowHumTrC(yang);
	};
	// 평균온도
	public double averageTemTrC(YangVO yang) {
		return jm.averageTemTrC(yang);
	};
	// 평균습도
	public double averageHumTrC(YangVO yang) {
		return jm.averageHumTrC(yang);
	};
	// 기준온도
	public void temAdjustTrC(AdDTO ad) {
		jm.temAdjustTrC(ad);
	}
	// 설정된 기준온도
	public AdDTO temAdNowTrC(AdDTO ad) {
		return jm.temAdNowTrC(ad);
	}
	// 기준습도 
	public void humAdjustTrC(AdDTO ad) {
		jm.humAdjustTrC(ad);
	}
	// 설정된 기준습도
	public AdDTO humAdNowTrC(AdDTO ad) {
		return jm.humAdNowTrC(ad);
	}


}
