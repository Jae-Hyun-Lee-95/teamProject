package com.javaclass.service;

import java.util.List;

import com.javaclass.domain.PhotoVO;

public interface PhotoService {
	// 글 등록
		void insertPhoto(PhotoVO vo);

		// 글 수정
		void updatePhoto(PhotoVO vo);

		// 글 삭제
		void deletePhoto(PhotoVO vo);

		// 글 상세 조회
		PhotoVO getPhoto(PhotoVO vo);

		// 글 목록 조회
		List<PhotoVO> getPhotoList(PhotoVO vo);
		
		//사진 목록 조회
		List<PhotoVO> getShowPic(PhotoVO vo);

}
