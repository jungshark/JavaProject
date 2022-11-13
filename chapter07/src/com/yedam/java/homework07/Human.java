package com.yedam.java.homework07;

public class Human {

	// 필드
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	
	
	// 생성자
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	// 메소드
	// 1) 이름, 키, 몸무게를 출력하는 기능
	public void getInformation() {
		System.out.println("이름: " + name + "\t키: " + height + "\t몸무게: " + weight);
	}
	
}
