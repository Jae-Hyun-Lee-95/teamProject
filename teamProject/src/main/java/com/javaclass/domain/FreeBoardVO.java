package com.javaclass.domain;

import java.util.Date;

public class FreeBoardVO {

	
	private Integer boardId;
	private String	userEmail;
	private String	title;
	private String	content;
	private Integer	viewCount;
	private	Date	createDate;
	private	Date	updateDate;
	
	
	public Integer getBoardId() {
		return boardId;
	}
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

	
	@Override
	public String toString() {
		return "FreeBoardVO [boardId=" + boardId + ", userEmail=" + userEmail + ", title=" + title + ", content="
				+ content + ", viewCount=" + viewCount + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ "]";
	}
	
}
