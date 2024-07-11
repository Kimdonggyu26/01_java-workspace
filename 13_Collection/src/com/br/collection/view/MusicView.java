package com.br.collection.view;

import java.util.List;
import java.util.Scanner;

import com.br.collection.controller.MusicController;
import com.br.collection.model.vo.Music;

public class MusicView {
	
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	// 각 화면별 메소드
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n=== 음악관리프로그램 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 가수명을 통해서 곡명 찾기");
			System.out.println("7. 곡 갯수 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(" >> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: inputMusic(); break;
			case 2: selectMusic(); break;
			case 3: removeMusic(); break;
			case 4: searchMusic(); break;
			case 5: modifyMusic(); break;
			case 6: searchMusicTitle(); break;
			case 7: searchMusicNumber(); break;
			case 0: System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다."); return;
			default: System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
			
		}
	}
	
	public void inputMusic() {
		
		System.out.print("\n== 신규 곡 추가 화면 ===");
		
		System.out.print("\n곡명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수입력 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title, artist);
		
		System.out.println("성공적으로 추가되었습니다.");
		
	}
	
	public void selectMusic() {
		
		System.out.println("\n=== 전체 곡 리스트 ===");
		
		List<Music> list = mc.selectMusicList();
		
		if(list.isEmpty()) {
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else {
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i));
		}

		}
	}
	
	public void removeMusic() {
		System.out.println("\n=== 특정 곡 삭제 화면===");
		
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else		{
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
	}
	
	// 특정곡을 찾아 수정하는 서브화면
	public void modifyMusic() {
		
		System.out.println("\n=== 특정 곡 수정 화면 ===");
		
		System.out.print("수정하고자하는 곡명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 내용(곡명) : ");
		String upTitle = sc.nextLine();
		
		System.out.print("수정 내용(가수명) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("성공적으로 수정되었습니다.");
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
		
	}
	
	public void searchMusic() {
		
		System.out.println("\n=== 특정 곡 검색 화면 ===");
		
		System.out.print("검색할 곡명(키워드) : ");
		String keyword = sc.nextLine();
		
		List<Music> searchList = mc.selectMusicByKeyword(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색된 결과가 없습니다.");
		}else {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		
		
	}
	
	public void searchMusicTitle() {
		
		System.out.println("\n=== 가수명을 통해 곡명 찾기 ===");
		
		System.out.print("검색할 곡의 가수명 : ");
		String artist = sc.nextLine();
		
		List<String> result = mc.searchSinger(artist);
		
			if(result.isEmpty()) {
				System.out.println("검색 결과가 없습니다.");
			}else {
				for(int i = 0; i < result.size(); i++) {
					System.out.println(result);
				}
			}
		
		
		
	}
	
	public void searchMusicNumber() {
		
		System.out.println("\n=== 곡명 포함된 갯수 검색===");
		
		System.out.print("검색할 곡명(키워드): ");
		String title = sc.nextLine();
		
		int result = mc.searchTitleNumber(title);
		
		if(result > 0) {
			System.out.println(title + "을(를) 포함한 곡의 갯수는 " + result + "개입니다.");
		}else {
			System.out.println("검색결과가 없습니다.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	

}
