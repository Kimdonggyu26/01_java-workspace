package com.hw2.controller;

import java.util.ArrayList;

import com.hw2.model.vo.AniBook;
import com.hw2.model.vo.Book;
import com.hw2.model.vo.CookBook;
import com.hw2.model.vo.Member;

public class LibraryManager {
	
	private Member mem = null;
	private ArrayList<Book> bookList = new ArrayList<>();
	
	{
		bookList.add(new CookBook("백종원의 집밥", "백종원", "tvN", true));
		bookList.add(new AniBook("한번 더 해요", "미티", "원모어", 19));
		bookList.add(new AniBook("루피의 원피스", "루피", "japan", 12));
		bookList.add(new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false));
		bookList.add(new CookBook("최현석의 날 따라해봐", "최현석", "소금책", true));
	}
	
	public void insertMember(String name, int age, char gender) {
		
		mem = new Member(name, age, gender);
	}
	
	public Member getMem() {
		
		return mem;
		
	}
	
	public void updateMember(String name, int age, char gender) {
		
		mem.setName(name);
		mem.setAge(age);
		mem.setGender(gender);
		
	}
	
	public ArrayList<Book> selectAll() {
		return bookList;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;
	}
	
	public int rentBook(int index) {
		
		int result = 0;
		
			if(bookList.get(index) instanceof AniBook) {
				if(((AniBook)bookList.get(index)).getAccessAge() > mem.getAge()){
					result = 1;
				}
			} else if (bookList.get(index) instanceof CookBook) {
				if (((CookBook)bookList.get(index)).isCoupon()) {
					mem.setCouponCount(mem.getCouponCount()+1);
					result = 2;
				}
			}
		
		
		return result;
	}
	

}
