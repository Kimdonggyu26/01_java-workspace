package com.br.chap05_constructor.model.vo;

public class Bread {
	
	private String name;
	private int price;
	
	public Bread() {}
	
	public Bread(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return  name + "/" + price + "원";
		
	}

}
