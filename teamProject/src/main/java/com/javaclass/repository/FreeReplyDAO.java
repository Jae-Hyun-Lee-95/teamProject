package com.javaclass.repository;

import java.util.List;

import com.javaclass.domain.FreeReplyVO;

public interface FreeReplyDAO {

	public Integer insertFreeReply(FreeReplyVO vo);
	public List<FreeReplyVO> selectAllReply(Integer boardId);
	
	
}
