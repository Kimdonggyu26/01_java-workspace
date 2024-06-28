package com.br.chap05_constructor.model.vo;


public class User {
	
	// 필드부
	// 멤버변수들 작성
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	// 생성자부

	public User() {
		// * 기본 생성자 (매개변수 없는 생성자)
		// 	 단지 객체 생성만을 목적으로 할 때 사용
		//   new User(); 하는 순간 실행되는 생성자 -> 객체 생성
		// 	 기본 생성자 작성을 생략했을 경우 => JVM이 자동으로 기본생성자를 만들어줌
		System.out.println("기본 생성자 실행됨");
	}
	
	// 매개변수 3개짜리 생성자
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// 매개변수 5개짜리 생성자
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		// 매개변수 3개짜리 생성자 호출
		this(userId, userPwd, userName); 
		/*
		 * 위와 같이 중복되는 동일한 구문을 실행시키는 생성자가
		 * 이미 존재할 경우 this(); 생성자 활용 가능
		 * => 같은 클래스 내에 또다른 생성자 호출
		 * ** 유의사항 : 반드시 첫줄에 작성해야됨!
		 */
		
		
		this.age = age;
		this.gender = gender;
	}
	
	
	// 메소드부
	// setter, getter, information 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "userId: " + userId + ", userPwd: " + userPwd
			+ ", userName: " + userName + ", age: " + age
			+ ", gender: " + gender;
	}

}

