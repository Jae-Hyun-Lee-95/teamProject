package com.javaclass.service;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.UserVO;

public interface UserService {

	public void insertUser(UserVO vo);
	public UserVO loginCheck(UserVO vo);
	public UserVO findPassword(UserVO vo);
	List<UserVO> getUserBoardList(HashMap map);
	void deleteUserBoard(UserVO vo);
	UserVO modifyUserBoard(UserVO vo);
	void updateUserBoard(UserVO vo);
}