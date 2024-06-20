package com.br.operator;

public class Arithmetic {
/*
 *  < 산술연산자 (이항연산자) >
 *  	*  /(몫)  %(나머지)  +  -
 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);	// 나눴을 때의 몫
		System.out.println(num1 % num2);	// 나눴을 때의 나머지
		
		//System.out.println(num1 / 0);		// 오류 => 0으로 나눌 수 없음
		
		System.out.println(num1 + num2 * num1 - num2 / num1);	// 10 + 30 - 0
		
		
	}
}
