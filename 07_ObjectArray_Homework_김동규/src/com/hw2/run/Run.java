package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] s = new Student[10];

		int count = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("학생 정보 추가(Y/N) : ");
			String yn = sc.nextLine();

			if (yn.equals("n") || yn.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (yn.equals("y") || yn.equals("Y")) {
				System.out.print("학년 : ");
				int grade = sc.nextInt();

				System.out.print("반 : ");
				int classnum = sc.nextInt();

				sc.nextLine();

				System.out.print("이름 : ");
				String name = sc.nextLine();

				System.out.print("국어점수 : ");
				int kor = sc.nextInt();

				System.out.print("영어점수 : ");
				int eng = sc.nextInt();

				System.out.print("수학점수 : ");
				int math = sc.nextInt();

				sc.nextLine();

				s[count] = new Student(grade, classnum, name, kor, eng, math);

				count++;
			}
			if (count > s.length) {
				break;
			}
		}
		for (int i = 0; i < s.length; i++) {
	         if(s[i] == null) {
	            break;
	         }else{
	            System.out.println(s[i].information());
	         }
	   
	      }

	}

}
