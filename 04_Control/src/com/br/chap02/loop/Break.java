package com.br.chap02.loop;

import java.util.Scanner;

public class Break {

	/*
	 * break; : 반복문 안에 사용되는 분기문
	 * 			break;을 만나는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 * 반복문1() {
	 * 	반복문2(){
	 * 		break;	// 반복문 2를 빠져나감 (반복문 1은 반복됨)
	 *  }
	 *  // 이 시점으로 빠져나가짐
	 * }
	 * 
	 * * 유의사항 : switch문 안에서의 break;은 단지 switch문만 빠져나가짐
	 * 반복문() {
	 *  switch() {
	 *  	break; // switch문을 빠져나감
	 *  }
	 *  // 이 시점으로 빠져나감 => 반복문이 다시 실행됨
	 *  }
	 *  
	 */
	
	public void method1() {
		// 사용자에게 문자열을 입력받아 해당 문자열과 길이 출력 (이 과정을 매번 반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복이 종료
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			
			if (str.equals("exit")) {
				break;
			}else {
			System.out.println(str + "의 글자 수는 : " + str.length() + "글자 입니다.\n");
		}
	}
		
	}
	public void method2() {
		// 랜덤값(1~100) 발생 시키고, 출력 (이 과정 매번 반복 실행)
		// 단, 발생된 랜덤값이 3의 배수일 경우 반복 종료
	
		for (;;) {
			int random = (int) (Math.random() * 100 + 1);
			System.out.println(random);

			if (random % 3 == 0) {
				break;
			}
		}
		System.out.println("프로그램이 종료됩니다.");
	}
	public void method3() {
		// 사용자에게 단(2~9)을 입력받아
		//		잘 입력 했을 경우 => 해당 단을 출력하고 종료
		// 		잘못 입력 했을 경우 => 다시 입력 받음
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("단(2~9) 입력 : ");
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) {
				for(int su=1; su<=9; su++) {
					System.out.printf("%d x %d = %d\n", dan, su, dan * su);
				}
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
			}
		}
		
	}
}
