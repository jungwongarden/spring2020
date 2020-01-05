package com.kgitbank.mvc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class OrmTest {
	public static void main(String[] args) {
		//1.드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok.");
			
			//2.db연결
			String url = "jdbc:mysql://localhost:3308/spring";
			String user = "root";
			String password = "1234";			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok.");
			
			//3.sql문 결정
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
			
			System.out.println("3. sql문 결정 ok.");
			
			//4.sql문 전달
			ResultSet rs = ps.executeQuery();
			System.out.println("4. sql문 전달 ok.");
			ArrayList list = new ArrayList();
			while (rs.next()) { //검색record가 있다!
				MemberDTO dto = new MemberDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setTel(tel);
				System.out.println(dto.getId());
				System.out.println(dto.getPw());
				System.out.println(dto.getName());
				System.out.println(dto.getTel());
				list.add(dto);
			}
			System.out.println("--------------------");
			System.out.println(list); //dto, dto
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

