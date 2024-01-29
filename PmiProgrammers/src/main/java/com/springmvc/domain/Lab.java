package com.springmvc.domain;

public class Lab {
	private String labId;
	private String name; //프로젝트 이름
	private String content; // 프로젝트 상세 내용
	
	
	public Lab(String name) {
		super();
		this.name = name;
	}
	public String getBookId() {
		return labId;
	}
	public void setBookId(String bookId) {
		this.labId = labId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Lab() {
		super();
		// TODO Auto-generated constructor stub
	}

}
