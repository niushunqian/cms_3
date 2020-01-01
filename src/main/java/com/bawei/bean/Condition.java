package com.bawei.bean;

public class Condition {
	private String gname;
	private Integer pageNum;
	@Override
	public String toString() {
		return "Condition [gname=" + gname + ", pageNum=" + pageNum + "]";
	}
	public Condition() {
		super();
	}
	public Condition(String gname, Integer pageNum) {
		super();
		this.gname = gname;
		this.pageNum = pageNum;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

}
