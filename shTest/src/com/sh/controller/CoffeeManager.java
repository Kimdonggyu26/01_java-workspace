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
		if( userId.equals("gggg") && userPwd.equals("1111")) {
			result = 1;
		}else {
			result = -1;
		}
		
		return result;
		
	}
	public void checkingUser(String userName ,int money) {
		
	}
	public CoffeeShop management(int num , String chName) {
		
	}
	public List<Coffee> coffeeInquiry(){
	}
	public void insertCoffee(String cName,int price,int count) {
	}
	public void deleteCoffee(int index){
	}
	public List<Bread> breadInquiry(){
	}
	public void insertBread(String bName , int price , int count) {
	}
	public void deleteBread(int index) {
	}
	
	
	
	
	
	public CoffeeShop selectAll() {
		
		
		
	}
	public List<Object> searchCafe(int num ,String keyword) {
	}
	public List <Object> myBasketcheck() {
		
		return baske;
	}
	public void oreder(int num , int index) {
	}
	
	
	public int lastCheck(int num , int index) {
		//생략해주세요 아이디어 떠오르는중
	}
	
	
}
