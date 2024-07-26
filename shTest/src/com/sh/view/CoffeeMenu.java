package com.sh.view;

import java.util.List;
import java.util.Scanner;

import com.sh.controller.CoffeeManager;
import com.sh.model.vo.CoffeeShop;
import com.sh.model.vo.UserName;

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
			
			switch(num) {
			case 1: System.out.println(cm.coffeeInquiry());
					System.out.println(cm.breadInquiry());
					break;
					
			case 2: searchCafe();
					break;
					
			case 3: myBasket();
					break;
			case 4: orderCafe();
					break;
			case 0: return;
			}
			
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
		
		if(num == 1) {
			System.out.println("변경할 가게명 입력 : ");
			String chName = scan.nextLine();
			cm.management(num, chName);
		} else if(num == 2) {
			System.out.println("변경할 가게 주소 입력 : ");
			String chName = scan.nextLine();
			cm.management(num, chName);
		}
		
		
		
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
		
		switch(num){
		case 1: System.out.println("삭제할 메뉴 번호 입력 : ");
		        int index = scan.nextInt();
		        scan.nextLine();
		        cm.deleteCoffee(index);
		        break;
		        
		case 2: System.out.println("추가할 커피 메뉴 이름 : ");
		        String cName = scan.nextLine();
		        
		        System.out.println("추가할 커피 메뉴 가격  : ");
		        int price = scan.nextInt();
		        scan.nextLine();
		        
		        System.out.println("추가할 커피 메뉴 갯수 입력 : ");
		        int count = scan.nextInt();
		        scan.nextLine();
		        
		        cm.insertCoffee(cName, price, count);
		        break;
		        
		case 3: return;
		}


				
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
		
		switch(num) {
		case 1: System.out.println("삭제할 빵 메뉴 번호 입력 : ");
				int index = scan.nextInt();
				scan.nextLine();
				cm.deleteBread(index);
				break;
						
		case 2: System.out.println("추가할 빵 메뉴 이름 입력 : ");
				String bName = scan.nextLine();
				
				System.out.println("추가할 빵 메뉴 가격 입력 : ");
				int price = scan.nextInt();
				scan.nextLine();
				
				System.out.println("추가할 빵 갯수 입력 : ");
				int count = scan.nextInt();
				scan.nextLine();
				cm.insertBread(bName, price, count);
				break;
		case 3: return;
		}
		
		}
		
	}
	
	public void selectAll() {
		
		CoffeeShop cs = cm.selectAll();
		
		System.out.println(cs);
		
		
	}
	public void searchCafe() {
		System.out.println("=== 검색 ===");
		System.out.println("1. 빵 검색 ");
		System.out.println("2. 커피 검색");
		int num = scan.nextInt(); 
		scan.nextLine();
		
		System.out.println("검색할 메뉴 검색(키워드 가능) : ");
		String keyword = scan.nextLine();
		
		List<Object> searchKeywordBread = cm.searchCafe(num, keyword);
		
		System.out.println(searchKeywordBread);
		
		
		
	
		
		
	}
	public void myBasket() {
		
		List <Object> baske = cm.myBasketcheck();
		
		System.out.println(baske);
		
		System.out.println("구매하시겠습니까? (y/n) : ");
		String yn = scan.nextLine();
		
		int sum = cm.lastCheck();
		
		if (yn.equals('y')) {
			if(  < sum) {
				
			}
		}
		
		
		
		
		
	}
	public void orderCafe() {
	
		
		System.out.println("=== 검색 ===");
		System.out.println("1. 빵 검색 ");
		System.out.println("2. 커피 검색");
		int num = scan.nextInt(); 
		scan.nextLine();
		
		System.out.println("주문할 메뉴 번호 입력 : ");
		int index = scan.nextInt();
		
		cm.order(num, index);
		
		
		
		
	}
	
	
	
}
