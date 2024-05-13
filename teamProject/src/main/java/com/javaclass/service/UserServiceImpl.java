package com.javaclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.domain.UserVO;
import com.javaclass.repository.UserDAO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAOImpl;
	
	public void insertUser(UserVO vo) {
		//System.out.println("Service : " + vo.toString());
		userDAOImpl.insertUser(vo);
	}
	
	public UserVO loginCheck(UserVO vo) {
		//System.out.println("Service : " + vo.toString());
		return userDAOImpl.loginCheck(vo);
	}
	
	public UserVO findPassword(UserVO vo) {
		System.out.println("Service : " + vo.toString());
		return userDAOImpl.findPassword(vo);
	}
	
}
