package com.yedam.java.ch0604;

public class SmartPhone {
	// 필드
	// 해당 클래스의 속성(정보)을 저장하는 구간
	String name; // 갤럭시 울트라21, 아이폰14
	String maker; // 삼성, 애플
	int price; // 130만원
	
	// 생성자
	
	
	// 메소드
	// 1) 전화를 거는 기능
	void call() {
		System.out.println(name + "전화를 겁니다.");
	}
	
	// 2) 전화를 끊는 기능
	void hangUp() {
		System.out.println(name + "전화를 끊습니다.");
	}
	
	
}
