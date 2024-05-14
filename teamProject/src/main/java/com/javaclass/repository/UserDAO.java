package com.javaclass.repository;

import java.util.HashMap;
import java.util.List;

import com.javaclass.domain.UserVO;

public interface UserDAO {
	public void insertUser(UserVO vo);
	public List<UserVO> getUserBoardList(HashMap map);
	public UserVO loginCheck(UserVO vo);
	public UserVO findPassword(UserVO vo);
	public void deleteUserBoard(UserVO vo);
	public UserVO modifyUserBoard(UserVO vo);
	public void updateUserBoard(UserVO vo);
}
