package com.javaclass.repository;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.AdminBoardVO;

public interface AdminBoardDAO {
	
	public void insertBoard(AdminBoardVO vo);
	
	public List<AdminBoardVO> getBoardList(HashMap map);
	
	public void deleteBoard(AdminBoardVO vo);

	public AdminBoardVO getBoard(AdminBoardVO vo);
	
	public void updateBoard(AdminBoardVO vo);
}
