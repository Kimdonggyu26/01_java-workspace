package com.sh.model.vo;

public class Bread {
	private String breadName;
	private int price;
	private int count;
	public Bread(String breadName, int price, int count) {
		super();
		this.breadName = breadName;
		this.price = price;
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getBreadName() {
		return breadName;
	}
	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Bread(String breadName, int price) {
		super();
		this.breadName = breadName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bread [breadName=" + breadName + ", price=" + price + ", count=" + count + "]";
	}
}
