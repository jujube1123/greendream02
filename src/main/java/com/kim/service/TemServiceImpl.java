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
	
	public List<TemVO> temData() {
		return tm.temData();
	}
}
