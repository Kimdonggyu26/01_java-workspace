package com.br.collection.controller;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.br.collection.model.vo.Music;

public class ListController {
	
	/*
	 * < java.util.Collection > List > ArrayList >
	 * 
	 * 1. 선형자료구조의 컬렉션으로 배열을 가지고 있어 
	 *    데이터가 순차적으로 보관되어 관리됨 
	 * 2. 특징
	 * 	  ㄴ 순서대로 데이터(value)가 저장
	 * 	  ㄴ 인덱스로 각 데이터가 관리 
	 * 	  ㄴ 중복 데이터 보관 가능 
	 */
	
	public void arrayListTest1() {
		
//		List list = new List(); // List는 인터페이스임 == 객체생성 불가능
		
		// 제네릭 타입을 지정하지 않을 경우 => Object타입으로 E 타입이 지정
		List list = new ArrayList(); // List<Object> 
		
		list.add(10);
		list.add("안녕하세요");
		list.add(5.12);
		System.out.println(list/*.toString()*/);
		
		list.add(2, "안녕하세요");
		System.out.println(list);
		
		System.out.println(list.get(0)); 
		System.out.println(list.get(1)); 
		System.out.println(list.get(2)); 
		System.out.println(list.get(3)); 
		
		//System.out.println(list.get(4)); // IndexOutOfBoundsException발생
		
	}
	
	public void arrayListTest2() {
		
		// 정수값만 저장 가능한 list 생성 
		List<Integer> numList = new ArrayList<>();
		
		numList.add(1);
		numList.add(2);
		numList.add(3);
//		numList.add("안녕");
		
		System.out.println(numList);
		
		System.out.println("요소 갯수(리스트의 사이즈): " + numList.size());
		System.out.println("리스트의 마지막 인덱스수: " + (numList.size()-1));
		
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		
	}
	
	public void arrayListTest3() {
		
		// 문자열만 저장가능한 list 생성
		List<String> strList = new ArrayList<>();
		
		strList.add("안녕");
		strList.add("hello");
		strList.add("bye");
//		strList.add(4);
		
		System.out.println(strList);
		
		/*
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		*/
		
		for(String s : strList) { // 변수 = strList.get(0); => 변수 = strList.get(1); => .. 마지막인덱스
			System.out.println(s);
		}
		
	}
	
	public void arrayListTest4() {
		String[] seasonArr = {"봄", "여름", "가을", "겨울"};
		
		List<String> seasonList = Arrays.asList(seasonArr);
		
		System.out.println(seasonList);
		
		
		// seasonList.add("계절"); 		
		// seasonList.remove(1);
		seasonList.set(0, "Spring");
		
		System.out.println(seasonList);
		
		List<String> carList = Arrays.asList("제네시스", "벤츠", "BMW");
				
		System.out.println(carList);
		
		
		
	}
	
	public void arrayListTest5() {
		List<String> hobbyList = List.of("운동", "게임", "영화", "산책");
		System.out.println(hobbyList);
		
		// hobbyList.add("요리");
		// hobbyList.remove(1);
	}
	
	public void arrayListTest6() {
		List<Music> list = new ArrayList<>();
		System.out.println("초기 list : " + list);
		
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다","정키"));
		
		System.out.println("추가 후 list : " + list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println("추가 후 list : " + list);
		
		list.remove(1);
		
		System.out.println("삭제 후 list : " + list);
		
		list.set(0, new Music("술이 달다", "에픽하이"));
		
		System.out.println("변경 후 list : " + list);
		
		System.out.println("list의 사이즈 : " + list.size());
		System.out.println("list의 마지막 인덱스 수 : " + (list.size()-1));
		
		System.out.println("0번 인덱스 Music객체 : " + list.get(0));
		
		Music m = list.get(1);
		System.out.println("1번인덱스 Music객체 : " + m);
		System.out.println("제목만 : " + m.getTitle());
		System.out.println("가수만 : " + m.getArtist());
		
		System.out.println("2번 인덱스 Music객체의 제목만 : " + list.get(2).getTitle());
		
		list.get(1).setTitle("저 밤");
		System.out.println(list.get(1));
		
		System.out.println("================ for loop문 =================");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("================ for each문 =================");

		for(Music ms : list) {
			System.out.println(ms);
		}
		
		List<Music> sub = list.subList(0, 2);
		
		System.out.println("추출한 lsit : " + sub);
		
		list.addAll(sub);
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
	}
	
	public void arrayListTest7() {
		
	}
	
	
	
	
	
	
	
	
	
	

}
