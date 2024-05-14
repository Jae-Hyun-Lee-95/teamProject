package com.javaclass.repository;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.FreeBoardVO;

public interface FreeBoardDAO {

	public void insertFreeBoard(FreeBoardVO vo);
	
	public List<FreeBoardVO> getFreeBoardList(HashMap map);
	
	public void deleteFreeBoard(FreeBoardVO vo);
	
	public FreeBoardVO modifyFreeBoard(FreeBoardVO vo);
	
	public void updateFreeBoard(FreeBoardVO vo);
	
	public void updateViewCount(Integer boardId);
}
