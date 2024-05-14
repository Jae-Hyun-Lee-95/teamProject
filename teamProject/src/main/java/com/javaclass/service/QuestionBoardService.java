package com.javaclass.service;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.AdminBoardVO;
import com.javaclass.domain.QuestionBoardVO;


public interface QuestionBoardService {
	
	void insertQuestionBoard(QuestionBoardVO vo);
	
	List<QuestionBoardVO> getQuestionBoardList(HashMap map);
	
	void deleteQuestionBoard(QuestionBoardVO vo);
	
	QuestionBoardVO answerBoard(QuestionBoardVO vo);
	
	void updateQuestionBoard(QuestionBoardVO vo);
	
	void questionUpdateBoard(QuestionBoardVO vo);

}
