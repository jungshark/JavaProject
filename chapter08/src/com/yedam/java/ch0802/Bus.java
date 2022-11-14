package com.yedam.java.ch0802;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	
	// Bus 클래스가 자체적으로 만든 메소드 (Vehicle의 메소드 오버라이딩이 아님!)
	public void checkFare() {
		System.out.println("승차요금을 확인합니다");
	}

}
