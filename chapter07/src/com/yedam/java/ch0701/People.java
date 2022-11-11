package com.yedam.java.ch0701;

// public class People extends Student {} 하면 오류가 남. Student는 final 클래스라 상속받을 수 없음
public class People extends Student{ // Student 클래스에서 final을 해제하면 상속 가능
	// 사람의 정보를 넣을 수 있는 부모 클래스
	
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	// 부모클래스인 Student에 있는 getScore()는 final을 해줬기때문에 오버라이딩 할 수 없음
	// setScore()는 final이 없기 때문에 오버라이딩 가능!
	@Override
	public void setScore() {
		super.setScore();
	}
	
	
}
