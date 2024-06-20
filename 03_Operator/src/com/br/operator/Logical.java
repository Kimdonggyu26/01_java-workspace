package com.br.operator;

import java.util.Scanner;

public class Logical {
	
	/*
	 * < 논리연산자 (이항연산자) >
	 * 논리값을 연산해주는 연산자 => 논리연산의 결과값도 논리값
	 * 
	 * 논리값 && 논리값 : and => 왼쪽 값 오른쪽 값 둘다 true일 경우 최종 결과값은 true
	 * 논리값 || 논리값 : or => 왼쪽 값 또는 오른쪽 값 둘 중 하나라도 true일 경우 최종 결과값은 true
	 * 
	 * -> 주로 여러개의 조건을 연결 시켜서 하나의 조건을 만들고자 할 때 사용
	 * 
	 */

	public void method1() {
		// 사용자가 입력한 정수 값이 1부터 100 사이의 값인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		// num값이 1 이상이고 100 이하인지 비교 -> and => &&
		boolean result = (num >= 1) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1 이상 100 이하입니까 : " + result);
	
		
	}
	public void method2() {
		// 사용자가 입력한 문자값이 영문 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		//'A' ~ 'Z' 실제로 컴퓨터에서는 65 ~ 90
		//boolean result = (ch >= 65) && (ch <= 90);
		boolean result = (ch >= 'A') && (ch <= 'Z');
		
		System.out.println("사용자가 입력한 " + ch + "문자는 대문자 입니까 : " + result);
		
		
	}
	public void method3() {
		// 사용자에게 성별을 입력 받은 후 남자인지 확인 'M'이거나 'm')
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0); // 'M', 'F', 'm', 'f'
		
		boolean result = gender =='M' || gender == 'm';
		
		System.out.println("사용자가 남자 입니까 : " + result);
		System.out.println("사용자가 여자 입니까 : " + !result);
		

	}
	public void method4() {
		// 사용자에게 종료 의사를 입력받고 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료 하시려면 y를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("사용자가 종료의사를 밝혔습니까 : " + (ch == 'y' || ch == 'Y'));
		

	}
	public void method5() {
		//System.out.println(false && true);	dead code -> 이유 : 앞의 값으로 인해 정해졌기 때문에 실행 되지 않음
		//System.out.println(true || false);	dead code -> 이유 : 앞의 값으로 인해 정해졌기 때문에 실행 되지 않음
		
		// 예시)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		boolean result = (num <  5) && (++num > 0);
		
		System.out.println("num :" + num);
		System.out.println("result : " + result);
		
		
		
		
		
	}
	
}
