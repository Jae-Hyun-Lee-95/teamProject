package com.javaclass.domain;

import java.util.Date;

public class QuestionBoardVO {

	private Integer asId;
	private String	userEmail;
	private String	asTitle;
	private String	asContent;
	private	Date	asCreateDate;
	private String	asAnswer;
	
	
	public Integer getAsId() {
		return asId;
	}
	public void setAsId(Integer asId) {
		this.asId = asId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getAsTitle() {
		return asTitle;
	}
	public void setAsTitle(String asTitle) {
		this.asTitle = asTitle;
	}
	public String getAsContent() {
		return asContent;
	}
	public void setAsContent(String asContent) {
		this.asContent = asContent;
	}
	public Date getAsCreateDate() {
		return asCreateDate;
	}
	public void setAsCreateDate(Date asCreateDate) {
		this.asCreateDate = asCreateDate;
	}
	
	public String getAsAnswer() {
		return asAnswer;
	}
	public void setAsAnswer(String asAnswer) {
		this.asAnswer = asAnswer;
	}
	@Override
	public String toString() {
		return "QuestionBoardVO [asId=" + asId + ", userEmail=" + userEmail + ", asTitle=" + asTitle + ", asContent="
				+ asContent + ", asCreateDate=" + asCreateDate + ", asAnswer=" + asAnswer + "]";
	}
	
	
	
}
