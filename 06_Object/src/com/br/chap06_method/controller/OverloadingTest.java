package com.br.chap06_method.controller;

public class OverloadingTest {
	
	/*
	 *  < 오버로딩 >
	 *  주석 복붙해야함
	 */
	
	public void test() {
		
	}
	
	/*                             오버로딩이아님 (중복 되었다는 오류남)
	public void test() {
		
	}
	*/
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/*
	public void test(int c, int d) {
		
	}
	*/
	
	// 매개변수명이랑은 상관없이
	// 매개변수의 자료형, 갯수, 순서가 다르게 작성이 되어있어야함
	
	/*
	public int test(int c, int d) {
		return 0;
	}
	*/ 
	// 반환형과도 상관 없음 -> 무조건 매개변수가 달라야함
	
	/*
	private void test(int c, int d) {
		
	}
	*/
	// 접근 제한자와도 상관 없음 -> 무조건 매개변수가 달라야함
}
