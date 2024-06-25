package com.br.chap02.loop;

import java.util.Scanner;

public class Continue {

	/*
	 * continue; : 반복문 안에 기술되는 구문으로
	 * 			   continue; 실행시 그 뒤의 구문들은 실행되지 않고
	 * 			   즉시 현재 속해있는 반복문의 위로 올라가서 이어서 진행
	 */
	
	public void method1() {
		// 1부터 10까지의 홀수 출력
		// 1 3 5 7 9
		// 
		/*
		for(int i = 1; i <= 10; i++) {	// 1에서부터 10까지 1씩증가되는 동안 반복
			if(i % 2 == 1) { // 홀수일 경우 해당 출력문이 실행되도록
				System.out.print(i + " ");
			}
			
		}
	}
	*/
		for (int i = 1; i <= 10; i++) {

			// 짝수일 경우 뒤의 내용을 건너뛰게끔 (continue;)
			if (i % 2 == 0) {
				continue; // 반복문이 곧바로 이어서 진행됨 => 증감식으로 곧바로 넘어감
			}
			System.out.print(i + " ");

		}
	}

	public void method2() {
		// 1부터 100까지의 총합계
		// 단, 6의 배수값은 빼고 덧셈연산
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 6 == 0) {
				continue;
			}

			sum += i;
		}

		System.out.println("결과 : " + sum);

	}
	
	public void method3() {
		// 2단부터 9단까지 출력
		// 단, 3의 배수 단은 제외하고 출력

		for (int i = 2; i <= 9; i++) {
			if (i % 3 == 0) {
				continue;
			} else {
				for (int r = 1; r <= 9; r++) {
					System.out.printf("%d x %d = %d\n", i, r, i * r);
				}
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		// 12번 실습문제 !
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String c = sc.nextLine();
			
			if (c.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			if ((c.equals("/") || c.equals("%")) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue;
			}
					
			
			int result = 0;
			switch(c) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			default: System.out.println("없는 연산자입니다. 다시입력해주세요.\n"); continue;
			}
			System.out.printf("%d %s %d = %d\n\n", num1, c, num2, result);
			
			
			
				
			
		}
		
		
		
		
		
		
		
	}
}
	
