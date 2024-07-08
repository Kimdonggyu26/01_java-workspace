package com.br.chap03_wrapper;

public class WrapperMain {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 15;
		
		// 방법 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1 뒤쪽이 크면 -1반환 같으면 0 반환 해주는 메소드
		
		// 벙법 2. 단순 대입을 통한 방법(AutoBoxing)
		Integer i3 = num1;
		Integer i4 = 15;
		
		System.out.println(i3);
		System.out.println(i4);
		
		// 번외. 문자열 데이터("123")를 wrapper클래스 객체화
		// Integer i5 = "123";
		// Integer i5 = new Integer("123"); //가능하지만 권장x
		Integer i5 = Integer.valueOf("123"); // 권장 O
		
		System.out.println(i5);
		
		System.out.println("==================================");
		
		// * UnBoxing : Wrapper 클래스 자료형 => 기본 자료형
		// 방법1. Wrapper 클래스의 xxxValue 메소드 이용 방법
		int num3 = i3.intValue(); // i3 => num3
		int num4 = i4.intValue(); // i4 => num4
		
		System.out.println(num3);
		System.out.println(num4);
		
		// 방법2. 단순 대입을 통한 방법 (AutoUnBoxing)
		int num5 = i5;
		
		System.out.println(num5);
		
		System.out.println("==============================");
		
		// 기본자료형 <--> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);
		
		// 1. String --> 기본자료형 (파싱한다)
		// 주석복붙
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
		
		
		
	}

}
