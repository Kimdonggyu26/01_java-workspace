package com.br.chap02_String;

public class StringPoolMain {

	public static void main(String[] args) {
		
		// 문자열을 생성할 때 두가지 방법
		
		// 1. 문자열 객체 : new String("문자열")
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String 클래스에 toString 메소드 오버라이딩 : 실제 데이터값 반환
		
		
		System.out.println(str1 == str2);
		
		System.out.println(str1.equals(str2));
		// String 클래스에 equals메소드 오버라이딩 : 실제 데이터값 비교 반환
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 클래스에 hashCode 메소드 오버라이딩 : 실제 데이터값으로 10진수 반환
		
		// 찐 주소값이 다른지 보고싶으면 => System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("=================================");
		
		
		// 2. 문자열 리터럴 : "문자열"
		String str3 = "hello";
		String str4 = "hello";
		// 리터럴 제시시 String Pool(상수풀) 영역에 데이터값 올라감
		// String Pool의 특징 : 동일한 문자열을 가질 수 없음
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4); // true(주소값 비쇼) == 주소값 일치
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
		/*
		 * 주석 복붙
		 */
		
		
		String str = "반가워!";
		System.out.println(str);
		
		str += "난 String이야";  // str = str + "새문자열"
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// 변경을 할 때마다 새로운 주소값이 대입 == 매번 새로운 곳을 참조 (기존 자리에서 변경되는 게 아님)
		// 기존에 참조하던 객체를 매번 GC가 지워줘야되는 번거로움
		
		System.out.println("========================");
		
		// StringBuilder 객체 생성시 기본적으로 16개의 문자를 담을 수 있는 버퍼가 생성
		StringBuilder sb = new StringBuilder("반가워!"); // 16 + 글자수
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		System.out.println("-------------------------");
		
		// sb.append(추가시킬 문자열) : 기존의 문자열에 전달된 문자열을 추가
		sb.append("안녕!");
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		System.out.println("-------------------------");
		
		// sb.delete(시작인덱스,끝인덱스) : 기존의 문자열 시작인덱스(포함) <=  < 끝 인덱스(미포함) 범위의 문자열 삭제 메소드
		sb.delete(3, 4);
	
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		System.out.println("-------------------------");
		
		// sb.insert(위치, 추가시킬문자열) : 해당 위치에 전달된 문자열 추가
		sb.insert(3, "ㅎㅎㅎ");
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		System.out.println("-------------------------");

		// sb.reverse() : 기존의 문자열을 역으로 변경
		
		sb.reverse();
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		System.out.println("-------------------------");

		// 변경용 메소드 실행시 해당 StringBuilder 객체를 다시금 반환해줌
		// 따라서 메소드를 연속적으로 호출할 수 있음 == 메소드 체이닝
		sb.append("ㅋㅋㅋ")
		  .delete(0, 4)
		  .reverse()
		  .insert(0,"!!!");
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		// 최종적으로 String 타입에 담고자 할경우
		String result = sb.toString();
		
		
		
		
	}

}
