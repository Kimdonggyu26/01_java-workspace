package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	public void method8() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) {
				int[] arr = new int[num];
				int value = 1;
				for (int i = 0; i < arr.length; i++) {
					arr[i] = value;
					if (i < arr.length / 2) {
						value++;
					} else {
						value--;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");

					} else {
						System.out.print(arr[i]);
					}
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}

	}

	public void method9() {
		Scanner sc = new Scanner(System.in);

		String[] chickens = { "후라이드", "양념", "파닭", "스노윙" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		int result = 0;
		for (int i = 0; i < chickens.length; i++) {
			if (chickens[i].equals(menu)) {
				result = 1;
			}
		}
		if (result == 0) {
			System.out.println("없는 메뉴입니다.");
		} else {
			System.out.println(menu + "치킨 배달 가능합니다.");
		}

	}

}
