package com.javaclass.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.repository.AdminBoardDAO;
import com.javaclass.domain.AdminBoardVO;

@Service
public class AdminBoardServiceImpl implements AdminBoardService {

	@Autowired
	private AdminBoardDAO boardDAO;
	
	
	public void insertBoard(AdminBoardVO vo) {
		boardDAO.insertBoard(vo);
	}
	
	public List<AdminBoardVO> getBoardList(HashMap map){
		return boardDAO.getBoardList(map);
	}
	
	public void deleteBoard(AdminBoardVO vo) {
		boardDAO.deleteBoard(vo);
	}
	
	public AdminBoardVO getBoard(AdminBoardVO vo) {
		return boardDAO.getBoard(vo);
	}
	
	public void updateBoard(AdminBoardVO vo) {
		boardDAO.updateBoard(vo);
	}
}
