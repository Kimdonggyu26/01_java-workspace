package com.br.chap01_abstraction.run;

import com.br.chap01_abstraction.model.vo.Student;

public class AbstractionMain {
	
	public static void main(String[] args) {
		
		// Student 클래스를 가지고 객체를 생성
		
		// 1. 객체 생성
		// 		클래스명 변수명 = new클래스명();
		Student hong = new Student();
		
		// 2. 생성된 객체에 속성값을 대입
		//	  생성된 객체내의 필드에 값을 대입
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 172.3;
		
		System.out.println(hong);// 자료형@주소값 출력
		System.out.println(hong.name + "님의 나이는 " + hong.age + "이고 키는 " + hong.height + "cm입니다.");
		
		//김말똥 학생 객체 만들기
		//김말똥, 21살, 160.2
		
		Student kim = new Student();
		kim.name = "김말똥";
		kim.age = 20;
		kim.height = 160.2;
		
		System.out.println(kim.name);
		
		

	}

}
