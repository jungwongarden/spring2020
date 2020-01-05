package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	//싱글톤 만들어진 객체의 주소값을 찾아서
	//dao변수에 넣어주렴.
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) {
		System.out.println("컨트롤로에서 입력한 값 받음..");
		//db처리...
		dao.insert(memberDTO);
		//views아래에 insert.jsp호출
	}
}





