package com.study.shop.view;

import java.util.List;
import java.util.Scanner;

import com.study.shop.controller.ShopController;
import com.study.shop.model.vo.Shop;

public class ShopView {
	
	private ShopController sh = new ShopController();
	private Scanner sc = new Scanner(System.in);
	
	public void searchmenu() {
		
		while(true) {
			
		
		System.out.println("===식당 검색 프로그램===");
		System.out.println("1. 맛집 등록");
		System.out.println("2. 등록된 맛집 전체조회");
		System.out.println("3. 특정 맛집 삭제");
		System.out.println("4. 특정 맛집 검색");
		System.out.println("5. 특정 카테고리로 맛집명 검색");
		System.out.println("6. 특정 맛집 갯수 검색");
		System.out.println("7. 프로그램 종료");
		
		System.out.print(">>메뉴 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1: inputShop(); break;
		case 2: searchAllShop(); break;
		case 3: deleteShop(); break;
		case 4:  break;
		case 5:  break;
		case 6:  break;
		case 7: System.out.println("프로그램을 종료합니다."); return;
		}
		
		
		}
	}
	
	public void inputShop() {
		
		System.out.print("식당 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("주소(동) : ");
		String address = sc.nextLine();
		
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		
		System.out.print("대표 메뉴 : ");
		String mainmenu = sc.nextLine();
		
		sh.inputShopInfo(name, address, category, mainmenu);
		
		System.out.println("추가 되었습니다.");
		
	}
	
	public void searchAllShop() {
		
		
		List<Shop> list = sh.searchShopName();
		
		if(list.isEmpty()) {
			System.out.println("등록된 정보가 없습니다.");
		} else {
			for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			}
		}	
	}
	
	public void deleteShop() {
		
		System.out.print("삭제할 식당의 이름 입력 : ");
		String name = sc.nextLine();
		
		int result = sh.deleteShopInfo(name);
		
		if(result > 0) {
			System.out.println(name + "의 정보가 삭제 되었습니다.");
		}else {
			System.out.println(name + "은(는) 등록 되어 있지 않습니다.");
		}
			
		
		
	}
	
	public void searchShop() {
		
		System.out.print("검색할 식당 이름 : ");
		String name = sc.nextLine();
		
		List<Shop> searchList = sh.searchShopInfo(name);
		
		System.out.println();
		
		
	}

}
