package com.hw2.model.vo;

public class Book {
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {}
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	public void settitle(String title) {
		this.title = title;
	}
	
	public String gettitle() {
		return title;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public int getprice() {
		return price;
	}
	public void setdiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getdiscountRate() {
		return discountRate;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public String getauthor() {
		return author;
	}
	
	public String info1() {
		return title + " " + price + " " + discountRate + " " + author;
	}
}
