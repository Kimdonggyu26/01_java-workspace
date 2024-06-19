package com.br.variable;

public class Casting {
	
	/*
	 * < 컴퓨터에서의 값 처리 규칙 >
	 * 
	 * 1. 대입연산자를 기준으로 왼쪽, 오른쪽은 동일한 type이어야 됨
	 * 		즉, 같은 자료형의 값만 대입이 가능함
	 * 		다른 자료형의 값을 대입하고자 할 경우 자료형을 바꿔줘야 됨
	 * 
	 * 		[표현법] 자료형 변수명 = (자료형)값;
	 * 
	 * 2. 같은 type끼리만 연산 가능 (연산 결과 값도 같은 자료형으로 나옴)
	 * 
	 * 		[표현법] 값 + (자료형)값
	 * 
	 * < 형변환 >
	 * 값의 자료형을 바꾸는 것
	 * 
	 * 1. 자동형변환(묵시적형변환) : 자동으로 자료형이 변경됨
	 * 2. 강제형변환(명시적형변환) : 형변환 연산자를 통해서 자료형을 변경 해야 됨
	 * 3. 주의사항 : boolean은 형변환 불가 (true, false만 가질 수 있음)
	 * 
	 */
	
	public void autoCasting() {
		
		/* < 자동형변환 >
		 * 자료형이 다른 두 값 간의 연산(대입, 계산 등)시
		 * 자동으로 값의 범위가 작은 자료형이 큰 범위의 자료형으로 변환 되어서 처리됨
		 * 
		 * byte -> short -> int -> long -> float -> double 
		 */
		
		// 1. int(4byte) -> double(8byte)
		int i1 = 12;
		double d1 = i1; // (double)처리를 하지 않아도 됨! why) 자동으로 형변환이 되었기 때문에 (작은 -> 큰)
		System.out.println("d1의 값 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		System.out.println(i2 + d2); // i2가 double자료형으로(double) 자동 변환 됨
		
		// 2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = i3; //i3이 long자료형으로 자동 변환 됨
		
		long l4 = 100000/*L*/;	// 자바에서의 정수리터럴은 기본적으로 int형으로 취급
		
		// 3. float(4byte) -> double(8byte)
		float f5 = 1.0f;
		double d5 = f5;
		
		// == 특이 케이스 ==
		// 4. long(8byte) -> float(4byte)
		// float은 실수형이기 때문에 아무리 4byte짜리라 해도 long형보다 표현 가능한 수의 범위가 더 큼
		long l6 = 1000;
		float f6 = l6;
		
		//5. char(2byte) <--> int(4byte)
		int num = 'A';
		char ch = 65;
		
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		ch = 5320; // 음수는 불가능 char는 0 ~ 65,xxx
		System.out.println("변경후의 ch : " + ch);
		
		//== 특이 케이스 == 
		//byte 또는 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		//byte b3 = b1 + b2;
		//에러 발생 이유 : byte나 short는 연산시 무조건 int형으로 처리됨
		
		byte b3 = (byte)(b1 + b2); // <-- "강제형변환" 하면 저장 가능


	}
	
	public void forceCasting() {
		//강제형변환 : 큰 범위의 자료형을 작은 범위의 자료형으로 바꾸는 과정
		
		//1. double(8byte) -> float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1;
		
		float f2 = 4.0f; // f도 강제형변환 중 하나
		
		// 2. double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum	// 10.0 + 5.89 = 15.89 (double형으로 결과)
										// 연산결과인 double형이 int형 변수에 대입 불가 => 에러발생
		
		// 해결방법 1. 연산결과를 최종적으로 int형으로 강제 형변환
		int iSum1 = (int)(iNum + dNum);		// (int)15.89 => 15   
		System.out.println("iSum1의 결과 : " + iSum1);
		
		// 해결방법 2. double형 값만을 int형으로 강제형변환
		int iSum2 = iNum + (int)dNum; // 10 + 5 => 15
		System.out.println("iSum2의 결과 : " + iSum2);
		
		// 해결방법 3. 아예 그냥 double형 변수에 담는 방법
		double dSum = iNum + dNum;
		System.out.println("dSum의 결과 : " + dSum);
		
		// 방법 1, 2는 실수값을 정수형으로 강제형변환 했기 때문에 소수점 아래 부분은 버림처럼 데이터 손실 발생!
		
		// * 데이터 손실 테스트 *
		int i = 290;
		byte b = (byte)i;
		
		System.out.println("b의 결과 : " + b);
		
	}


}
