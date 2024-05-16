package com.javaclass.repository;

import java.util.List;

import com.javaclass.domain.PhotoVO;

public interface PhotoDAO {
	public void insertPhoto(PhotoVO vo);

	public void updatePhoto(PhotoVO vo) ;

	public void deletePhoto(PhotoVO vo);

	public PhotoVO getPhoto(PhotoVO vo) ;

	public List<PhotoVO> getPhotoList(PhotoVO vo) ;
	
	public List<PhotoVO> getShowPic(PhotoVO vo);

}
