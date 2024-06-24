package com.br.chap02.loop;

import java.util.Scanner;

public class While {

	/*
	 * < While 문 >
	 * 
	 * [초기식;]
	 *  While(조건식) {
	 *    반복적으로 실행시키고자 하는 코드;
	 *    증감식
	 *  }
	 */
	
	public void method1() {
		// 안녕하세요 5번 출력
		int i = 1;
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		while(i <= 5) {
			//System.out.print(i + " ");
			//i++;
			System.out.print(i++ + " ");
		}
	}
	
	public void method3() {
		// 1부터 랜덤값(1~100) 까지의 합계 구하기
		
		int i = 1;
		int ran = (int)(Math.random() * 100 + 1);
		int sum = 0;
		while(i <= ran) {
			//sum += i;
			//i++;
			sum += i++;

		}
		System.out.println("1부터 " + ran + "까지의 총합계 : " + sum);
	}
	
	public void method4() {
		// 무한반복문 쓰는 케이스
		Scanner sc = new Scanner(System.in);

		//while (true) {	// 무한 반복문
		for(;;) {			// 무한 반복문
			System.out.println("\n===== 메뉴 =====");
			System.out.println("1. 안녕하세요 5번 출력");
			System.out.println("2. 1부터 5까지 출력");
			System.out.println("3. 1부터 랜덤값까지의 합계 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 선택 > ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				method1(); break;
			case 2:
				method2(); break;
			case 3:
				method3(); break;
			case 0:
				System.out.println("이용해주셔서 감사합니다. 안녕히 가세요.");return;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다. 다시 입력 해주세요.");
			}
		}
		

	}
	public void method5() {
		
		
	}
	
	
}
