//package com.kim.model;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class MemberDao {
//	@Autowired
//	private SqlSessionTemplate mybatis;
//	
//	public MemberVO Login(String userid) throws Exception {
//		return mybatis.selectOne("Member.Login", userid);
//	}
//}
//
