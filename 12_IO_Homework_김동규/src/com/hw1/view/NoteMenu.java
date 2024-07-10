package com.hw1.view;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class NoteMenu {
	
	Scanner sc = new Scanner(System.in);
	FileDao fdao = new FileDao();
	
	
	public void mainMenu() {
		
		while(true) {
		System.out.println("=====MyNote=====");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("4. 끝내기");
		System.out.print("번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1: createNote(); break;
		case 2: openNote(); break;
		case 3: editNote(); break;
		case 4: break;
		
		}
			
		}
		
		
	} // mainMenu end
	
	public void createNote() {
		
		System.out.print("파일에 저장할 내용을 입력하시오 (exit을 입력하면 내용입력 끝) : ");
		
		String str1 = "";
		
		while(true) {
			String result = sc.nextLine();
			
			if(result.equalsIgnoreCase("exit")){
				System.out.println("저장하시겠습니까? (y/n) : ");
				String yn = sc.nextLine();
				
					if(yn.equalsIgnoreCase("y")) {
						System.out.println("저장시킬 파일명 입력(확장자 제외): ");
						String fName = sc.nextLine();
						
							fdao.fileSave(result, fName);
							
							System.out.println("\n" + fName + ".txt 파일에 성공적으로 저장하였습니다.\n");
							break;
					}else {
						System.out.println("다시 메뉴로 돌아갑니다.\n");
						break;
					}
			}else {
				str1 += result;
				StringBuilder sb = new StringBuilder(str1);
				sb.toString();
			}
			
		}
		System.out.println(str1);
	} // createNote end
	
	public void openNote() {
		
		System.out.print("파일명을 입력하세요(확장자 제외) : ");
		String name = sc.nextLine();
		
		fdao.fileOpen(name);
		
		
		
	} // openNote end

	public void editNote() {
		
	} // editNote end
}
