package com.hw2.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.hw2.controller.LibraryManager;
import com.hw2.model.vo.Book;
import com.hw2.model.vo.Member;

public class LibraryMenu {
	
	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);

	
	public void mainMenu() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(m/f) : ");
		char gender = sc.nextLine().charAt(0);
		
		lm.insertMember(name, age, gender);
		
		
		while(true) {
			System.out.println("\n1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: myPage(); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			}
			
		}
		
	} // mainMenu end
	
	
	public void myPage() {
		
		Member me = lm.getMem();
		
		System.out.println(me);
		
		System.out.print("\n수정하시겠습니까? (y/n) : ");
		String yn = sc.nextLine();
		
		if(yn.equalsIgnoreCase("y")) {
			System.out.print("수정 할 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("수정 할 나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("수정 할 성별 : ");
			char gender = sc.nextLine().charAt(0);
			
			lm.updateMember(name, age, gender);
			
		}
		
	
	} // myPage end
	
	
	public void selectAll() {
		
		ArrayList<Book> bList = lm.selectAll();
		
		for(int i = 0; i < bList.size(); i++) {
			System.out.println(i + "번도서 : " + bList.get(i));
		}
		
	} // selectAll end
	
	public void searchBook() {
		
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = lm.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(Book b : searchList) {
				System.out.println(b);
			}
		}
		
	} // searchBook end
	
	public void rentBook() {
		
		ArrayList<Book> list = lm.selectAll();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.print("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int result = lm.rentBook(num);
			
		switch(result) {
		case 0: System.out.println("성공적으로 대여되었습니다."); break;
		case 1: System.out.println("나이 제한으로 대여 불가능입니다."); break;
		case 2: System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요."); break;
			
		}
		
		
		
	} // rentBook end
	
}
