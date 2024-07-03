package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student s[] = new Student[3];
		
		s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(int i = 0; i < s.length; i ++) {
			System.out.println(s[i]);
		}
		
		Employee e[] = new Employee[10];
	
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			e[i] = new Employee(name, age, height, weight, salary, dept);
			
			i++;
			
			System.out.print("계속 하시겠습니까(Y/N) : ");
			String y = sc.nextLine();
			
			if(y.equals("y") || y.equals("Y")) {
				
			}else {
				break;
			}
		}
		
			for(int a = 0; a < e.length; a++) {
				if(e[a] == null) {
					break;
				}else {
					System.out.println(e[a]);
				}
			}
	

	}

}
