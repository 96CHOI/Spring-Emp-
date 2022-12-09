package com.dw.emp.vo;

public class BoardVO {
	
	private int board_no;
	private String title;
	private String contents;
	private String writer;
	private String CREATE_at;
	private int board_count;
	
	
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCREATE_at() {
		return CREATE_at;
	}
	public void setCREATE_at(String cREATE_at) {
		CREATE_at = cREATE_at;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
	
	
}
