package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

public class ClassMain {

	public static void main(String[] args) {
		
		Person a = new Person();
		
		System.out.println(a.getId());
		System.out.println(a.getAge());

		a.setId("user01");
		a.setPw("pass01");
		a.setName("김동규");
		a.setAge(26);
		a.setGender('m');
		a.setPhone("01050176894");
		a.setEmail("anima9125@gmail.com");
		
		System.out.println(a.getId());
		System.out.println(a.getPw());
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getGender());
		System.out.println(a.getPhone());
		System.out.println(a.getEmail());
		
		Product b = new Product();
		
		b.setpName("AIRFORCE1");
		b.setPrice(130000);
		b.setBrand("NIKE");
	
		System.out.printf("%s %s의 가격 : %d원\n", b.getBrand(),b.getpName(),b.getPrice());
		

		System.out.println(b.information());
		
		
	}

}
