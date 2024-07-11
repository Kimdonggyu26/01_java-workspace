package com.study.shop.model.vo;

public class Shop {
	
	private String name;
	private String address;
	private String category;
	private String mainmenu;

	public Shop() {}

	public Shop(String name, String address, String category, String mainmenu) {
		super();
		this.name = name;
		this.address = address;
		this.category = category;
		this.mainmenu = mainmenu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMainmenu() {
		return mainmenu;
	}

	public void setMainmenu(String mainmenu) {
		this.mainmenu = mainmenu;
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", address=" + address + ", category=" + category + ", mainmenu=" + mainmenu
				+ "]";
	}
	
	
}
