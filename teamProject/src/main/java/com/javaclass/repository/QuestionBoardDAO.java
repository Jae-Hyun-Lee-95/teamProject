package com.javaclass.repository;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.QuestionBoardVO;


public interface QuestionBoardDAO {
	
	public void insertQuestionBoard(QuestionBoardVO vo);
	
	public List<QuestionBoardVO> getQuestionBoardList(HashMap map);
	
	public void deleteQuestionBoard(QuestionBoardVO vo);
	
	public QuestionBoardVO answerBoard(QuestionBoardVO vo);
	
	public void updateQuestionBoard(QuestionBoardVO vo);

}
