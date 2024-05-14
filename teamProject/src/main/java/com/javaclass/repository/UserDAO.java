package com.javaclass.repository;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.UserVO;

public interface UserDAO {
	public void insertUser(UserVO vo);
	public List<UserVO> getUserBoardList(HashMap map);
	public UserVO loginCheck(UserVO vo);
	public UserVO findPassword(UserVO vo);
}
