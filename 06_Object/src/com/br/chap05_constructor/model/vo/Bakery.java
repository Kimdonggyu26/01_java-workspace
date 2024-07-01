package com.br.chap05_constructor.model.vo;

public class Bakery {
	
	private String bakeryName;
	private String bakeryAddr;
	private Bread bread;
	
	public Bakery() {}
	
	public Bakery(String bakeryName, String bakeryAddr, Bread bread) {
		this.bakeryName = bakeryName;
		this.bakeryAddr = bakeryAddr;
		this.bread = bread;
	}
	
	public void setbakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	public String getbakeryName() {
		return bakeryName;
	}
	public void setbakeryAddr(String bakeryAddr) {
		this.bakeryAddr = bakeryAddr;
	}
	public String getbakeryAddr() {
		return bakeryAddr;
	}
	public void setbread(Bread bread) {
		this.bread = bread;
	}
	public Bread getbread() {
		return bread;
	}
	
	public String information() {
		String str = "빵집명 : " + bakeryName + ", 빵집주소 : " + bakeryAddr;
		
		if(bread != null) {
			str += ", 판매하는 빵 : " + bread.information();
		}
		
		return str;
	}

}
