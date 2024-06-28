package com.br.chap04_field.run;

import com.br.chap04_field.model.vo.FieldTest3;

public class FieldMain {

	
	public static void main(String[] args) {
		/*
		FieldTest1 f1 = new FieldTest1();
		f1.test(100);
		
		f1 = null; // 객체소멸 => global 소멸
		
		System.out.println("프로그램을 종료합니다.");
	}*/
	 	
	/*
	FieldTest2 f2 = new FieldTest2();
	
	System.out.println(f2.pub); // public이기 때문에 다른패키지에 있어도 직접 접근가능
	//System.out.println(f2.pro); // protected이기 때문에 다른패키지의 클래스에서는 접근 불가능
	//System.out.println(f2.def); // default도 다른 패키지일 경우 접근 불가
	//System.out.println(f2.pri); // private은 그 클래스 안에서만 접근 가능
	*/
		System.out.println(FieldTest3.sta);
		
		FieldTest3.sta = "새로운값";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.STA_FIN);
		//FieldTest3.STA_FIN = "새로운 값";
}
}

