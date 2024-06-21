package com.br.operator.example;

import java.util.Scanner;

public class TriplePractice {
public void practice3() {
	/*
	 * 문제 수정(변형)
	 * 사용자가 입력한 정수값이 0보다 작거나 같을 경우 "잘못입력하였습니다" 출력
	 * 그게 아닐경우 짝수면 "짝수다", 홀수면 "홀수다" 출력
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 : ");
	int num = sc.nextInt();
	
	String result = num <= 0 ? "잘못입력하였습니다." : (num % 2 == 0 ? "짝수다." : "홀수다.");
	System.out.println(result);
	
	
}

public void practice() {
	/*
	 * 사용자에게 두개의 정수값 입력받고
	 * + 또는 -를 입력받아 그에 맞는 연산결과를 출력해주기
	 * 단, + 또는 - 외의 다른 문자를 입력했을 경우 "잘못입력했습니다" 출력
	 * 
	 * ex)
	 * 첫번째 정수 : 
	 * 두번째 정수 :
	 * 연산자 입력 :
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫번째 정수 : ");
	int num1 = sc.nextInt();
	
	System.out.print("두번째 정수 : ");
	int num2 = sc.nextInt();
	
	sc.nextLine();
	
	System.out.print("연산자(+ 또는 -) : ");
	char op = sc.nextLine().charAt(0);
	

	String result = op == '+' ? num1 + num2 + "" : op == '-' ? num1 - num2 + "" : "잘못입력했습니다.";
	System.out.println("결과 : " + result);
	
	
	
	
	
	
	
	
	
	
	
}
}
