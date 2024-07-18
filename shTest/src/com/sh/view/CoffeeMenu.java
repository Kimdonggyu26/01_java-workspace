package com.sh.view;

import java.util.List;
import java.util.Scanner;

import com.sh.controller.CoffeeManager;
import com.sh.model.vo.Bread;
import com.sh.model.vo.Coffee;
import com.sh.model.vo.CoffeeShop;

public class CoffeeMenu {
	Scanner scan = new Scanner(System.in);
	CoffeeManager cm= new CoffeeManager();
	
	
	
	
	public void mainMenu() {
		while(true) {
			
			System.out.println("\n=== 로그인 ===");
			System.out.println("아이디 : ");
			String userId =scan.nextLine();
			System.out.println("비밀번호 : ");
			String userpwd = scan.nextLine();
			int log =cm.checkingAdmin(userId, userpwd);
		
		
		if(log == 1) {
			while(true) {
			System.out.println("\n=== 관리자 메뉴 ===");
			System.out.println("0. 가게 전체 조회");
			System.out.println("1. 가게 관리 ");
			System.out.println("2. 커피 메뉴 관리");
			System.out.println("3. 빵 메뉴 관리");
			System.out.println("4. 프로그램종료");
			System.out.println("입력 : ");
			int num = scan.nextInt();
			switch(num) {
			case 0: selectAll();break; 
			case 1: storeManagement();break; 
			case 2: managingCoffeeMenu(); break;
			case 3: breadMenuManagement(); break;
			case 4: System.out.println("프로그램 종료");return;
			default : System.out.println("값을 다시 입력해주세요.");
			}
			
			}
		}else if(log == -1){
			System.out.println("관리자 로그인 실패하여 유저 화면으로 이동합니다.");
			System.out.println();
			
			System.out.println("이름 : ");
			String userName = scan.nextLine();
			System.out.println("잔액을 입력하세요 : ");
			int money = scan.nextInt();
			cm.checkingUser(userName,money);
			while(true) {
			
			System.out.println("\n"+userName+"님 환영합니다.");
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 전체 메뉴 조회");
			System.out.println("2. 메뉴 검색 ");
			System.out.println("3. 장바구니 ");
			System.out.println("4. 주문 하기 ");
			System.out.println("0. 프로그램종료 ");
			System.out.println("입력 : ");
			int num = scan.nextInt();
			
			
			}
		}
		
		}
	}

	public void storeManagement() {
		System.out.println("\n=== 가게 관리 ===");
        System.out.println("1. 가게명 변경 ");
		System.out.println("2. 가게주소 변경 ");
		
		System.out.println("입력 : ");
		int num =scan.nextInt();
		scan.nextLine();
		
	}
	public void managingCoffeeMenu() {
		while(true) {
		System.out.println("== 커피 수정 ==");
		System.out.println("--------------------------");
		System.out.println("== 커피 메뉴 ==");
		
		
		System.out.println("1. 커피 메뉴 삭제 ");
		System.out.println("2. 커피 메뉴 추가 ");
		System.out.println("3. 뒤로가기");
		int num = scan.nextInt();
		
		


				
		}
		
		
	}
	public void breadMenuManagement() {
		while(true) {
		System.out.println("== 빵 수정 ==");
		System.out.println("--------------------------");
		System.out.println("== 커피 메뉴 ==");
		System.out.println("1. 빵 메뉴 삭제 ");
		System.out.println("2. 빵 메뉴 추가 ");
		System.out.println("3. 뒤로가기");
		int num = scan.nextInt();
		
		
		
		}
		
	}
	
	public void selectAll() {
		
		cm.selectAll();
		
		
	}
	public void searchCafe() {
		System.out.println("=== 검색 ===");
		System.out.println("1. 빵 검색 ");
		System.out.println("2. 커피 검색");
		int num = scan.nextInt(); 
		
		
		
	}
	public void myBasket() {
		
	}
	public void oredrCafe() {
	
		
		
	}
	
	
	
}
