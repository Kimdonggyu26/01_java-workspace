package com.br.practice.example;

import java.util.Scanner;

public class VariablePractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
	
		System.out.print("키를 입력하세요(cm) : ");
		double tall = sc.nextDouble();
		
		System.out.printf("\n키 %.1f인 %d살 %c자 %s님 반갑습니다^^", tall, age, gender, name);
		
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum12 = num1 + num2;
		int multi12 = num1 * num2;
		int	subs12 = num1 - num2;
		int div12 = num1 / num2;
		
		
		System.out.printf("\n더하기 결과 : %d \n빼기 결과 : %d \n곱하기 결과 : %d "
				+ "\n나누기 몫 결과 : %d", sum12, subs12, multi12, div12);

		
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double line1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("세로 : ");
		double line2 = sc.nextDouble();
		
		double area = line1 * line2;
		double length = (line1 + line2) * 2;
		
		System.out.printf("\n면적 : %.2f \n둘레 : %.1f", area, length);
		
		
	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String words = sc.nextLine();
		
		char word1 = sc.nextLine().charAt(0);
		char word2 = sc.nextLine().charAt(1);
		char word3 = sc.nextLine().charAt(2);
		
		System.out.printf("첫 번째 문자 : %c \n두 번째 문자 : %c \n세 번째 문자 : %c", word1, word2, word3);
		
		
		
		
		
		
		
		
		
	}
}
