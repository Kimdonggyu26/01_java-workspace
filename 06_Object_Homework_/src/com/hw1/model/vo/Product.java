package com.hw1.model.vo;

public class Product {
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;

	public Product() {
	}

	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;

	}

	public void setproductId(String productId) {
		this.productId = productId;
	}
	
	public String getproductId() {
		return productId;
	}
	
	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	public String getproductName() {
		return productName;
	}
	
	public void setproductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public String getproductArea() {
		return productArea;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	public int setprice() {
		return price;
	}
	public void settax(double tax) {
		this.tax = tax;
	}
	
	public double gettax() {
		return tax;
	}
	
	public String information() {
		String str = productId + " " + productName + " " 
						+ productArea + " " + price + " " + tax;
		return str;
	}
	public String information2() {
		return "상품명 = " + productName + "\n부가세 포함 가격 = " + (int)(price+(price * tax)) + "원";
	}
}