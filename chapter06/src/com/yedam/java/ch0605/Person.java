package com.yedam.java.ch0605;

public class Person {
	// 한국 국적을 가진 사람에 대한 정보를 저장하는 클래스

	// 필드
	// final 사용해보기
	final String nation = "korea"; // final을 사용하면 이 클래스를 활용해 만드는 객체들은 무조건 국적이 한국으로 고정됨
	final String ssn; // 주민등록번호 // 1. 이건 뒤에 데이터가 없는데 어떻게 final로 고정됨..?
	String name; // 이름은 개명 가능하니까 final 안 붙임 ㅋㅋㅋ
	
	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn; // 2. 인스턴스(객체)를 만들면서 최초로 Person의 ssn에 넣은 생성자(데이터...?)가 고정됨!
		this.name = name; 
	}
	
}
