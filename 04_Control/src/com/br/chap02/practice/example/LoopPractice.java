package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("다시 입력해주세요.");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}break;
			}
			

		}

	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for( int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for( int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}break;
			}else {
				System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " + " + num + " = ");
		}
		
	
	}

}
