package com.study.shop.controller;

import java.util.ArrayList;
import java.util.List;

import com.study.shop.model.vo.Shop;

public class ShopController {

	private List<Shop> list = new ArrayList<>();
	{
		list.add(new Shop("홍콩반점", "가산동", "중식", "짬뽕"));
		list.add(new Shop("엽떡", "목동", "분식", "떡볶이"));
	}
	
	public void inputShopInfo(String name, String address, String category, String mainmenu) {
		
		list.add(new Shop(name, address, category, mainmenu));
		
	}
	
	public List<Shop> searchShopName() {
		
		return list;
		
	}
	
	public int deleteShopInfo(String name) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				result++;
			}
		}
		return result;
	}
	
	public List<Shop> searchShopInfo(String name) {
		
		List<Shop> searchList = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	
	
	
}
