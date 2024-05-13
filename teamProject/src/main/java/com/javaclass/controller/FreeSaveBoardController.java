package com.javaclass.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.FreeBoardVO;
import com.javaclass.service.FreeBoardService;

@Controller
public class FreeSaveBoardController {
	
	@Autowired
	private FreeBoardService freeBoardService;

	@RequestMapping("/freeSaveBoard.do")
	public String freeSaveBoard(FreeBoardVO vo) {
		
		freeBoardService.insertFreeBoard(vo);
		return "redirect:freeBoard.do";
	}
	
	@RequestMapping("/freeBoard")
	public void freeBoard(Model m, String searchCondition, String searchKeyword) {
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		List<FreeBoardVO> list = freeBoardService.getFreeBoardList(map);
		m.addAttribute("freeBoardList",list);
	}
	
	@RequestMapping("/adminBoard")
	public void adminBoard(Model m, String searchCondition, String searchKeyword) {
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		List<FreeBoardVO> list = freeBoardService.getFreeBoardList(map);
		m.addAttribute("freeBoardList",list);
	}
	
	@RequestMapping("/adminDeleteFreeBoard")
	public String deleteFreeBoard(FreeBoardVO vo) {
		//System.out.println("deleteBoard 요청");
		freeBoardService.deleteFreeBoard(vo);
		return "redirect:adminBoard";
	}
	
	@RequestMapping("/adminModifyFreeBoard")
	public void modifyFreeBoard(FreeBoardVO vo, Model m) {
		FreeBoardVO result = freeBoardService.modifyFreeBoard(vo);
		m.addAttribute("freeBoard",result);
	}
	
	@RequestMapping("/adminUpdateFreeBoard")
	public String updateFreeBoard(FreeBoardVO vo) {
		freeBoardService.updateFreeBoard(vo);
		
		return "redirect:adminBoard";
	}
	
	@RequestMapping("/detailFreeBoard")
	public void detailFreeBoard(FreeBoardVO vo, Model m) {
		FreeBoardVO result = freeBoardService.modifyFreeBoard(vo);
		m.addAttribute("detailFreeBoard",result);
	}
}
