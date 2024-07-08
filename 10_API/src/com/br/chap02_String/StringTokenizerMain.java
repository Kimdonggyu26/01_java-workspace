package com.br.chap02_String;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	
	public static void main(String[] args) {
		
		String str = "Java,Oracle,HTML,CSS,Spring";
		
		//주석복붙
		
		String[] arr = str.split(",");
		System.out.println("분리된 문자열의 갯수(배열의 길이) : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		
		// 방법2. 분리된 문자열들을 각각의 토큰으로 관리하고자 할 경우
		// 		  Java.util.StringTokenizer
		// 		  StringTokenizer 변수 = new String Tokenizer("문자열", "구분자")
		//		  단, StringTokenizer에 담긴 분리된 문자열들은 한번 꺼내 쓰면 끝
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수(토큰 갯수) : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println("남은 토큰 갯수 : " + stn.countTokens());
		
		System.out.println(stn.nextToken()); // 오류NoSuchElementException발생(더이상의 요소가 없음)
		*/
		
		/*
		for(int i = 0; i < stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법 1. 분리된 문자열의 갯수를 고정시켜두기
		/*
		int count = stn.countTokens(); // count = 5
		
		for(int i = 0; i < count; i ++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법 2. 매번 stn에 남아있는 토큰이 있는지 비교하는 메소드 활용
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
	}

}
