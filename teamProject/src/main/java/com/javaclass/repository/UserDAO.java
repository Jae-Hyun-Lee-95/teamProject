package com.javaclass.repository;

import com.javaclass.domain.UserVO;

public interface UserDAO {
	public void insertUser(UserVO vo);
	public UserVO loginCheck(UserVO vo);
	public UserVO findPassword(UserVO vo);
}
