package com.kgitbank.mvc06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<MemberDTO> selectList() {
		List<MemberDTO> list = my.selectList("member.selectList");
		return list;
	}
	
	public MemberDTO select(MemberDTO memberDTO) {
		MemberDTO dto = my.selectOne("member.select", memberDTO);
		return dto;
	}
	
	public void delete(MemberDTO memberDTO) {
		my.delete("member.delete", memberDTO);
	}
	
	public void insert(MemberDTO memberDTO) {
		my.insert("member.insert", memberDTO);
	}
}
