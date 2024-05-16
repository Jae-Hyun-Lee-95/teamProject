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
		System.out.println("===> Mybatis insertPhoto() 호출");
		System.out.println(vo.toString());
		mybatis.insert("PhotoDAO.insertPhoto", vo);
	}
	
	public void updatePhoto(PhotoVO vo) {
		System.out.println("===> Mybatis updatePhoto() 호출");
		mybatis.update("PhotoDAO.updatePhoto", vo);
	}
	
	public void deletePhoto(PhotoVO vo) {
		System.out.println("===> Mybatis deletePhoto() 호출");
		mybatis.delete("PhotoDAO.deletePhoto", vo);
	}
	
	public PhotoVO getPhoto(PhotoVO vo) {
		System.out.println("===> Mybatis getPhoto() 호출");
		return (PhotoVO) mybatis.selectOne("PhotoDAO.getPhoto", vo);
	}
	
	public List<PhotoVO> getPhotoList(PhotoVO vo) {
		System.out.println("===> Mybatis getPhotoList() 호출");
		System.out.println(vo.toString());
		return mybatis.selectList("PhotoDAO.getPhotoList", vo);
	}
	
	public List<PhotoVO> getShowPic(PhotoVO vo) {
		System.out.println("===> Mybatis getShowPic() 호출");
		return mybatis.selectList("PhotoDAO.getShowPic", vo);
	}

}
