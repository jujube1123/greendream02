package com.kim.service;

import java.util.ArrayList;
import java.util.List;

import com.kim.model.TemVO;

public interface TemService {

		public ArrayList<TemVO> temList(TemVO vo);
		public ArrayList<TemVO> temListOpB(TemVO vo);
		public ArrayList<TemVO> temListOpC(TemVO vo);
		public ArrayList<TemVO> temListInA(TemVO vo);
		public ArrayList<TemVO> temListInB(TemVO vo);
		public ArrayList<TemVO> temListInC(TemVO vo);
		public ArrayList<TemVO> temListTrA(TemVO vo);
		public ArrayList<TemVO> temListTrB(TemVO vo);
		public ArrayList<TemVO> temListTrC(TemVO vo);
}
