package com.yedam.java.ch0802;

public class Car {
	// 필드의 다형성 이용해보기 (책 p387)
	
	Tire frontLeftTire = new NexonTire();
	Tire frontRightTire = new NexonTire();
	Tire backLeftTire = new NexonTire();
	Tire backRightTire = new NexonTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}
