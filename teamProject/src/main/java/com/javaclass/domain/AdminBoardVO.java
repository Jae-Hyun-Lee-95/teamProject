package com.javaclass.domain;

import java.util.Date;

public class AdminBoardVO {

	private int anNumber;
	private int managerNumber;
	private String anTitle;
	private String anContent;
	private Date  anCreateDate;
	
	
	public Integer getAnNumber() {
		return anNumber;
	}
	public void setAnNumber(Integer anNumber) {
		this.anNumber = anNumber;
	}
	public Integer getManagerNumber() {
		return managerNumber;
	}
	public void setManagerNumber(Integer managerNumber) {
		this.managerNumber = managerNumber;
	}
	public String getAnTitle() {
		return anTitle;
	}
	public void setAnTitle(String anTitle) {
		this.anTitle = anTitle;
	}
	public String getAnContent() {
		return anContent;
	}
	public void setAnContent(String anContent) {
		this.anContent = anContent;
	}
	public Date getAnCreateDate() {
		return anCreateDate;
	}
	public void setAnCreateDate(Date anCreateDate) {
		this.anCreateDate = anCreateDate;
	}
	@Override
	public String toString() {
		return "BoardVO [anNumber=" + anNumber + ", managerNumber=" + managerNumber + ", anTitle=" + anTitle
				+ ", anContent=" + anContent + ", anCreateDate=" + anCreateDate + "]";
	}
	
	
}
