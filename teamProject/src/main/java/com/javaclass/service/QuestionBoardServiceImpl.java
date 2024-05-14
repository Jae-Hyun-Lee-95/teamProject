package com.javaclass.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.domain.AdminBoardVO;
import com.javaclass.domain.QuestionBoardVO;
import com.javaclass.repository.QuestionBoardDAO;

@Service
public class QuestionBoardServiceImpl implements QuestionBoardService {

	@Autowired
	private QuestionBoardDAO questionBoardDAO;
	
	public void insertQuestionBoard(QuestionBoardVO vo) {
		questionBoardDAO.insertQuestionBoard(vo);
	}
	
	public List<QuestionBoardVO> getQuestionBoardList(HashMap map){
		return questionBoardDAO.getQuestionBoardList(map);
	}
	
	public void deleteQuestionBoard(QuestionBoardVO vo) {
		questionBoardDAO.deleteQuestionBoard(vo);
	}
	
	public QuestionBoardVO answerBoard(QuestionBoardVO vo) {
		return questionBoardDAO.answerBoard(vo);
	}
	
	public void updateQuestionBoard(QuestionBoardVO vo) {
		questionBoardDAO.updateQuestionBoard(vo);
	}
	
	public void questionUpdateBoard(QuestionBoardVO vo) {
		questionBoardDAO.questionUpdateBoard(vo);
	}
	
}
