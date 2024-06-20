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
		int div12 = num1 / num2;	// int 나누기 int이기 때문에 결과도 int로 나옴 -> 3으로 출력
		
		
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
		String words = sc.nextLine();	// 사용자가 입력한 문자열 값이 words에 이미 기록이 되어있음
	
	   /*
	    *char word1 = sc.nextLine().charAt(0);
	   	*char word2 = sc.nextLine().charAt(1);
	    *char word3 = sc.nextLine().charAt(2);     -> 내가 푼 오류
		*/
		
		char word1 = words.charAt(0);
		char word2 = words.charAt(1);
		char word3 = words.charAt(2);      
		
	
		
		System.out.printf("첫 번째 문자 : %c \n두 번째 문자 : %c \n세 번째 문자 : %c", 
				word1, word2, word3);	//printf 방법
		
		System.out.println("첫 번째 문자 : " + word1);
		System.out.println("두 번째 문자 : " + word2);
		System.out.println("세 번째 문자 : " + word3);  //println 방법 (가독성 좋음)
		
		
		
	}
	
	// 추가 문제 -----------------------------------------------------------------------
		public void method5() {
			
			/*
			 * 키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 고유숫자 값을 출력하시오. 
			 * 
			 * 예) 
			 * 
			 * 문자 : A		 (=> 사용자가 입력한 값)
			 * 
			 * A 숫자값 : 65 (결과 출력)
			 */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자 : ");
			char word = sc.nextLine().charAt(0);
			
			System.out.println(word + " 숫자값 : " + (int)word);		
			
			
		}
		
		public void method6() {
			/*
			 * 정수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 출력하시오.
			 * 단, 평균은 실수형으로 출력되도록 하시오. 
			 * 
			 * ex) 
			 * 국어 : 90 (=> 사용자가 입력한 값)
			 * 영어 : 91 (=> 사용자가 입력한 값)
			 * 수학 : 85 (=> 사용자가 입력한 값)
			 * 
			 * 총점 : 266  	  (결과 출력)
			 * 평균 : 88.67   (결과 출력, 반드시 소수점아래 둘째짜리까지 출력되도록)
			 */
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 : ");
			int test1 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("영어 : ");
			int test2 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("수학 : ");
			int test3 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("\n총점 : " + (test1 + test2 + test3));
			System.out.printf("평균 : %.2f", (double)(test1 + test2 + test3) / 3);			
			
		// 형변환의 시점 중요 윗줄은 test1 + test2 + test3이 double형으로 변환 되고 3으로 나눔
		// ==> double형 나누기 int형 -> int형이 double형으로 자동 형변환 !! 
		}
		
		public void method7() {
			/*
			 * 아래의 코드에 선언된 5개의 변수를 가지고 
			 * 산술연산(+,-,*,/)과 형변환을 적절히 활용하여
			 * 주석에 적힌 값과 같은 값이 나올 수 있도록
			 * 출력문 안의 구문을 수정하시오. 
			 * (출력문 안에 이미 쓰여져있는 변수를 활용할 것)
			 */
			
			int iNum1 = 10;
	        int iNum2 = 4;
	        
	        float fNum = 3.0f; 
	        double dNum = 2.5;
	        
	        char ch = 'A';
	        
	        System.out.println( iNum1 iNum2 ); // 2
	        System.out.println( dNum ); // 2
	        
	        System.out.println( iNum2 dNum ); // 10.0
	        System.out.println( iNum1 ); // 10.0
	        
	        System.out.println( iNum1 iNum2 ); // 2.5
	        
	        System.out.println( fNum ); // 3
	        System.out.println( iNum1  fNum ); // 3

	        System.out.println( iNum1 fNum );// 3.3333333
	        System.out.println( iNum1 fNum ); // 3.333333333333335
	        
	        System.out.println( ch ); // 65
	        System.out.println( ch  iNum1 ); // 75
	        System.out.println( ch  iNum1 ); // 'K'

		}
		
		
	
	
	
}
