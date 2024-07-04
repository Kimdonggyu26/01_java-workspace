package com.br.chap01_poly.run;

import com.br.chap01_poly.model.vo.Child1;
import com.br.chap01_poly.model.vo.Child2;
import com.br.chap01_poly.model.vo.Parent;

public class PolyMain {

	public static void main(String[] args) {

		// = 대입연산자 기준 왼쪽, 오른쪽 자료형이 같아야됨 !
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		
		Parent p1 = new Parent();
		p1.printParent();
		// p1레퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		// c1 레퍼런스로 Child1, Parent에 둘 다 접근 가능
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우 (다형성)");
		
		Parent p2 = /*(parent)*/new Child1();
		p2.printParent();
		((Child1)p2).printChild1(); // 강제형변환을 하면 호출은 가능
		// p2 레퍼런스로 Parent에 바로 접근 가능하나
		//				 Child1에 접근하려면 DownCasting 진행해야됨
		
		
		
		
		/*
		 * 상속 구조의 클래스들 간 형변환 가능
		 * 
		 * 1. UpCasting
		 * 	  자식 타입 -> 부모 타입
		 * 	  자동형변환
		 * 		 ex) 부모 = 자식객체;
		 * 				자식.부모메소드();
		 * 
		 * 2. DownCasting
		 *    부모 타입 -> 자식 타입 
		 *    강제형변환
		 *    	  ex) ((자식)부모).자식메소드
		 * 
		 */
		
		/*
		 * < 다형성 >
		 * 
		 * 부모타입으로부터 파생된 여러타입의 자식 객체들을
		 * 부모타입 하나로 다룰 수 있는 기술
		 * 
		 * < 다형성 적용 목적(장점) >
		 * 
		 * 1. 다수의 자식 객체들을 하나로 관리할 수 있어 용이 (부모타입배열로 관리)
		 * 
		 */
		
		// 다형성 적용 전. Child1객체 2개, Child2 객체 2개 관리
		Child1[] arr1 = new Child1[2];		// {Child1타입, Child1타입}
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];      // {Child2타입, Child2타입}
		arr2[0] = new Child2(4, 2, 1);
		arr2[1] = new Child2(2, 3, 1);
		
		//----------------------------------------------------------------
		
		// 다형성 적용 후. Child1객체 2개, Child2 객체 2개 관리
		
		Parent[] arr = new Parent[4];   // {Parent 타입, Parent 타입, Parent 타입, Parent 타입}
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(4, 2, 1);
		arr[2] = new Child2(2, 3, 1);
		arr[3] = new Child1(2, 3, 5);
		// 하나의 부모타입만으로 여러 자식객체들을 관리할 수 있음 => 편리함, 코드길이감소
		
		System.out.println("=================================");
		
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("================반복문활용=================");
		
		for(int i = 0; i < arr.length; i++) {
			//if(i == 0 || i == 3) {
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
		}
		
		System.out.println("================오버라이딩 적용=================");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].print();
		}

		
	}

}
