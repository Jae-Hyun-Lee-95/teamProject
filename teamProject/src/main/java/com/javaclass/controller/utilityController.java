package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("utility-pages")
public class utilityController {

	@RequestMapping("/changelog.do")
	public void changelog() {
	}
	
	@RequestMapping("/license.do")
	public void license() {
	}
	
	@RequestMapping("/style-guide.do")
	public void styleGuide() {
	}
}
