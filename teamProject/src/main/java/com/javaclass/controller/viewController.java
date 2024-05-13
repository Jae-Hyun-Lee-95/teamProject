package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {

	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {
		return step;
	}

	/*
	@RequestMapping("/about-us.do")
	public void aboutUs() {
	}
	*/
}
