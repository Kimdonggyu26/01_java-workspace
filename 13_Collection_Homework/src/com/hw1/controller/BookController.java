package com.hw1.controller;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.vo.Book;

public class BookController {
	
	private List<Book> bookList = new ArrayList<>();
	{
		bookList.add(new Book("자바언어의 정석", "홍길동", "기타", 20000));
		bookList.add(new Book("C언어의 보람", "김말똥", "기타", 15000));
		bookList.add(new Book("도움이 되었나요", "강보람", "인문", 17500));
		bookList.add(new Book("여러분","홍홍홍","의료",10000));
	}
	
	public void insertBook(String title, String author, String bCategory, String price) {
		
		int bPrice = Integer.parseInt(price);
		
		bookList.add(new Book(title, author, bCategory, bPrice));
		
	}
	
	public List<Book> selectList() {
		
		return bookList;
	
	}
	
	public List<Book> searchBook(int menu, String keyword) {
		
		List<Book> searchList = new ArrayList<>();
		
		switch(menu) {
		
		case 1: 	
			for(int i = 0; i < bookList.size(); i++) {
				if(bookList.get(i).getTitle().contains(keyword)) {
					searchList.add(bookList.get(i));
				}
			}break;
		case 2:
			for(int i = 0; i < bookList.size(); i++) {
				if(bookList.get(i).getAuthor().contains(keyword)) {
					searchList.add(bookList.get(i));
				}
			}break;
		case 3: 
			for(int i = 0; i < bookList.size(); i++) {
				if(bookList.get(i).getAuthor().contains(keyword) || bookList.get(i).getTitle().contains(keyword)) {
					searchList.add(bookList.get(i));
				}
			}break;
			
		} // switch end
		
		return searchList;
		
	}
	
	public int deleteBook(String title, String author) {
		
		int result = 0;
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getAuthor().equals(author) && bookList.get(i).getTitle().equals(title)) {
				bookList.remove(i);
				result = 1;
			}
		}
		
		return result;
	}
}
