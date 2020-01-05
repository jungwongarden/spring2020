package com.kgitbank.mvc04;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckController {

	@RequestMapping("money.do")
	public void money(String money, String level, Model model) {
		String result = "";
		int money2 = Integer.parseInt(money);
		double money3 = 0;
		switch (level) {
		case "1":
			money3 = money2 * 0.7;
			break;
		case "2":
			money3 = money2 * 0.8;
			break;
		case "3":
			money3 = money2 * 0.9;
			break;
		default:
			money3 = money2;
			break;
		}
		result = "당신의 지불 금액은 " + (int)money3 + "원입니다.";
		model.addAttribute("result5", result);
	}
	
	@RequestMapping("tel2.do")
	public void tel2(String tel, Model model) {
		String result = "";
		String tel2 = tel.substring(0, 3);
		switch (tel2) {
		case "010":
			result = "1111";
			break;
		case "011":
			result = "2222";
			break;
		case "018":
			result = "3333";
			break;
		default:
			result = "4444";
			break;
		}
		model.addAttribute("result4", result);
	}
	
	@RequestMapping("tel.do")
	public void tel(String tel, Model model) {
		String result = "";
		Random	r = new Random();
		int num = r.nextInt(1000);
		result = String.valueOf(num);
		model.addAttribute("result3", result);
	}
	
	
	@RequestMapping("admin.do")
	public void admin(String admin, Model model) {
		String result = "관리자 모드로 로그인할 수 없습니다.";
		if(admin.equals("admin")) {
			result = "관리자모드로 로그인되었습니다.";
		}
		model.addAttribute("result2", result);
	}
	
	@RequestMapping("member.do")
	public void id(String id, Model model) {
		String[] list = {"root", "admin", "manager"};
		String result = "사용할 수 있는 아이디입니다.";
		for(int i = 0; i < 3; i++){
			if(id.equals(list[i])){
				result = "아이디가 이미 사용중입니다.";
			}				
		}
		model.addAttribute("result1", result);
	}
}



