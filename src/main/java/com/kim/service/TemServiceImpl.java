package com.kim.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kim.mapper.TemMapper;
import com.kim.model.TemVO;

@Service
public class TemServiceImpl implements TemService{

	@Autowired
	TemMapper tm;
	
	public ArrayList<TemVO> temList(TemVO vo){
		return tm.temList(vo);
	}
	public ArrayList<TemVO> temListOpB(TemVO vo){
		return tm.temListOpB(vo);
	}
	public ArrayList<TemVO> temListOpC(TemVO vo){
		return tm.temListOpC(vo);
	}
	public ArrayList<TemVO> temListInA(TemVO vo){
		return tm.temListInA(vo);
	}
	public ArrayList<TemVO> temListInB(TemVO vo){
		return tm.temListInB(vo);
	}
	public ArrayList<TemVO> temListInC(TemVO vo){
		return tm.temListInC(vo);
	}
	public ArrayList<TemVO> temListTrA(TemVO vo){
		return tm.temListTrA(vo);
	}
	public ArrayList<TemVO> temListTrB(TemVO vo){
		return tm.temListTrB(vo);
	}
	public ArrayList<TemVO> temListTrC(TemVO vo){
		return tm.temListTrC(vo);
	}
}
