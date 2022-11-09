package com.yedam.java.ch0604;

public class CarExample {

	public static void main(String[] args) {
		// Car 클래스에 있는 메소드 사용해보기
		Car myCar = new Car();
		
		myCar.setGas(5);
		
//		boolean gasState = myCar.isLeftGas(); // 현재 남은 가스 잔량 확인하는 메소드 불러오기
//		// boolean타입이라 바로 if문 사용 가능
//		if(gasState) { // true면 가스가 남아있다는 뜻!
//			System.out.println("출발합니다.");
//			myCar.run();
//		}
		
		// 위 코드를 한 줄로 만들어보자
		// Car 클래스의 45~52라인을 호출해 온 것(?)
		myCar.run();
		
		// 내부에 있는 메소드를
		

	}

}
