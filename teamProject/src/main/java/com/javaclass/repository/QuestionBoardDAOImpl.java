package com.javaclass.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.FreeBoardVO;
import com.javaclass.domain.QuestionBoardVO;

@Repository
public class QuestionBoardDAOImpl implements QuestionBoardDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertQuestionBoard(QuestionBoardVO vo) {
		mybatis.insert("QuestionBoardDAO.insertQuestionBoard", vo);
	}
	
	public List<QuestionBoardVO> getQuestionBoardList(HashMap map){
		List<QuestionBoardVO> list = mybatis.selectList("QuestionBoardDAO.getQuestionBoardList", map);
		return list;
	}

	public void deleteQuestionBoard(QuestionBoardVO vo) {
		mybatis.delete("QuestionBoardDAO.deleteQuestionBoard", vo);
	}
	
	public QuestionBoardVO answerBoard(QuestionBoardVO vo) {
		return mybatis.selectOne("QuestionBoardDAO.answerBoard",vo);
	}
	
	public void updateQuestionBoard(QuestionBoardVO vo) {
		mybatis.update("QuestionBoardDAO.updateQuestionBoard", vo);
	}

}
