package com.javaclass.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.FreeBoardVO;
import com.javaclass.domain.QuestionBoardVO;
import com.javaclass.service.QuestionBoardService;



@Controller
public class QuestionBoardController {

	@Autowired
	private QuestionBoardService questionBoardService;
	
	@RequestMapping("/questionSaveBoard.do")
	public String questionSaveBoard(QuestionBoardVO vo) {
		
		questionBoardService.insertQuestionBoard(vo);
		return "redirect:questionBoard.do";
	}
	
	@RequestMapping("/questionBoard")
	public void questionBoard(Model m, String searchCondition, String searchKeyword) {
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		List<QuestionBoardVO> list = questionBoardService.getQuestionBoardList(map);
		m.addAttribute("questionBoardList",list);
	}
	
	@RequestMapping("/adminQuestion")
	public void adminQuestion(Model m, String searchCondition, String searchKeyword) {
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		List<QuestionBoardVO> list = questionBoardService.getQuestionBoardList(map);
		m.addAttribute("questionBoardList",list);
	}
	
	@RequestMapping("/adminDeleteQuestionBoard")
	public String deleteQuestionBoard(QuestionBoardVO vo) {
		questionBoardService.deleteQuestionBoard(vo);
		return "redirect:adminQuestion";
	}
	
	@RequestMapping("/adminAnswerBoard")
	public void answerBoard(QuestionBoardVO vo, Model m) {
		QuestionBoardVO result = questionBoardService.answerBoard(vo);
		m.addAttribute("answerBoard",result);
	}
	
	@RequestMapping("/adminUpdateQuestionBoard")
	public String updateQuestionBoard(QuestionBoardVO vo) {
		questionBoardService.updateQuestionBoard(vo);
		
		return "redirect:adminQuestion";
	}
	
	@RequestMapping("/answerBoard")
	public void detailAnswerBoard(QuestionBoardVO vo, Model m) {
		QuestionBoardVO result = questionBoardService.answerBoard(vo);
		m.addAttribute("answerBoard",result);
	}
	
}
