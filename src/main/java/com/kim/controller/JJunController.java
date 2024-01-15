package com.kim.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kim.model.AdDTO;
import com.kim.model.YangVO;
import com.kim.service.JJunService;

@Controller
public class JJunController {
	@Autowired
	JJunService js;
	
	//OpA
	@GetMapping("opA")
	public void dth (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dth", js.dht(yang));
		// 최대온도
		model.addAttribute("highTem", js.highTem(yang));
		// 최저온도
		model.addAttribute("lowTem", js.lowTem(yang));
		// 최대습도
		model.addAttribute("highHum", js.highHum(yang));
		// 최저습도
		model.addAttribute("lowHum", js.lowHum(yang));
		// 평균온도
		model.addAttribute("averageTem", js.averageTem(yang));
		// 평균습도
		model.addAttribute("averageHum", js.averageHum(yang));
		// 기준온도
		model.addAttribute("adt", js.temAdNow(ad));
		// 기준습도
		model.addAttribute("adh", js.humAdNow(ad));
	}
	
	@PostMapping("main")
	public void main (Model model, YangVO yang) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dth", js.dht(yang));
		model.addAttribute("dthOpB", js.dhtOpB(yang));
		model.addAttribute("dthOpC", js.dhtOpC(yang));
		model.addAttribute("dthInA", js.dhtInA(yang));
		model.addAttribute("dthInB", js.dhtInB(yang));
		model.addAttribute("dthInC", js.dhtInC(yang));
		model.addAttribute("dthTrA", js.dhtTrA(yang));
		model.addAttribute("dthTrB", js.dhtTrB(yang));
		model.addAttribute("dthTrC", js.dhtTrC(yang));
		
	}
	@GetMapping("temAdjust")
	public void ta(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adt", js.temAdNow(ad));
		// 기준습도
		model.addAttribute("adh", js.humAdNow(ad));	
	}
	
	@GetMapping("humAdjust")
	public void ha(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adt", js.temAdNow(ad));
		// 기준습도
		model.addAttribute("adh", js.humAdNow(ad));
	}
	
	@GetMapping("adtem")
	public String adtem(HttpServletRequest request, AdDTO ad) {

		js.temAdjust(ad);
		return "close";
	}
	
	@GetMapping("adhum")
	public String adhum(HttpServletRequest request, AdDTO ad) {

		js.humAdjust(ad);
		return "close";
	}
	
	//OpB
	@GetMapping("opB")
	public void dthOpB (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dthOpB", js.dhtOpB(yang));
		// 최대온도
		model.addAttribute("highTemOpB", js.highTemOpB(yang));
		// 최저온도
		model.addAttribute("lowTemOpB", js.lowTemOpB(yang));
		// 최대습도
		model.addAttribute("highHumOpB", js.highHumOpB(yang));
		// 최저습도
		model.addAttribute("lowHumOpB", js.lowHumOpB(yang));
		// 평균온도
		model.addAttribute("averageTemOpB", js.averageTemOpB(yang));
		// 평균습도
		model.addAttribute("averageHumOpB", js.averageHumOpB(yang));
		// 기준온도
		model.addAttribute("adtOpB", js.temAdNowOpB(ad));
		// 기준습도
		model.addAttribute("adhOpB", js.humAdNowOpB(ad));
	}

	@GetMapping("temAdjustOpB")
	public void taOpB(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtOpB", js.temAdNowOpB(ad));
		// 기준습도
		model.addAttribute("adhOpB", js.humAdNowOpB(ad));
	}
	
	@GetMapping("humAdjustOpB")
	public void haOpB(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtOpB", js.temAdNowOpB(ad));
		// 기준습도
		model.addAttribute("adhOpB", js.humAdNowOpB(ad));
	}
	
	@GetMapping("adtemOpB")
	public String adtemOpB(HttpServletRequest request, AdDTO ad) {
		
		js.temAdjustOpB(ad);
		return "close";
	}
	
	@GetMapping("adhumOpB")
	public String adhumOpB(HttpServletRequest request, AdDTO ad) {
		
		js.humAdjustOpB(ad);
		return "close";
	}

	//OpC
	@GetMapping("opC")
	public void dthOpC (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dthOpC", js.dhtOpC(yang));
		// 최대온도
		model.addAttribute("highTemOpC", js.highTemOpC(yang));
		// 최저온도
		model.addAttribute("lowTemOpC", js.lowTemOpC(yang));
		// 최대습도
		model.addAttribute("highHumOpC", js.highHumOpC(yang));
		// 최저습도
		model.addAttribute("lowHumOpC", js.lowHumOpC(yang));
		// 평균온도
		model.addAttribute("averageTemOpC", js.averageTemOpC(yang));
		// 평균습도
		model.addAttribute("averageHumOpC", js.averageHumOpC(yang));
		// 기준온도
		model.addAttribute("adtOpC", js.temAdNowOpC(ad));
		// 기준습도
		model.addAttribute("adhOpC", js.humAdNowOpC(ad));
	}
	

	@GetMapping("temAdjustOpC")
	public void taOpC(Model model, AdDTO ad) {
		// 기준온도
		Model ca = model.addAttribute("adtOpC", js.temAdNowOpC(ad));
		// 기준습도
		model.addAttribute("adhOpC", js.humAdNowOpC(ad));		
		
		System.out.println(ca);
	}
	
	@GetMapping("humAdjustOpC")
	public void haOpC(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtOpC", js.temAdNowOpC(ad));
		// 기준습도
		model.addAttribute("adhOpC", js.humAdNowOpC(ad));
	}
	
	@GetMapping("adtemOpC")
	public String adtemOpC(HttpServletRequest request, AdDTO ad) {
		
		js.temAdjustOpC(ad);
		return "close";
	}
	
	@GetMapping("adhumOpC")
	public String adhumOpC(HttpServletRequest request, AdDTO ad) {
	
		js.humAdjustOpC(ad);
		return "close";
	}
	
	//InA
	@GetMapping("inA")
	public void dthInA (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dthInA", js.dhtInA(yang));
		// 최대온도
		model.addAttribute("highTemInA", js.highTemInA(yang));
		// 최저온도
		model.addAttribute("lowTemInA", js.lowTemInA(yang));
		// 최대습도
		model.addAttribute("highHumInA", js.highHumInA(yang));
		// 최저습도
		model.addAttribute("lowHumInA", js.lowHumInA(yang));
		// 평균온도
		model.addAttribute("averageTemInA", js.averageTemInA(yang));
		// 평균습도
		model.addAttribute("averageHumInA", js.averageHumInA(yang));
		// 기준온도
		model.addAttribute("adtInA", js.temAdNowInA(ad));
		// 기준습도
		model.addAttribute("adhInA", js.humAdNowInA(ad));
	}

	@GetMapping("temAdjustInA")
	public void taInA(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtInA", js.temAdNowInA(ad));
		// 기준습도
		model.addAttribute("adhInA", js.humAdNowInA(ad));		
	}
	
	@GetMapping("humAdjustInA")
	public void haInA(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtInA", js.temAdNowInA(ad));
		// 기준습도
		model.addAttribute("adhInA", js.humAdNowInA(ad));
	}
	
	@GetMapping("adtemInA")
	public String adtemInA(HttpServletRequest request, AdDTO ad) {
		
		js.temAdjustInA(ad);
		return "close";
	}
	
	@GetMapping("adhumInA")
	public String adhumInA(HttpServletRequest request, AdDTO ad) {
		
		js.humAdjustInA(ad);
		return "close";
	}
	
	//InB
	@GetMapping("inB")
	public void dthInB (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dthInB", js.dhtInB(yang));
		// 최대온도
		model.addAttribute("highTemInB", js.highTemInB(yang));
		// 최저온도
		model.addAttribute("lowTemInB", js.lowTemInB(yang));
		// 최대습도
		model.addAttribute("highHumInB", js.highHumInB(yang));
		// 최저습도
		model.addAttribute("lowHumInB", js.lowHumInB(yang));
		// 평균온도
		model.addAttribute("averageTemInB", js.averageTemInB(yang));
		// 평균습도
		model.addAttribute("averageHumInB", js.averageHumInB(yang));
		// 기준온도
		model.addAttribute("adtInB", js.temAdNowInB(ad));
		// 기준습도
		model.addAttribute("adhInB", js.humAdNowInB(ad));
	}
	
	@GetMapping("temAdjustInB")
	public void taInB(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtInB", js.temAdNowInB(ad));
		// 기준습도
		model.addAttribute("adhInB", js.humAdNowInB(ad));	
	}
	
	@GetMapping("humAdjustInB")
	public void haInB(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtInB", js.temAdNowInB(ad));
		// 기준습도
		model.addAttribute("adhInB", js.humAdNowInB(ad));
	}
	
	@GetMapping("adtemInB")
	public String adtemInB(HttpServletRequest request, AdDTO ad) {
		
		js.temAdjustInB(ad);
		return "close";
	}
	
	@GetMapping("adhumInB")
	public String adhumInB(HttpServletRequest request, AdDTO ad) {
		
		js.humAdjustInB(ad);
		return "close";
	}
	
	//InC
	@GetMapping("inC")
	public void dthInC (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dthInC", js.dhtInC(yang));
		// 최대온도
		model.addAttribute("highTemInC", js.highTemInC(yang));
		// 최저온도
		model.addAttribute("lowTemInC", js.lowTemInC(yang));
		// 최대습도
		model.addAttribute("highHumInC", js.highHumInC(yang));
		// 최저습도
		model.addAttribute("lowHumInC", js.lowHumInC(yang));
		// 평균온도
		model.addAttribute("averageTemInC", js.averageTemInC(yang));
		// 평균습도
		model.addAttribute("averageHumInC", js.averageHumInC(yang));
		// 기준온도
		model.addAttribute("adtInC", js.temAdNowInC(ad));
		// 기준습도
		model.addAttribute("adhInC", js.humAdNowInC(ad));
	}

	@GetMapping("temAdjustInC")
	public void taInC(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtInC", js.temAdNowInC(ad));
		// 기준습도
		model.addAttribute("adhInC", js.humAdNowInC(ad));	
	}
	
	@GetMapping("humAdjustInC")
	public void haInC(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtInC", js.temAdNowInC(ad));
		// 기준습도
		model.addAttribute("adhInC", js.humAdNowInC(ad));
	}
	
	@GetMapping("adtemInC")
	public String adtemInC(HttpServletRequest request, AdDTO ad) {	
		
		js.temAdjustInC(ad);
		return "close";
	}
	
	@GetMapping("adhumInC")
	public String adhumInC(HttpServletRequest request, AdDTO ad) {
		
		js.humAdjustInC(ad);
		return "close2";
	}
	
	//TrA
	@GetMapping("trA")
	public void dthTrA (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dthTrA", js.dhtTrA(yang));
		// 최대온도
		model.addAttribute("highTemTrA", js.highTemTrA(yang));
		// 최저온도
		model.addAttribute("lowTemTrA", js.lowTemTrA(yang));
		// 최대습도
		model.addAttribute("highHumTrA", js.highHumTrA(yang));
		// 최저습도
		model.addAttribute("lowHumTrA", js.lowHumTrA(yang));
		// 평균온도
		model.addAttribute("averageTemTrA", js.averageTemTrA(yang));
		// 평균습도
		model.addAttribute("averageHumTrA", js.averageHumTrA(yang));
		// 기준온도
		model.addAttribute("adtTrA", js.temAdNowTrA(ad));
		// 기준습도
		model.addAttribute("adhTrA", js.humAdNowTrA(ad));
	}

	@GetMapping("temAdjustTrA")
	public void taTrA(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtTrA", js.temAdNowTrA(ad));
		// 기준습도
		model.addAttribute("adhTrA", js.humAdNowTrA(ad));	
	}
	
	@GetMapping("humAdjustTrA")
	public void haTrA(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtTrA", js.temAdNowTrA(ad));
		// 기준습도
		model.addAttribute("adhTrA", js.humAdNowTrA(ad));
	}
	
	@GetMapping("adtemTrA")
	public String adtemTrA(HttpServletRequest request, AdDTO ad) {

		js.temAdjustTrA(ad);
		return "close";
	}
	
	@GetMapping("adhumTrA")
	public String adhumTrA(HttpServletRequest request, AdDTO ad) {

		js.humAdjustTrA(ad);
		return "close";
	}
	
	//TrB
	@GetMapping("trB")
	public void dthTrB (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dthTrB", js.dhtTrB(yang));
		// 최대온도
		model.addAttribute("highTemTrB", js.highTemTrB(yang));
		// 최저온도
		model.addAttribute("lowTemTrB", js.lowTemTrB(yang));
		// 최대습도
		model.addAttribute("highHumTrB", js.highHumTrB(yang));
		// 최저습도
		model.addAttribute("lowHumTrB", js.lowHumTrB(yang));
		// 평균온도
		model.addAttribute("averageTemTrB", js.averageTemTrB(yang));
		// 평균습도
		model.addAttribute("averageHumTrB", js.averageHumTrB(yang));
		// 기준온도
		model.addAttribute("adtTrB", js.temAdNowTrB(ad));
		// 기준습도
		model.addAttribute("adhTrB", js.humAdNowTrB(ad));
	}

	@GetMapping("temAdjustTrB")
	public void taTrB(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtTrB", js.temAdNowTrB(ad));
		// 기준습도
		model.addAttribute("adhTrB", js.humAdNowTrB(ad));	
	}
	
	@GetMapping("humAdjustTrB")
	public void haTrB(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtTrB", js.temAdNowTrB(ad));
		// 기준습도
		model.addAttribute("adhTrB", js.humAdNowTrB(ad));
	}
	
	@GetMapping("adtemTrB")
	public String adtemTrB(HttpServletRequest request, AdDTO ad) {
	
		js.temAdjustTrB(ad);
		return "close";
	}
	
	@GetMapping("adhumTrB")
	public String adhumTrB(HttpServletRequest request, AdDTO ad) {
	
		js.humAdjustTrB(ad);
		return "close";
	}
	
	//TrC
	@GetMapping("trC")
	public void dthTrC (Model model, YangVO yang, AdDTO ad) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dthTrC", js.dhtTrC(yang));
		// 최대온도
		model.addAttribute("highTemTrC", js.highTemTrC(yang));
		// 최저온도
		model.addAttribute("lowTemTrC", js.lowTemTrC(yang));
		// 최대습도
		model.addAttribute("highHumTrC", js.highHumTrC(yang));
		// 최저습도
		model.addAttribute("lowHumTrC", js.lowHumTrC(yang));
		// 평균온도
		model.addAttribute("averageTemTrC", js.averageTemTrC(yang));
		// 평균습도
		model.addAttribute("averageHumTrC", js.averageHumTrC(yang));
		// 기준온도
		model.addAttribute("adtTrC", js.temAdNowTrC(ad));
		// 기준습도
		model.addAttribute("adhTrC", js.humAdNowTrC(ad));
	}

	@GetMapping("temAdjustTrC")
	public void taTrC(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtTrC", js.temAdNowTrC(ad));
		// 기준습도
		model.addAttribute("adhTrC", js.humAdNowTrC(ad));
	}
	
	@GetMapping("humAdjustTrC")
	public void haTrC(Model model, AdDTO ad) {
		// 기준온도
		model.addAttribute("adtTrC", js.temAdNowTrC(ad));
		// 기준습도
		model.addAttribute("adhTrC", js.humAdNowTrC(ad));
	}
	
	@GetMapping("adtemTrC")
	public String adtemTrC(HttpServletRequest request, AdDTO ad) {

		js.temAdjustTrC(ad);
		return "close";
	}
	
	@GetMapping("adhumTrC")
	public String adhumTrC(HttpServletRequest request, AdDTO ad) {

		js.humAdjustTrC(ad);
		return "close";
	}
	

	
}
