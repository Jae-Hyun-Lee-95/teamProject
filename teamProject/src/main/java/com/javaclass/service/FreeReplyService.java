package com.javaclass.service;

import java.util.List;

import com.javaclass.domain.FreeReplyVO;

public interface FreeReplyService {

	Integer insertFreeReply(FreeReplyVO vo);
	
	public List<FreeReplyVO> selectAllReply(Integer boardId);
	
}
