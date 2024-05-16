package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home-pages")
public class homeController {

	/*
	 * @RequestMapping("/home-01.do") public void homePage1() { }
	 */
	
	@RequestMapping("/home-02.do")
	public void homePage2() {
	}
}
