package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FortuneController {
	
	@RequestMapping(value ="/fortune", produces = "text/html;charset=utf-8")
	@ResponseBody
	public String index() {
		
		Random rand = new Random();
		Integer luck = rand.nextInt(3);
		
		String result = "";
		if (luck == 0) {
			result ="Bad!";
		} else if (luck == 1) {
			result ="Normal";
		} else {
			result ="Lucky!";
		}
		return result;
	}
	
}
