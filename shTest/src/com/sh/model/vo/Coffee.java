package com.sh.model.vo;

public class Coffee {
	private String coffeeName;
	private int price;
	private int count;
	public Coffee(String coffeeName, int price, int count) {
		super();
		this.coffeeName = coffeeName;
		this.price = price;
		this.count = count;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Coffee [coffeeName=" + coffeeName + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
