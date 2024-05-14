package com.javaclass.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.UserVO;
import com.javaclass.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("user-pages/insertUser.do")
	public void insertUser(UserVO vo) {
		userServiceImpl.insertUser(vo);
	}
	
	@RequestMapping("/adminDashBoard")
	public void adminUserBoard(Model m, String searchCondition, String searchKeyword) {
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		List<UserVO> list = userServiceImpl.getUserBoardList(map);
		m.addAttribute("userBoardList",list);
	}

	@RequestMapping("user-pages/login.do")
	public String login(UserVO vo, HttpSession session) {
		
		UserVO result = userServiceImpl.loginCheck(vo);
		
		if(result==null) {
			return "authentication-pages/sign-in"; //닉네임이 틀렸습니다 떠야함
		}else {
			session.setAttribute("logEmail", result.getUserEmail());
			return "user-pages/loginConfirm";
		}
	}
	
	@RequestMapping("user-pages/findPassword.do")
	public String findPassword(UserVO vo, HttpSession session) {
		userServiceImpl.findPassword(vo);
		
		UserVO result = userServiceImpl.loginCheck(vo);
		
		if(result==null) {
			return "authentication-pages/forgot-password";
		}else {
			session.setAttribute("logname", result.getUserPassword());
			return "authentication-pages/reset-password";
		}
	}
	
}
