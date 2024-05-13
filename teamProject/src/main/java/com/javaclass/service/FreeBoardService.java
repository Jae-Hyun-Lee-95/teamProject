package com.javaclass.service;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.FreeBoardVO;

public interface FreeBoardService {
	
	void insertFreeBoard(FreeBoardVO vo);
	
	List<FreeBoardVO> getFreeBoardList(HashMap map);
	
	void deleteFreeBoard(FreeBoardVO vo);

	FreeBoardVO modifyFreeBoard(FreeBoardVO vo);
	
	void updateFreeBoard(FreeBoardVO vo);
}
