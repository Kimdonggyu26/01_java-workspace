package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book bk[] = new Book[2];
		
		bk[0] = new Book();
		bk[1] = new Book("자바의 정석", 20000, 0.2, "윤상섭");
				
		for(Book b : bk) {
			System.out.println(b.information());
		}
		System.out.println("=============================");
		
		bk[0].setTitle("C언어");
		bk[0].setPrice(30000);
		bk[0].setDiscountRate(0.1);
		bk[0].setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(bk[0].information());

		System.out.println("=============================");
		
		for(int i = 0; i < bk.length; i++) {
			System.out.println("도서명 = " + bk[i].getTitle());
			System.out.println("할인된 가격 = " + (int)(bk[i].getPrice() - (bk[i].getPrice() * bk[i].getDiscountRate())) + "원");
		}

	}

}
