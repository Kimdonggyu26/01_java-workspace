package com.br.collection.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.br.collection.model.vo.Snack;

public class MapController {
	
	/*
	 * < java.util.Map > HashMap >
	 * 
	 * 1. key-value 함께 저장하는 구조로 
	 *    객체를 대신해서 사용하는 개념
	 * 2. 특징
	 * 	  ㄴ 담고자하는 데이터(value)를 키(key)와 함께 저장
	 * 	  ㄴ 순서 유지 되지 않음 (index개념x, key가 각 데이터를 식별함)
	 * 	  ㄴ 키는 중복을 허용하지 않음 
	 * 3. 구성요소
	 * 	  ㄴ Key 	: 각 데이터(Value)들의 식별자같은 존재, Set의 특성(순서 없고, 중복허용x)
	 * 	  ㄴ Value	: 데이터 
	 * 	  ㄴ Entry	: Key와 Value를 함께 칭함
	 */
	
	public void hashMapTest1() {
		
		// 학생 한명의 정보를 담는 map컬렉션 
		// K == String, V == Object
		Map<String, Object> stu = new HashMap<>();
		
		stu.put("name", "홍길동");
		stu.put("age", 10);
		stu.put("height", 180.2);
		stu.put("kor", 100);
		stu.put("eng", 80);
		stu.put("math", 60);
		
		stu.put("kor", 20);
		
		// 일회용 vo 같은 느낌 
		// key == vo의 필드
		// value == vo의 필드에 담긴 값
		
		System.out.println(stu); // 순서유지 안됨, 키가 중복될 경우 value는 덮어씌워짐
		
		// get(Object key) : 전달된 key 정보를 통해서 value를 V 타입으로 반환 
		double height = (double)stu.get("height");
		System.out.println(height);
		
		String name = (String)stu.get("name");
		System.out.println(name);
		
	}
	
	public void hashMapTest2() {
		// 초기에 데이터를 담아둔 채로 바로 생성 
		// * Map.of(key1, value1, key2, value2, ...) : unmodifiable map 반환 
		Map<String, Object> stu = Map.of("name", "홍길동"
									   , "age", 10
									   , "height", 180.2);
		
		System.out.println(stu);
		
		//stu.put("kor", 100);		// 더이상 추가 불가능
		//stu.remove("name");		// 삭제 불가능
		//stu.replace("age", 20);	// 수정 불가능
	}
	
	public void hashMapTest3() {
		
		// K == String, V == Snack
		Map<String, Snack> map = new HashMap<>();
		
		// * put(K key, V value) : 맵 컬렉션에 키-밸류 세트로 추가시켜주는 메소드
		map.put("다이제", new Snack("초코맛", 1500));
		map.put("칸초", new Snack("단맛", 600));
		map.put("새우깡", new Snack("짠맛", 500));
		
		map.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(map); // {키=밸류, 키=밸류, ..}
		
		map.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가할 경우 value값이 덮어씌워짐
		
		System.out.println(map);
		
		// * get(Object Key) : 맵 컬렉션에서해당 키값을 가지는 Vlaue값을 V타입으로 반환
		Snack s = map.get("다이제");
		System.out.println(s);
		
		
		System.out.println("몇 개 : " + map.size());
		
		map.replace("포테이토칩", new Snack("겁나짠맛", 1000));
		System.out.println(map);
		
		map.remove("포테이토칩");
		System.out.println(map);
		
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> itkey = keySet.iterator();
		
		while(itkey.hasNext()) {
			String key = itkey.next();
			Snack value = map.get(key);
			System.out.println(key + ", " + value);
			
			
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		while (itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}
	}
	
	public void propertiesTest1() {
		
		Properties prop = new Properties();
		
		prop.put("다이제", new Snack("초코맛",1500));
		prop.put("새우깡", new Snack("짠맛", 700));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void propertiesTest2() {
		
		Properties prop = new Properties();
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("set"));
		
		
		try {
			
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void propertiesTest3() {
		
		Properties prop = new Properties();
		
		try {
			//prop.load(new FileInputStream("test.properties"));
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
	}
	
	
	
}
		
	
	
	
	


