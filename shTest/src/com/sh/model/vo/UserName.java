package com.sh.model.vo;

import java.util.ArrayList;
import java.util.List;

public class UserName {
	private String name;
	private int money;

	private List<Object> baske = new ArrayList<>();

	public UserName(String name, int money, List<Object> baske) {
		super();
		this.name = name;
		this.money = money;
		this.baske = baske;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public List<Object> getBaske() {
		return baske;
	}

	public void setBaske(List<Object> baske) {
		this.baske = baske;
	}

	@Override
	public String toString() {
		return "UserName [name=" + name + ", money=" + money + ", baske=" + baske + "]";
	}

	
	
}
