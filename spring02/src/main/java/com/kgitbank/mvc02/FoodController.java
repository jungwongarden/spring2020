package com.kgitbank.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

	@RequestMapping("food")
	public String food(String name, String price) {
		int price2 = Integer.parseInt(price);
		if(price2 >= 5000) {
			return "up";
		}else {
			return "down";
		}
	}
}






