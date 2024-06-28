package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

public class ClassMain {

	public static void main(String[] args) {
		
		Person a = new Person();
		
		System.out.println(a.getId());
		System.out.println(a.getAge());

		a.setId("user01");
		a.setPwd("pass01");
		a.setName("김동규");
		a.setAge(26);
		a.setGender('m');
		a.setPhone("01050176894");
		a.setEmail("anima9125@gmail.com");
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getGender());
		System.out.println(a.getPhone());
		System.out.println(a.getEmail());
		System.out.println("=========");
		
		
		// 내가 원하는 데이터가 담긴 객체를 생성하기 위한 방법
		// 방법1. 기본생성자로 생성 후 setter메소드를 이용해서 값 대입
		Product b = new Product();
		
		b.setpName("AIRFORCE1");
		b.setPrice(130000);
		b.setBrand("NIKE");
	
		System.out.printf("%s %s의 가격 : %d원\n", b.getBrand(),b.getpName(),b.getPrice());
		
		// 방법 2. 매개변수 생성자를 정의해두고 실행시켜서 생성과 동시에 값 대입

		Product b2 = new Product("iphone", 1000000, "apple");
		System.out.println(b2.information());
		
		// 두번째 상품이 10프로 할인한다고 한다.
		// 두번째 상품의 정상가격과 할인가격을 출력하시오.
		System.out.println("두번재 상품의 정상가 : " + b2.getPrice() + "원");
		System.out.println("두번째 상품의 할인가 : " + (int)(b2.getPrice()*0.9) + "원");
		
		
	}

}
