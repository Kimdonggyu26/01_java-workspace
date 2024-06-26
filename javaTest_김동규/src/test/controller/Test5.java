package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력(1~9) : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력(1~9) : ");
		int num2 = sc.nextInt();

		if (num1 >=1 && num1 <= 9 && num2 >=1 && num2 <= 9) {
			int num3 = num1 * num2;
			
			if(num3 >= 10) {
				System.out.println("두 자리 수 입니다.");
			}else
				System.out.println("한 자리 수 입니다.");
		}
		

		

		

		
	}

} //1e
