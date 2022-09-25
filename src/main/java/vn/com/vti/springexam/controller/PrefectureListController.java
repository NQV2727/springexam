package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Prefecture;
import vn.com.vti.springexam.entity.PrefectureExample;
import vn.com.vti.springexam.mapper.PrefectureCustomMapper;
import vn.com.vti.springexam.mapper.PrefectureMapper;

@Controller
@RequestMapping("/prefectureList")
public class PrefectureListController {

	@Autowired
	private PrefectureMapper prefectureMapper;
	
	@Autowired
	private PrefectureCustomMapper prefectureCustomMapper;
	
	@RequestMapping("/index")
	public String index(Model model){
		PrefectureExample prefectureExample = new PrefectureExample();
		prefectureExample.setOrderByClause("ID");
		List<Prefecture> prefectureList = prefectureMapper.selectByExample(prefectureExample);
		
		model.addAttribute("prefectureList", prefectureList);
		return "prefecture/prefectureList";
	}
	
	@RequestMapping("/search")
	public String index2(@RequestParam("name") String name, Model model){
		List<Prefecture> prefectures = prefectureCustomMapper.selectPrefectureByName(name);
		model.addAttribute("prefectures", prefectures);
		return "prefecture/prefectureList";
	}

}
