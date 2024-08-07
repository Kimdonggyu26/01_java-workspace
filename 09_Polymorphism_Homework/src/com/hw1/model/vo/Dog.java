package com.hw1.model.vo;

public class Dog extends Animal{
	
	public final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	
	

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void Speak() {
		System.out.println(toString() + " 몸무게는 " + weight + "kg 입니다."); 
	}

}
