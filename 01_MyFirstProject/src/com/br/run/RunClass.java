package com.br.run;

import com.br.first.SecondClass;
import com.br.first.ThirdClass;


public class RunClass {
	
	public static void main(String[] args) {
		// 메소드 호출 : 메소드명();
		
		// methodA();
		
		// SecondClass second = new SecondClass(); <- 오류나는 이유 확인 !
		
		// 방법 1) 풀클래스명 제시하기 
		// com.br.first.SecondClass second = new com.br.first.SecondClass();
		// 방법 2) import문으로 한 번만 선언 해두기
		// 맨위 패키지 선언문 아래에 import 풀클래스명
		SecondClass second = new SecondClass();
		
		// 메소드 호출
		/*
		second.methodA();
		second.methodB();
		second.methodC();
		*/
		
		// ------------------------
		ThirdClass Third = new ThirdClass();
		
		Third.javaValue();
		
		
		
	}

}
