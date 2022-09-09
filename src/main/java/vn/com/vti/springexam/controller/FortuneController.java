package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {
	@RequestMapping("/fortune")
	public String index(Model model) {
		
		Random rand = new Random();
		Integer luck = rand.nextInt(3);
		
		String result = "";
		switch (luck) {
		case 0:
			result ="Bad!";
			break;
		case 1:
			result ="Normal";
			break;
		case 2:
			result ="Lucky!";
			break;
		}
		model.addAttribute("fortuneValue", result);
		return "fortune";
	}
	
}
