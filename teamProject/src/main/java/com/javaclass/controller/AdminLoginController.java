package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.AdminLoginVO;
import com.javaclass.service.AdminLoginService;

@Controller
public class AdminLoginController {
	
	@Autowired
	private AdminLoginService adminLoginServiceImpl;
	
	
	
	
	@RequestMapping("/doLogin")
	public String login(AdminLoginVO vo, HttpSession session) {
		AdminLoginVO result = adminLoginServiceImpl.loginCheck(vo);
		if(result==null) {
			return "adminLogin";
		}else {
			session.setAttribute("adminLoginId", result.getManagerId());
			session.setAttribute("adminLoginNumber", result.getManagerNumber());
			
			return "redirect:adminDashBoard";
		}
	}
	
}

