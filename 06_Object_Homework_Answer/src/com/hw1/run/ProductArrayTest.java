package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductArrayTest {
	
	// 기존의 객체 실습문제1을
	// 객체 배열로 풀어보기

	public static void main(String[] args) {
		
		Product pro[] = new Product[3];
		
		pro[0] = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		pro[1] = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		pro[2] = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		for(int i = 0; i < pro.length; i++) {
			System.out.println(pro[i].information());
		}
		
		System.out.println("==============================================================");
		
		for(int i = 0; i < pro.length; i++)	{
			pro[i].setPrice(1200000);
			pro[i].setTax(0.05);
			System.out.println(pro[i].information());
		}
		
		System.out.println("==============================================================");
		
		for(int i = 0; i < pro.length; i++) {
			System.out.println("상품명 = " + pro[i].getProductName());
			System.out.println("부가세 포함 가격 = " + (int)(pro[i].getPrice()+(pro[i].getPrice() * pro[i].getTax())) + "원");
		}
	} // 메인 end

}
