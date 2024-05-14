package com.javaclass.service;

import java.util.HashMap;
import java.util.List;

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
	
	public List<UserVO> getUserBoardList(HashMap map){
		//System.out.println(map);
		return userDAOImpl.getUserBoardList(map);
	}
	
	public UserVO loginCheck(UserVO vo) {
		//System.out.println("Service : " + vo.toString());
		return userDAOImpl.loginCheck(vo);
	}
	
	public UserVO findPassword(UserVO vo) {
	
		return userDAOImpl.findPassword(vo);
	}
	
	public void deleteUserBoard(UserVO vo) {
		userDAOImpl.deleteUserBoard(vo);
	}
	
	public UserVO modifyUserBoard(UserVO vo) {
		return userDAOImpl.modifyUserBoard(vo);
	}
	
	public void updateUserBoard(UserVO vo) {
		userDAOImpl.updateUserBoard(vo);
	}
	
}
