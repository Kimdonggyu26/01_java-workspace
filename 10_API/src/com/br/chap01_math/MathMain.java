package com.br.chap01_math;

public class MathMain {
	
	public static void main(String[] args) {
		
		/*
		 * 주석 복붙
		 */
		
		// PI : 파이값을 가지고 있는 상수필드
		System.out.println(Math.PI);
		
		// abs : 절대값을 반환
		int num1 = -10;
		
		System.out.println("절대값 : " + Math.abs(num1));
		
		// ceil : 올림값을 반환 (실수형으로 반환)
		double num2 = 4.349;
		System.out.println("올림 : " + Math.ceil(num2));
		
		// round : 반올림값을 반환
		System.out.println("반올림 : " + Math.round(num2));
		
		// floor : 버림값을 반환
		System.out.println("버림 : " + Math.floor(num2));
		
		// rint : 가장 가까운 정수값을 반환
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		// sqrt : 제곱근(루트) 값을 반환
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// pow : 제곱 값을 반환
		System.out.println("2의 10제곱 : " + Math.pow(2, 10)); 
	}

}
