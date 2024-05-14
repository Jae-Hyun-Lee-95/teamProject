package com.javaclass.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.domain.FreeBoardVO;
import com.javaclass.repository.FreeBoardDAO;

@Service
public class FreeBoardServiceImpl implements FreeBoardService {

	@Autowired
	private FreeBoardDAO freeBoardDAO;
	
	public void insertFreeBoard(FreeBoardVO vo) {
		freeBoardDAO.insertFreeBoard(vo);
	}
	
	public List<FreeBoardVO> getFreeBoardList(HashMap map){
		return freeBoardDAO.getFreeBoardList(map);
	}
	
	public void deleteFreeBoard(FreeBoardVO vo) {
		freeBoardDAO.deleteFreeBoard(vo);
	}
	
	public FreeBoardVO modifyFreeBoard(FreeBoardVO vo) {
		return freeBoardDAO.modifyFreeBoard(vo);
	}
	
	public void updateFreeBoard(FreeBoardVO vo) {
		freeBoardDAO.updateFreeBoard(vo);
	}
	
	@Override
    public void updateViewCount(Integer boardId) {
        // boardId에 해당하는 게시물의 조회수를 1 증가시킵니다.
        freeBoardDAO.updateViewCount(boardId);
    }
	
}
