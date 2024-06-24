package com.br.chap02.loop;

import java.util.Scanner;

public class For {

	/*
	 * <반복문>
	 * 프로그램의 흐름을 제어하는 제어문 중 하나
	 * 특정 코드를 반복적으로 수행시켜줌
	 * 
	 * 두 종류 (for문 / while문 (do-while문))
	 * 
	 * >>for문
	 * 
	 * for([초기식]; [조건식]; [증감식]) { // ()안에는 반복 횟수를 지정
	 * 	반복적으로 실행 하고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될때 "처음에 단 한번만 실행되는 구문"
	 * 			  (보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건" 작성하는 구문 (비교연산자, 조건연산자 등 활용)
	 * 			  조건식이 true일 경우 해당 블럭안의 구문 실행
	 * 			  조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			  (보통 초기식에 제시된 변수를 가지고 조건식을 작성함)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 * 			 (보통 초기식에 재시된 변수를 가지고 증감연산자(++,--)와 함께 작성)
	 * 
	 * *실행되는 순서
	 * 
	 * 초기식 -> 조건식 검사 -> true일 경우 블럭안의 코드 실행 -> 증감식
	 * 		  -> 조건식 검사 -> 			"				   -> 증감식
	 * 		  -> 조건식 검사 -> 			"				   -> 증감식
	 * 		 ----------------------- 반복 수행됨 ------------------------
	 * 		  -> 조건식 검사 -> false일 경우 그 즉시 반복문을 빠져나옴
	 */
	
	public void method1() {
		// 안녕하세요 5번 반복 출력

		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요");
		}

		// for(int i=0; i<=4; i++) {
		for (int i = 0; i < 5; i++) {
			System.out.println("반갑습니다");
		}
		
		/*
		 *  Tip. 내가 원하는 횟수만큼 반복문을 돌리고자 할 때
		 *  for(int i = 0; i<횟수; i++) {
		 *  
		 */

		for (int i = 11; i < 16; i++) {
			System.out.println("저리가세요");
		}

		for (int i = 1; i < 10; i += 2) {
			System.out.println("hello");
		}
		
	}
	public void method2() {
		// 1부터 5까지 출력
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);*/

		for (int i = 1; i <= 5; i++) { // i값이 1에서부터 5까지 1씩 증가되는 동안 반복수행
			System.out.println(i);
		}
		
		//System.out.println(i);	// 반복문 안에 선언된 변수는 반복문 블럭안에서만 사용 가능
	}

	public void method3() {
		// 5 4 3 2 1

		for (int i = 5; i >= 1; i--) {
			System.out.println(i + " ");
		}
	}

	public void method4() {
		// 1 2 3 4 5 ... 10

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
	public void method5() {
		// 1부터 10 사이의 홀수만을 출력 ( 1 3 5 7 9 )

		/*
		 * for (int i = 1; i < 10; i += 2) { System.out.print(i + " "); }
		 */
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}

		}
	
	}

	public void method6() {
		// 1에서부터 10까지의 총 합계

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println("1에서부터 10까지의 총 합계 : " + sum);
	}

	public void method7() {
		// 1에서부터 사용자가 입력한 수까지의 총합계
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.print("정수(1이상의 정수) : ");
		int num = sc.nextInt();

		if (num > 0) {
			int sum = 0;
			for (int i = 1; i <= num; i++) { // i값은 1에서부터 num값까지 1씩 증가되는 동안 반복수행
				sum += i;
			}
			System.out.println("1에서 " + num + "까지의 총 합계 : " + sum);
			break;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		}
	}
	public void method8() {
		// 1에서부터 랜덤값(1~10사이의 정수)까지의 총 합계
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드 호출 => 0.0 ~ 0.9999999 사이의 실수 랜덤값
		 */
		
		//int random = Math.random();	//	random값은 double형
		//             0.0 <=      < 1.0       => 0.0 ~ 0.99999
		
		//int random = Math.random() * 10;
		//			   0.0 <= 	   < 10.0      => 0.0 ~ 9.999999

		//int random = Math.random() * 10 + 1;
		//			   1.0 <= 	   < 11.0 	   => 1.0 ~ 10.999999
		
		int random = (int)(Math.random() * 10 + 1);
		//			     1 <=      < 11        => 1 ~ 10
		
		System.out.println("1~10사이의 랜덤값 : " + random);
		
		int sum = 0;
		for(int i = 1; i<=random; i++) {
			sum += i;
		}
		
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
		
		/*
		 * Tip. 랜덤값 발생 범위 지정
		 * int()(Math.random() * 발생시킬 랜덤값의 갯수 + 시작수)
		 * 
		 * ex) 1 ~ 10 => int()(Math.random() * 10 + 1)
		 * 	  11 ~ 20 => int()(Math.random() * 10 + 11)	
		 */
		
	}


	public void method9() {
		// 문자열로부터 각 인덱스의 문자들을 뽑아서 출력
		/*
		 * ex) String str = "Hello"
		 * H => 출력(str.charAt(0));
		 * e => 출력(str.charAt(1));
		 * l		  ...
		 * l		  ...
		 * o => 출력(str.charAt(4));
		 * 
		 * 0번 인덱스에서부터 마지막 인덱스까지 매번 1씩 증가되면서 반복 수행
		 */
		
		String str = "Hello";

		//for (int i = 0; i < 5; i++) {
		for (int i = 0; i < str.length(); i++) { //문자열.length() => 문자열글자수(길이)
			System.out.println(str.charAt(i));
		}
		
		
	}

	public void method10() {
		// 사용자에게 문자열을 입력받아서 모든 인덱스의 문자 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.println(str + "의 글자수(길이) : " + str.length());

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));

		}

	}
	public void method11() {
		// 구구단 2단 출력하기
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 *   :
		 *   :
		 * 2 x 9 = 18
		 */
		for(int num = 1; num <= 9; num++) {
			System.out.printf("%d x %d = %d\n", 9, num, 9*num);
		}
		
	}
	public void method12() {
		// 랜덤(2~9)단 출력하기
		Scanner sc = new Scanner(System.in);
		
		int ran = (int)(Math.random() * 8 + 2);
		
		for(int num = 1; num <= 9; num++) {
			System.out.printf("%d x %d = %d\n", ran, num, ran*num);

		}

	}
	public void method13() {
		// 2단 ~ 9단까지 전체 출력
		
		for(int ran = 2; ran <= 9; ran++) {		
		for(int num = 1; num <= 9; num++) {
			System.out.printf("%d x %d = %d\n", ran, num, ran * num);
		}
		System.out.println();
		}
	}

	public void method14() {
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5

		for (int j = 0; j < 3; j++) {

			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();

	
	}
}
	public void method15() {
		// ****
		// ****
		// ****
		// ****
		
		// 행 0~3행까지 1씩 증가				=> 바깥쪽 for문
		// 각 행별 열은 0열~3열까지 1씩 증가 	=> 안쪽 for문
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void method16() {
		// 1***
		// *2**
		// **3*
		// ***4

		for (int i = 1; i <= 4; i++) {	// 행의 반복문
			for (int j = 1; j <= 4; j++) {	// 각 행별 열의 반복문
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
	
}

	
	
	
	
	
