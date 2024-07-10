package com.br.collection.controller;

import java.util.ArrayList;
import java.util.List;

public class ListController {
	
	public void arrayListTest1() {
		
		// List list = new List(); // List는 인터페이스임 == 객체생성 불가능
		
		List list = new ArrayList();
		
		list.add(10);
		list.add("안녕하세요");
		list.add(5.12);
		System.out.println(list);

		list.add(2, "안녕하세요");
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
	}
	
	public void arrayListTest2() {
		
		// 정수값만 저장 가능한 list 생성
		List<Integer> numList = new ArrayList<>();
		
		numList.add(1);
		numList.add(2);
		numList.add(3);
		
		System.out.println(numList);
		
		System.out.println("요소 갯수(리스트의 사이즈) : " + numList.size());
		System.out.println("리스트의 마지막 인덱스수: " + (numList.size()-1));
		
		for(int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
	}

	public void arrayListTest3() {
		
		// 문자열만 저장 가능한 list 생성
		List<String> strList = new ArrayList<>();
		
		strList.add("안녕");
		strList.add("hello");
		strList.add("bye");
		
		System.out.println(strList);
		
		/*
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		*/
		
		for(String s:strList) {
			System.out.println(s);
		}
		
		
	}
	
	
}
