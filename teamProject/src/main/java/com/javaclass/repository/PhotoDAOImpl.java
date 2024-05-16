package com.javaclass.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.PhotoVO;

@Repository("photoDAO")
public class PhotoDAOImpl implements PhotoDAO{
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertPhoto(PhotoVO vo) {
		
		mybatis.insert("PhotoDAO.insertPhoto", vo);
	}
	
	public void updatePhoto(PhotoVO vo) {
		
		mybatis.update("PhotoDAO.updatePhoto", vo);
	}
	
	public void deletePhoto(PhotoVO vo) {
		
		mybatis.delete("PhotoDAO.deletePhoto", vo);
	}
	
	public void deletePictureBoard(PhotoVO vo) {
		
		mybatis.delete("PhotoDAO.deletePictureBoard", vo);
	}
	
	public PhotoVO getPhoto(PhotoVO vo) {
		
		return (PhotoVO) mybatis.selectOne("PhotoDAO.getPhoto", vo);
	}
	
	public List<PhotoVO> getPhotoList(PhotoVO vo) {
		
		return mybatis.selectList("PhotoDAO.getPhotoList", vo);
	}
	
	public List<PhotoVO> getShowPic(PhotoVO vo) {
		
		return mybatis.selectList("PhotoDAO.getShowPic", vo);
	}

}
