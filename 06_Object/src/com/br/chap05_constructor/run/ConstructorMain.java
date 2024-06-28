package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Cosmetic;
import com.br.chap05_constructor.model.vo.User;

public class ConstructorMain {

	public static void main(String[] args) {

		User u1 = new User();

		System.out.println(u1.information());

		u1.setUserId("user01");
		u1.setUserPwd("Pass01");
		u1.setUserName("홍길동");
		// 나이, 성별은 데이터 값 없음
		System.out.println(u1.information());
		
		
		// 매개변수 생성자를 이용해서
		// 객체 생성과 동시에 값 초기화
		User u2 = new User("user02", "pass02", "김말똥");
		System.out.println(u2.information());
		
		User u3 = new User("user03", "pass03", "강개순", 23, '여');
			System.out.println(u3.information());
		
			// 비밀번호 변경 요청이 들어왔다는 가정하에
			// 실행할 코드 => setter메소드를 호출해서 값 변경
			u3.setUserPwd("1234");
			System.out.println(u3.information());
			System.out.println("==============");
			
			Cosmetic c = new Cosmetic("스킨", 12000, "Torriden", "기초 화장품");
			
			System.out.println(c.information());
	}
	

	

			

}
