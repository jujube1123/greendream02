package com.kim.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kim.model.TemVO;
import com.kim.service.TemService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private TemService ts;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "ss", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "temList", method = RequestMethod.GET)
	public String temList(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temList(vo);
		model.addAttribute("tem",ts.temList(vo));
		
		//System.out.println(tem);
		
		return "temCharts";
	}
	
	@RequestMapping(value = "temCharts", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temCharts(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temList(vo);
		model.addAttribute("tem",tem);
		
		//System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humList", method = RequestMethod.GET)
	public String humList(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temList(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		
		return "humCharts";
	}
	
	@RequestMapping(value = "humCharts", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humCharts(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temList(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}
	
}
