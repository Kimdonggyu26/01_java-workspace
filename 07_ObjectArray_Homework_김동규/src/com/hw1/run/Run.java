package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] em = new Employee[3];
		
		em[0] = new Employee();
		em[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		em[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

		for(int i = 0; i < em.length; i++) {
			System.out.println("emp[" + i + "] : " + em[i].information());
		}
		System.out.println("===============================================================");
		
		
		em[0].setEmpNo(0);
		em[0].setEmpName("김말똥");
		em[0].setDept("영업부");
		em[0].setJob("팀장");
		em[0].setAge(20);
		em[0].setGender('M');
		em[0].setSalary(3000000);
		em[0].setBonusPoint(0.2);
		em[0].setPhone("01055559999");
		em[0].setAddress("전라도 광주");
		
		em[1].setDept("기획부");
		em[1].setJob("부장");
		em[1].setSalary(4000000);
		em[1].setBonusPoint(0.3);
		
		for(int i = 0; i <= 1; i++) {
			System.out.println("emp[" + i + "] : " + em[i].information());
		}
		
		for(int i = 0; i < em.length; i++) {
			System.out.println(em[i].getEmpName() + "의 연봉 : " + (int)(em[i].getSalary() + (em[i].getSalary() * em[i].getBonusPoint())) * 12 + "원");
		}
		int sum = 0;
		for(int i = 0; i < em.length; i++) {
			sum += (int)(em[i].getSalary() + (em[i].getSalary() * em[i].getBonusPoint())) * 12;
			
			
		}
		
		System.out.println("===============================================================");
		
		System.out.println("직원들의 연봉의 평균 : " + sum / em.length + "원");
		
	}

}
