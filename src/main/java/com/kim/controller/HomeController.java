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
	//OpA
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
	//OpB
	@RequestMapping(value = "temListOpB", method = RequestMethod.GET)
	public String temListOpB(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListOpB(vo);
		model.addAttribute("tem",ts.temListOpB(vo));
		
		System.out.println(tem);
		
		return "temChartsOpB";
	}
	
	@RequestMapping(value = "temChartsOpB", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temChartsOpB(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListOpB(vo);
		model.addAttribute("tem",tem);
		
		System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humListOpB", method = RequestMethod.GET)
	public String humListOpB(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListOpB(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		System.out.println(hum);
		return "humChartsOpB";
	}
	
	@RequestMapping(value = "humChartsOpB", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humChartsOpB(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListOpB(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}

	//OpC
	@RequestMapping(value = "temListOpC", method = RequestMethod.GET)
	public String temListOpC(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListOpC(vo);
		model.addAttribute("tem",ts.temListOpC(vo));
		
		//System.out.println(tem);
		
		return "temChartsOpC";
	}
	
	@RequestMapping(value = "temChartsOpC", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temChartsOpC(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListOpC(vo);
		model.addAttribute("tem",tem);
		
		//System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humListOpC", method = RequestMethod.GET)
	public String humListOpC(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListOpC(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		
		return "humChartsOpC";
	}
	
	@RequestMapping(value = "humChartsOpC", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humChartsOpC(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListOpC(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}

	//InA
	@RequestMapping(value = "temListInA", method = RequestMethod.GET)
	public String temListInA(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListInA(vo);
		model.addAttribute("tem",ts.temListInA(vo));
		
		//System.out.println(tem);
		
		return "temChartsInA";
	}
	
	@RequestMapping(value = "temChartsInA", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temChartsInA(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListInA(vo);
		model.addAttribute("tem",tem);
		
		//System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humListInA", method = RequestMethod.GET)
	public String humListInA(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListInA(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		
		return "humChartsInA";
	}
	
	@RequestMapping(value = "humChartsInA", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humChartsInA(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListInA(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}

	//InB
	@RequestMapping(value = "temListInB", method = RequestMethod.GET)
	public String temListInB(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListInB(vo);
		model.addAttribute("tem",ts.temListInB(vo));
		
		//System.out.println(tem);
		
		return "temChartsInB";
	}
	
	@RequestMapping(value = "temChartsInB", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temChartsInB(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListInB(vo);
		model.addAttribute("tem",tem);
		
		//System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humListInB", method = RequestMethod.GET)
	public String humListInB(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListInB(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		
		return "humChartsInB";
	}
	
	@RequestMapping(value = "humChartsInB", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humChartsInB(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListInB(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}

	//InC
	@RequestMapping(value = "temListInC", method = RequestMethod.GET)
	public String temListInC(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListInC(vo);
		model.addAttribute("tem",ts.temListInC(vo));
		
		//System.out.println(tem);
		
		return "temCharts";
	}
	
	@RequestMapping(value = "temChartsInC", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temChartsInC(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListInC(vo);
		model.addAttribute("tem",tem);
		
		//System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humListInC", method = RequestMethod.GET)
	public String humListInC(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListInC(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		
		return "humChartsInC";
	}
	
	@RequestMapping(value = "humChartsInC", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humChartsInC(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListInC(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}

	//TrA
	@RequestMapping(value = "temListTrA", method = RequestMethod.GET)
	public String temListTrA(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListTrA(vo);
		model.addAttribute("tem",ts.temListTrA(vo));
		
		//System.out.println(tem);
		
		return "temChartsTrA";
	}
	
	@RequestMapping(value = "temChartsTrA", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temChartsTrA(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListTrA(vo);
		model.addAttribute("tem",tem);
		
		//System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humListTrA", method = RequestMethod.GET)
	public String humListTrA(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListTrA(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		
		return "humChartsTrA";
	}
	
	@RequestMapping(value = "humChartsTrA", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humChartsTrA(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListTrA(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}

	//TrB
	@RequestMapping(value = "temListTrB", method = RequestMethod.GET)
	public String temListTrB(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListTrB(vo);
		model.addAttribute("tem",ts.temListTrB(vo));
		
		//System.out.println(tem);
		
		return "temChartsTrB";
	}
	
	@RequestMapping(value = "temChartsTrB", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temChartsTrB(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListTrB(vo);
		model.addAttribute("tem",tem);
		
		//System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humListTrB", method = RequestMethod.GET)
	public String humListTrB(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListTrB(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		
		return "humChartsTrB";
	}
	
	@RequestMapping(value = "humChartsTrB", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humChartsTrB(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListTrB(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}

	//TrC
	@RequestMapping(value = "temListTrC", method = RequestMethod.GET)
	public String temListTrC(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListTrC(vo);
		model.addAttribute("tem",ts.temListTrC(vo));
		
		//System.out.println(tem);
		
		return "temChartsTrC";
	}
	
	@RequestMapping(value = "temChartsTrC", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> temChartsTrC(Model model, TemVO vo) {
		ArrayList<TemVO> tem = ts.temListTrC(vo);
		model.addAttribute("tem",tem);
		
		//System.out.println(tem);	
		
		//return tem;
		return new ResponseEntity<>(tem,HttpStatus.OK);
	}
	
	@RequestMapping(value = "humListTrC", method = RequestMethod.GET)
	public String humListTrC(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListTrC(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);
		
		return "humChartsTrC";
	}
	
	@RequestMapping(value = "humChartsTrC", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<TemVO>> humChartsTrC(Model model, TemVO vo) {
		ArrayList<TemVO> hum = ts.temListTrC(vo);
		model.addAttribute("hum",hum);
		
		//System.out.println(hum);	
		
		//return tem;
		return new ResponseEntity<>(hum,HttpStatus.OK);
	}


	

}
