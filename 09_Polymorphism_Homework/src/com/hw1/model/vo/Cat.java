package com.hw1.model.vo;

public class Cat extends Animal{
	
	private String location;
	private String color;
	
	public Cat() {}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	@Override
	public void Speak() {
		System.out.println(toString() + location + "에 서식하며, 색상은 " + color + "입니다.");
	}

}
