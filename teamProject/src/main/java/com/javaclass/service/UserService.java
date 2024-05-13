package com.javaclass.service;

import com.javaclass.domain.UserVO;

public interface UserService {

	public void insertUser(UserVO vo);
	public UserVO loginCheck(UserVO vo);
	public UserVO findPassword(UserVO vo);
}