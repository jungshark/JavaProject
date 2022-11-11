package com.yedam.java.ch0702;

public class Car {
	
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6); // 앞의 왼쪽에 있는 6번 구를 수 있는 타이어
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	// car라는 객체를 만들면 이렇게 타이어 4개를 가진 객체가 만들어지는 것
	
	// 생성자
	
	
	// 메소드
	// 자동차가 달리는 기능
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) { // 바퀴를 굴려 수명 체크. 수명이 다 되어 타이어가 펑크난다면(false가 되면) stop!
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0; // 다 아니라면 0이라고 return해줌
	}
	
	// 멈추는 stop 메소드
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
}
