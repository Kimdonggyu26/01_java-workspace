package com.br.inherit.model.vo;

public class Airplane extends Vehicle{
	
	private int tire;
	private int wing;
	
	public Airplane() {}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	// 오버라이딩
	public String information() {
		return super.information() + ", tire: " + tire + ", wing: " + wing;
	}
	
	// 오버라이딩
	public void move() {
		System.out.println(tire + "개의 바퀴를 굴려 " + wing + "개의 날개를 가지고 움직인다.");
	}

}
