package vn.com.vti.springexam.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/currentTime")
public class CurrentTimeController {
	
	@RequestMapping(value="/index", produces = "text/html; charset=utf-8")
	@ResponseBody
	public String index() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String dateStr = dateFormat.format(date);
		
		String result = "";
		result += "<html>";
		result += "<head><meta charset=\"UTF-8\"></head>";
		result += "<body>";
		result += "<p>";
		result += "現在:"+dateStr;
		result += "</p>";
		result += "</body>";
		result += "</html>";
		return result;
	}
}
