package com.sh.controller;

import java.util.ArrayList;
import java.util.List;

import com.sh.model.vo.Bread;
import com.sh.model.vo.Coffee;
import com.sh.model.vo.CoffeeShop;
import com.sh.model.vo.UserName;
import com.sh.shop.model.vo.Shop;

public class CoffeeManager {
	List<Coffee> coffeeList = new ArrayList<>();{
		coffeeList.add(new Coffee("아메리카노",5000,10));
		coffeeList.add(new Coffee("카페라떼",6000,5));
		coffeeList.add(new Coffee("돌체라떼",6000,3));
		coffeeList.add(new Coffee("라떼는말야",7000,2));
		
	}
	
	List<Bread> breadList = new ArrayList<>();{
		breadList.add(new Bread("소보로빵",3000,4));
		breadList.add(new Bread("곰보빵빵",1500,3));
		breadList.add(new Bread("빵빵이",1000,2));
	}
	List <Object> baske = new ArrayList<>();
	
	CoffeeShop cs = new CoffeeShop(coffeeList,breadList,"qqqq","1111","상혁이네","안산");	
	
	public int checkingAdmin(String userId, String userPwd) {
		
		int result = 0;
		if( userId.equals("qqqq") && userPwd.equals("1111")) {
			result = 1;
		}else {
			result = -1;
		}
		
		return result;
		
	}
	public void checkingUser(String userName ,int money) {
		
		List <Object> user = new ArrayList<>(); 
		
		 new UserName(userName, money, baske);
		
	}
	public CoffeeShop management(int num , String chName) {
		
		if(num == 1) {
			cs.setCafetitle(chName);
		}else if(num == 2) {
			cs.setCafeaddres(chName);
		}
		
		return cs;
	}
	public List<Coffee> coffeeInquiry(){
		
		return coffeeList;
	}
	public void insertCoffee(String cName,int price,int count) {
		
		coffeeList.add(new Coffee(cName, price, count));
		
	}
	public void deleteCoffee(int index){
		
		coffeeList.remove(index);
	
		
	}
	public List<Bread> breadInquiry(){
		
		return breadList;
		
	}
	public void insertBread(String bName , int price , int count) {
		
		breadList.add(new Bread(bName, price, count));
		
	}
	public void deleteBread(int index) {
		
		breadList.remove(index);
		
	}
	

	public CoffeeShop selectAll() {
		
		return cs;
	
	}
	public List<Object> searchCafe(int num ,String keyword) {
		
		List<Object> searchKeywordBread = new ArrayList<>();
		
		if(num == 1) {
			for(int i = 0; i < breadList.size(); i++) {
				if(breadList.get(i).getBreadName().contains(keyword)) {
					searchKeywordBread.add(breadList.get(i));
				}
			}
		}else if(num == 2) {
			for(int i = 0; i < coffeeList.size(); i++) {
				if(coffeeList.get(i).getCoffeeName().contains(keyword)) {
					searchKeywordBread.add(coffeeList.get(i));
				}
			}
		}
		
		return searchKeywordBread;
		
	}
	public List <Object> myBasketcheck() {
		
		return baske;
	}
	public void order(int num , int index) {
		
		if(num == 1) {
			baske.add(breadList.get(index));
		}else if(num == 2) {
			baske.add(coffeeList.get(index));
		}
		
		
	}
	
	
	public int lastCheck() {
		
		int sum = 0;
		
		if(baske instanceof Coffee) {
			
			for(int i = 0; i < baske.size(); i++) {
				sum += ((Coffee) baske.get(i)).getPrice();
			}
			
		}else if (baske instanceof Bread) {
			
			for(int i = 0; i < baske.size(); i++) {
				sum += ((Bread) baske.get(i)).getPrice();
			}
			
		}
		
		return sum;
		
	}
	
	
}
