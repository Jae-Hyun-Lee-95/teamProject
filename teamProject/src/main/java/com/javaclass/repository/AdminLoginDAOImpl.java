package com.javaclass.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.AdminLoginVO;

@Repository
public class AdminLoginDAOImpl implements AdminLoginDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public AdminLoginVO loginCheck(AdminLoginVO vo) {
		return sqlSession.selectOne("adminLoginDAOImpl.loginCheck", vo);
	}
	
}
