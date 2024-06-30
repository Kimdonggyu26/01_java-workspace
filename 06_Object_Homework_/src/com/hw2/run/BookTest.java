package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b = new Book();
		System.out.println(b.info1());
		
		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(b2.info1());
		System.out.println("===========\n 수정된 결과 확인");
		
		Book b3 = new Book("C언어", 30000, 0.1, "홍길동");
		System.out.println(b3.info1());
		
		System.out.println("============");
		System.out.println("도서명 = " + b3.gettitle());
		System.out.println("할인된 가격 = " + (int)(b3.getprice() - (b3.getprice()*b3.getdiscountRate())) + "원");
		System.out.println("도서명 = " + b2.gettitle());
		System.out.println("할인된 가격 = " + (int)(b2.getprice() - (b2.getprice() * b2.getdiscountRate())) + "원");
		

	}

}
