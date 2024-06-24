package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력 \n2. 수정 \n3. 조회 \n4. 삭제 \n9. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 매뉴입니다.");
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			}
		}

		public void practice2() {
			Scanner sc = new Scanner(System.in);

			System.out.print("숫자를 한 개 입력하세요 : ");
			int num = sc.nextInt();

			if (num <= 0) {
				System.out.println("양수만 입력해주세요.");
			} else {
				if (num % 2 == 0) {
					System.out.println("짝수다");
				} else {
					System.out.println("홀수다");
				}
			}

		}
		public void practice3() {
			Scanner sc = new Scanner(System.in);

			System.out.print("국어점수 : ");
			int lan = sc.nextInt();

			System.out.print("수학점수 : ");
			int math = sc.nextInt();

			System.out.print("영어점수 : ");
			int eng = sc.nextInt();

			int sum = (lan + math + eng);

			if (lan >= 40 && math >= 40 && eng >= 40) {
				if (sum >= 180) {
					System.out.println("국어점수 : " + lan + "\n수학점수 : " + math + "\n영어점수 : " + eng);
					System.out.println("합계 : " + sum);
					System.out.println("평균 : " + (double) sum / 3);
					System.out.println("축하합니다, 합격입니다!");
				} else {
					System.out.println("국어점수 : " + lan + "\n수학점수 : " + math + "\n영어점수 : " + eng);
					System.out.println("불합격입니다.");
				}

			} else {
				
				System.out.println("국어점수 : " + lan + "\n수학점수 : " + math + "\n영어점수 : " + eng);
				System.out.println("불합격입니다.");

			}
		}
		public void practice4() {
			Scanner sc = new Scanner(System.in);

			System.out.print("1~12 사이의 정수 입력 : ");
			int month = sc.nextInt();

			switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println(month + "월은 겨울입니다.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다.");
			}

		}
		public void practice5() {
			Scanner sc = new Scanner(System.in);

			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();

			if (id.equals("anima9125") && pw.equals("hiwinter99")) { // 문자열간의 동등비교는 ==불가능 .equals()로 가능
				System.out.println("로그인 성공");
			} else if (id.equals("anima9125")) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else if (pw.equals("hiwinter99")) {
				System.out.println("아이디가 틀렸습니다.");
			} else
				System.out.println("둘 다 틀렸습니다.");
		}
		
		public void practice6() {
			
		}
		public void practice8() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("피연산자1 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("피연산자2 입력 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("연산자를 입력(+, -, *, /, %");
			char ch = sc.nextLine().charAt(0);
			
			if(num1 > 0 && num2 > 0) {
				
				// 연산기호를 가지고 비교 -> 결과출력
				int result = 0; //연산 결과를 담기 위한 변수
				switch(ch) {
				case '+': result = num1 + num2; break;
				case '-': result = num1 - num2; break;
				case '*': result = num1 * num2; break;
				case '/': result = num1 / num2; break;
				case '%': result = num1 % num2; break;
				default: System.out.println("연산자를 잘못 입력하셨습니다."); return;
				}
				 
				//결과출력
				System.out.printf("%d %c %d = %d", num1, ch, num2, result);
				}else {
				System.out.println("양수가 아닌 값을 입력하셨습니다.");
			
			}
		}
		public void practice9() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			
			System.out.println("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: practice1(); break;
			case 2: practice2(); break;
			case 3: practice3(); break;
			case 4: practice4(); break;
			case 5: practice5(); break;
			case 6: practice6(); break;
			//case 7: practice7(); break;
			case 8: practice8(); break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

