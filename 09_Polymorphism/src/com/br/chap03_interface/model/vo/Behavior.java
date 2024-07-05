package com.br.chap03_interface.model.vo;

public interface Behavior {
	
	// 오로지 상수필드랑 추상메소드만 작성할수 있는 형태
	
	// 인터페이스로 선언시
	// 필드 작성시 무조건 상수필드로 인식
	// => public static final 생략가능
	/*public static final*/ int NUM = 10;

	// 인터페이스로 선언시
	// 메소드 작성시 무조건 추상메소드로 인식
	// => public abstract 생략가능
	
	/* public abstract */void eat();
	public void sleep();


}
