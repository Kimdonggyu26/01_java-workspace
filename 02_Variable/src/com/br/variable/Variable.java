package com.br.variable;

public class Variable {

	public void whyUseVariable() {
	
		System.out.println("변수 사용 전");
		System.out.println(9860 * 8);
		System.out.println(9860 * 8 * 5);
		System.out.println(9860 * 8 * 5 * 4);
		System.out.println(9860 * 8 * 5 * 4 * 0.1);
		
		int pay = 9860;
		int hour = 8;
		int day = 5;
		int week = 4;
		double tax = 0.1;
		
		System.out.println("변수 사용 후");
		System.out.println(pay * hour);
		System.out.println(pay * hour * day);
		System.out.println(pay * hour * day * week);
		System.out.println(pay * hour * day * week * tax);
		
		
	}
	public void declareVariable() {
		
		boolean bool1;  		// 변수 선언
		bool1 = true;			// 변수에 값 대입(기존에 변수가 선언이 되어있어야함)
		boolean bool2 = false;	// 변수 선언과 동시에 초기화
				
		System.out.println("bool1의 값 : " + bool1);
		System.out.println("bool2의 값 : " + bool2);
		
		byte b = 100;			// byte는  -128 ~ 127 사이의 값만 가능
		short s = 32000;		// short는 -32,xxx ~ 32,xxx 사이의 값만 가능
		int i = 2100000000;		// int는   -21억,xxx ~ 21억,xxx 사이의 값만 가능 => 정수형 중에 대표자료형(기본형)
		long l = 1000000000000L;// 매우 큼
		
		System.out.println("b의 값 : " + b);
		System.out.println("s의 값 : " + s);
		System.out.println("i의 값 : " + i);
		System.out.println("l의 값 : " + l);
		
		float f = 4.12345678901234567f;		// 4byte
		double d = 8.1234567634423435;		// 8byte => 실수형 중에 가장 대표적인 자료형 (더 정확한 값을 담을 수 있기 때문)
		
		System.out.println("f의 값 : " + f);
		System.out.println("d의 값 : " + d);
		
		char c1 = 'a';		// 0 ~ 65,xxx 범위
		char c2 = '힇';
		
		System.out.println("c1의 값 : " + c1);
		System.out.println("c2의 값 : " + c2);
		System.out.println("c1의 숫자값 : " + (int)c1);
		System.out.println("c2의 숫자값 : " + (int)c2);
		
		String str = "안녕하세요";	// String => 참조 자료형
		System.out.println("str의 값 : " + str);
		
	}
	
	public void namingRule() {
		int age;
		//double age; -> 불가능 (이유 : 중복된 변수 선언 불가)
		//int true; -> 불가능 (이유 : 예약어(자바에서 쓰고있는 언어)로 변수 선언 불가)
		
		int num1;
		int nu1m;
		//int 1num; -> 불가능 (이유 : 숫자 사용 가능은 하지만 시작은 x)
		
		int num_1;
		int num$1;
		int _num1;
		//int num#1; -> 불가능 (이유 : 특수문자는 _와 $만 가능)
		
		String userName; //권장 사항 Camel  Case
		String 이름; 	// 권장 x 영어사용 권장
	}
	
	public void constant() {
		
		int age = 10;
		age = 20;	//변수는 값을 변경할 수 있다.
		
		final int AGE = 30;
		//AGE = 40; -> 불가능 (이유 : 상수는 변경 불가능 즉, 상수는 고정적인 값을 담을때만 사용 ex) 원주율)
		
		System.out.println(AGE);
		
		System.out.println(Math.PI); //대표적인 상수 (Math클래스 안에 정의 되어있는 PI 상수)
	}
}


