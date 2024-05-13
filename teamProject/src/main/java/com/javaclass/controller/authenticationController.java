package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("authentication-pages")
public class authenticationController {

	@RequestMapping("/sign-in.do")
	public void signIn() {
	}
	
	@RequestMapping("/sign-up.do")
	public void signUp() {
	}
	
	@RequestMapping("/forgot-password.do")
	public void forgotPassword() {
	}
	
	@RequestMapping("/reset-password.do")
	public void resetPassword() {
	}
}
