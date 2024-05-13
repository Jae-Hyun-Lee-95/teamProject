package com.javaclass.domain;

import java.util.Date;

public class FreeReplyVO {

	private int commentId;
	private	int boardId;
	private String	content;
	private Date	createDate;
	private String	userEmail;
	
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Override
	public String toString() {
		return "FreeReplyVO [commentId=" + commentId + ", boardId=" + boardId + ", content=" + content + ", createDate="
				+ createDate + ", userEmail=" + userEmail + "]";
	}
	
	
	
	
}
