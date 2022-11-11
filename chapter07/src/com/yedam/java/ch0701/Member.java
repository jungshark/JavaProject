package com.yedam.java.ch0701;

public class Member extends People{

	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) {
		super(name, ssn); // super: 부모 클래스의 생성자를 부르는 명령어(?)
		this.stdNo = stdNo;
		
	}

}
