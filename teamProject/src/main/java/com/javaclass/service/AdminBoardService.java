package com.javaclass.service;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.AdminBoardVO;

public interface AdminBoardService {

	void insertBoard(AdminBoardVO vo);
	
	List<AdminBoardVO> getBoardList(HashMap map);
	
	void deleteBoard(AdminBoardVO vo);
	
	AdminBoardVO getBoard(AdminBoardVO vo);
	
	void updateBoard(AdminBoardVO vo);
	
}
