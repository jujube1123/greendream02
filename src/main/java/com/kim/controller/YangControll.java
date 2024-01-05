package com.kim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kim.model.YangVO;
import com.kim.service.YangService;

@Controller
public class YangControll {
	
	@Autowired
	YangService ys;
	
	@GetMapping("/")
	public String dth (Model model, YangVO yang) {
		
			//페이지 실행 시 라즈베리파이로 입력한 DB의  온도, 습도, 시간 정보를 배열에 담아서 가져옴
			model.addAttribute("dth", ys.dht(yang));
			return "home";
	}
}
