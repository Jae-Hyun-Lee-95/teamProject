package com.javaclass.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.AdminBoardVO;
import com.javaclass.service.AdminBoardService;

@Controller
public class AdminBoardController {

	@Autowired
	private AdminBoardService boardService;
	
	@RequestMapping("/saveBoard")
	public String saveBoard(AdminBoardVO vo, Model m) {
		boardService.insertBoard(vo);
		
		
		return "redirect:adminAnnouncements";
	}
	
	@RequestMapping("/adminAnnouncements")
	public void adminAnnouncements(Model m, String searchCondition, String searchKeyword) {
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		List<AdminBoardVO> list = boardService.getBoardList(map);
		System.out.println(list);
		m.addAttribute("boardList",list);
	}
	
	
	@RequestMapping("/blog")
	public void blog(Model m, String searchCondition, String searchKeyword) {
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		List<AdminBoardVO> list = boardService.getBoardList(map);
		m.addAttribute("boardList",list);
	}
	
	@RequestMapping("/adminDeleteBoard")
	public String deleteBoard(AdminBoardVO vo) {
		//System.out.println("deleteBoard 요청");
		boardService.deleteBoard(vo);
		return "redirect:adminAnnouncements";
	}
	
	@RequestMapping("/adminModifyBoard")
	public void getBoard(AdminBoardVO vo, Model m) {
		AdminBoardVO result = boardService.getBoard(vo);
		m.addAttribute("board",result);
	}
	
	
	@RequestMapping("/adminUpdateBoard")
	public String updateBoard(AdminBoardVO vo) {
		boardService.updateBoard(vo);
		
		return "redirect:adminAnnouncements";
	}
	
}
