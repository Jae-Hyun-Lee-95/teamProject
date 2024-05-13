package com.javaclass.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.AdminBoardVO;

@Repository
public class AdminBoardDAOImpl implements AdminBoardDAO	 {

	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertBoard(AdminBoardVO vo) {
		System.out.println(vo.toString());
		mybatis.insert("BoardDAO.insertBoard", vo);
		    
	}
	
	public List<AdminBoardVO> getBoardList(HashMap map){
		List<AdminBoardVO> list = mybatis.selectList("BoardDAO.getBoardList", map);
		return list;
	}
	
	public void deleteBoard(AdminBoardVO vo) {
		//System.out.println("mybatis deleteBoard() 호출");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}
	
	public AdminBoardVO getBoard(AdminBoardVO vo) {
		return mybatis.selectOne("BoardDAO.getBoard",vo);
	}
	
	public void updateBoard(AdminBoardVO vo) {
		//System.out.println("mybatis updateBoard() 호출");
		mybatis.update("BoardDAO.updateBoard", vo);
	}
}
