package com.bawei.bean;

public class Goods {
	private Integer gid;
	private String gname;
	private String egname;
	private double size;
	private double price;
	private Integer number;
	private String bq;
	private String picture;
	private Brand brand;
	private Kind kind;
	private Integer bid;
	private Integer kid;
	public Goods(Integer gid, String gname, String egname, double size, double price, Integer number, String bq,
			String picture, Brand brand, Kind kind, Integer bid, Integer kid) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.egname = egname;
		this.size = size;
		this.price = price;
		this.number = number;
		this.bq = bq;
		this.picture = picture;
		this.brand = brand;
		this.kind = kind;
		this.bid = bid;
		this.kid = kid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public Goods() {
		super();
	}
	public Goods(Integer gid, String gname, String egname, double size, double price, Integer number, String bq,
			String picture, Brand brand, Kind kind) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.egname = egname;
		this.size = size;
		this.price = price;
		this.number = number;
		this.bq = bq;
		this.picture = picture;
		this.brand = brand;
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", egname=" + egname + ", size=" + size + ", price=" + price
				+ ", number=" + number + ", bq=" + bq + ", picture=" + picture + ", brand=" + brand + ", kind=" + kind
				+ ", bid=" + bid + ", kid=" + kid + "]";
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getEgname() {
		return egname;
	}
	public void setEgname(String egname) {
		this.egname = egname;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}

}
