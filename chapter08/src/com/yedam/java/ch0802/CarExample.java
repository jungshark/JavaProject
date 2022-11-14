package com.yedam.java.ch0802;

public class CarExample {
	public static void main(String[] args) {
		// 필드의 다형성
		// 한 객체에 어떤 구현 클래스를 넣느냐에 따라 사용되는 기능이 달라짐
		
		Car myCar = new Car(); // 객체 생성
		
		myCar.run(); // 넥센 타이어가 Car에 적힌 구현 클래스이기 때문에 넥센 타이어에 재정의된 내용이 출력됨
		
		System.out.println("==================");
		
		myCar.frontLeftTire = new MichelinTire();
		myCar.frontRightTire = new MichelinTire();
		
		myCar.run();
		
		
		
		
	}
}
