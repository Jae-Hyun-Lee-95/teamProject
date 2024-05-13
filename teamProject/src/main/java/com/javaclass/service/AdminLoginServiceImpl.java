package com.javaclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.repository.AdminLoginDAO;
import com.javaclass.domain.AdminLoginVO;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminLoginDAO adminLoginDAOImpl;
	
	public AdminLoginVO loginCheck(AdminLoginVO vo) {
		return adminLoginDAOImpl.loginCheck(vo);
	}
	
}
