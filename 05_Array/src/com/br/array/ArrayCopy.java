package com.br.array;

import java.util.Arrays;

public class ArrayCopy {
	
	public void method1() {

		int[] origin = { 1, 2, 3, 4, 5 }; // 원본배열

		int[] copy = origin;

		System.out.println("=== 복사본 배열 출력 ===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		copy[2] = 100;
		System.out.println(" === 변경 후 복사본 배열 출력 ===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
			System.out.println();
			
			System.out.println(" === 변경 후 원본 배열 다시 출력 ===");
			for(int i = 0; i < origin.length; i++) {
				System.out.print(origin[i] + " ");	
		}
			System.out.println();		
			
			// copy(복사본)만을 가지고 수정 했는데 원본배열까지도 변경되어있음
			System.out.println("origin의 주소값 : " + origin.hashCode());
			System.out.println("copy의 주소값 : " + copy.hashCode());
			
			// * 얕은복사
			//    ㄴ 주소값만을 복사하는 개념 => 같은 곳을 참조하는 형태가 됨
			// [표현법] 복사본배열 = 원본배열;
			
			// 원본배열을 훼손시키지 않고 그대로 유지시키고자 할 경우
			// => 깊은 복사
	} //1e
	
	// 깊은 복사 방법 1. for문을 활용한 방법
	public void method2() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// 1. 원본배열에 담겨있는 값들을 담기 위한 새로운 배열 만들어 두기
		int[] copy = new int[5];
		
		// 2. 반복문을 통해서 값들을 일일히 복사
		for(int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		
		copy[2] = 100;
		System.out.println("== 복사 후 수정 후 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
	} //1e

	// 깊은 복사 방법2. System클래스에서의 arraycopy() 메소드를 이용
	public void method3() {
		int[] origin = {1, 2, 3, 4, 5};
		
		// 1. copy 배열 새로이 생성
		int[] copy = new int[10]; // 넉넉하게 크게 생성 0 ~ 9번까지 0이 담겨있음
		
		// 2. arraycopy메소드 실행
		//		System.arraycopy(원본배열, 복사시작할인덱스, 복사본배열, 복사본배열의 복사될 시작인덱스, 복사할 갯수)
		System.arraycopy(origin, 1, copy, 2, 3);
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	} //1e
	
	// 깊은 복사 방법3.
	// Arrays 클래스의 copyOf() 메소드 사용
	public void method4() {
		int[] origin = {1, 2, 3, 4, 5};
		
		// Arrays.copyOf(원본배열, 복사할길이); : 내부적으로 복사된 배열객체를 새로이 생성해서 반환
		//int[] copy = Arrays.copyOf(origin, 5); 		// 1 2 3 4 5
		//int[] copy = Arrays.copyOf(origin, 10); 		// 1 2 3 4 5 0 0 0 0 0
		int[] copy = Arrays.copyOf(origin, 3); 			// 1 2 3
		
		/*
		 * 내가 전달한 복사할 길이만큼의 크기로 배열 생성
		 * 		이때 해당 복사할 길이가 원본 배열의 크기보다 클 경우	=> 원본 데이터 전체 복사 
		 * 		이때 해당 복사할 길이가 원본 배열의 크기보다 작을 경우	=> 원본 데이터 중에 해당 갯수 만큼 복사
		 */
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
	} //1e
	
	// 깊은 복사 방법 4.
	// 배열.clone() 메소드 이용
	public void method5() {
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = origin.clone();
		
		/*
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		*/
		
		System.out.println(Arrays.toString(copy));
		
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	} //1e
	
	/*
	 * [참고]
	 * java.lang.String
	 * java.lang.System
	 * java.lang.Math
	 * ...
	 * => java.lang 패키지에 있는 클래스들을 사용할 때는 import를 안해도 됨
	 * 
	 * java.util.Scanner
	 * java.util.Arrays
	 * ...
	 * => java.lang 이외의 패키지에 있는 클래스들을 사용할 때는 import 해야됨
	 */
	
	
	
	
	
	}

