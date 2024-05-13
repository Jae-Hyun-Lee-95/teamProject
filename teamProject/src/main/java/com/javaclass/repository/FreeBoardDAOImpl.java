package com.javaclass.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.FreeBoardVO;

@Repository
public class FreeBoardDAOImpl implements FreeBoardDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertFreeBoard(FreeBoardVO vo) {
		mybatis.insert("FreeBoardDAO.insertFreeBoard", vo);
	}
	
	public List<FreeBoardVO> getFreeBoardList(HashMap map){
		List<FreeBoardVO> list = mybatis.selectList("FreeBoardDAO.getFreeBoardList", map);
		return list;
	}
	
	public void deleteFreeBoard(FreeBoardVO vo) {
		mybatis.delete("FreeBoardDAO.deleteFreeBoard", vo);
	}
	
	public FreeBoardVO modifyFreeBoard(FreeBoardVO vo) {
		return mybatis.selectOne("FreeBoardDAO.modifyFreeBoard",vo);
	}
	
	public void updateFreeBoard(FreeBoardVO vo) {
		mybatis.update("FreeBoardDAO.updateFreeBoard", vo);
	}
}
