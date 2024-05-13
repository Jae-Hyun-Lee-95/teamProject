package com.javaclass.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void insertUser(UserVO vo) {
		//System.out.println("dao : " + vo.toString());
		sqlSession.insert("org.javassem.UserMapper.insertUser", vo);
	}
	
	public UserVO loginCheck(UserVO vo) {
		//System.out.println("dao : " + vo.toString());
		return sqlSession.selectOne("org.javassem.UserMapper.loginCheck", vo);
	}
	
	public UserVO findPassword(UserVO vo) {
		System.out.println("dao : " + vo.toString());
		return sqlSession.selectOne("org.javassem.UserMapper.findPassword", vo);
	}
}
