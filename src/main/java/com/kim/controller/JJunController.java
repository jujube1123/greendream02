package com.kim.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kim.model.AdDTO;
import com.kim.model.YangVO;
import com.kim.service.JJunService;

@Controller
public class JJunController {
	@Autowired
	JJunService js;
	
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
		double av =js.averageTem(yang);
		System.out.println(av);
		// 기준온도
		model.addAttribute("adt", js.temAdNow(ad));
		// 기준습도
		model.addAttribute("adh", js.humAdNow(ad));
	}
	
	@GetMapping("main")
	public void main (Model model, YangVO yang) {
		
		//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
		model.addAttribute("dth", js.dht(yang));
		
	}
	@GetMapping("temAdjust")
	public void ta() {
		
		
		
	}
	
	@GetMapping("humAdjust")
	public void ha() {
		
	}
	
	@GetMapping("adtem")
	public String adtem(HttpServletRequest request, AdDTO ad) {
		/*String mintem = request.getParameter("mintem");
		String maxtem = request.getParameter("maxtem");*/
		
		js.temAdjust(ad);
		return "close";
	}
	
	@GetMapping("adhum")
	public String adhum(HttpServletRequest request, AdDTO ad) {
		/*String mintem = request.getParameter("mintem");
		String maxtem = request.getParameter("maxtem");*/
		
		js.humAdjust(ad);
		return "close2";
	}
	
}
