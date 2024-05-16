package com.javaclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.domain.PhotoVO;
import com.javaclass.repository.PhotoDAOImpl;

@Service("photoService")
public class PhotoServiceImpl implements PhotoService{

	@Autowired
	private PhotoDAOImpl photoDAO;
	
	public void insertPhoto(PhotoVO vo) {
		photoDAO.insertPhoto(vo);
	}
	
	public void updatePhoto(PhotoVO vo) {
		photoDAO.updatePhoto(vo);
	}

	public void deletePhoto(PhotoVO vo) {
		photoDAO.deletePhoto(vo);
	}

	public PhotoVO getPhoto(PhotoVO vo) {
		return photoDAO.getPhoto(vo);
	}

	public List<PhotoVO> getPhotoList(PhotoVO vo) {
		return photoDAO.getPhotoList(vo);
	}
	
	public List<PhotoVO> getShowPic(PhotoVO vo){
		return photoDAO.getShowPic(vo);
	}
	
}
