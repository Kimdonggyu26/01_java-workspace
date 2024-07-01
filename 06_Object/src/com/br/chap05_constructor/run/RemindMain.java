package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Bakery;
import com.br.chap05_constructor.model.vo.Bread;

public class RemindMain {

	public static void main(String[] args) {
		
		Bread br = new Bread();
		br.setName("소금빵");
		br.setPrice(2000);
		
		System.out.println(br.information());
		
		System.out.println("==================");
		
		Bakery ba1 = new Bakery();
		ba1.setbakeryName("파리바게뜨");
		ba1.setbakeryAddr("서울시 금천구");
		System.out.println(ba1.information());
		
		System.out.println("==================");
		
		Bakery ba2 = new Bakery();
		ba2.setbakeryName("뚜레쥬르");
		ba2.setbakeryAddr("서울시 강서구");
		ba2.setbread(br);
		//ba2.setbread(new Bread("소금빵", 1000));
		
		System.out.println(ba2.information());
		
		System.out.println("==================");
		
		// 2500원짜리 튀김소보로를 판매하는 성심당(대전시) 빵집 만들기
		
		Bakery ba3 = new Bakery();
		ba3.setbakeryName("성심당");
		ba3.setbakeryAddr("대전시");
		ba3.setbread(new Bread("튀김소보로", 2500));
		
		System.out.println(ba3.information());
		
		// 현재 성심당에서 판매하는 빵 정보 출력

		Bread b = ba3.getbread();
		System.out.println(b.information());
	}

}
