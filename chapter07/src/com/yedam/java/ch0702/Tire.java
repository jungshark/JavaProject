package com.yedam.java.ch0702;

public class Tire {
	// 다형성 (Polymorphism 폴리모피즘)
	// 하나의 규격(클래스)으로 다양한 형태의 클래스를 만들 수 있음
	
	// 필드
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	// 타이어가 굴러가는 메소드
	public boolean roll() {
		++accRotation; // roll이 굴러갈 때 마다 타이어가 한 바퀴씩 회전한다는 뜻
		// 누적 회전수 < 최대 회전수 : 아직 수명이 남아있으니 더 회전
		if(accRotation < maxRotation) {
			System.out.println(location + "Tire 수명 " + (maxRotation - accRotation) + "회");
			return true;
		}else { // 수명이 다했으므로 그만 굴려!
			System.out.println("### " + location + " Tire 펑크 ###");
			return false;
		}
	}
	
	
	
}
