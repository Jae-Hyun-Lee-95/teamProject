package com.javaclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.domain.FreeReplyVO;
import com.javaclass.repository.FreeReplyDAO;

@Service
public class FreeReplyServiceImpl implements FreeReplyService {
	
	@Autowired
	FreeReplyDAO freeReplyDAO;

	public Integer insertFreeReply(FreeReplyVO vo) {
		Integer result = freeReplyDAO.insertFreeReply(vo);
		return result;
	}
	
	public List<FreeReplyVO> selectAllReply(Integer boardId){
		return freeReplyDAO.selectAllReply(boardId);
	}
}
