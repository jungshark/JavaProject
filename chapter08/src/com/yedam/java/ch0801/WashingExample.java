package com.yedam.java.ch0801;

public class WashingExample {
	public static void main(String[] args) {
		
		// 이렇게 쓰지 않고
//		WashingMachine wm = new LGWashingMachine();
//		wm.startBtn();
//		System.out.println("세탁기 속도는 " + wm.changeSpeed(3));
//		wm.stopBtin();
	
		// 매개변수를 활용한 다형성
		// 아래 메소드를 활용해 이런 식으로 쓸 수 있음!
		washing(new LGWashingMachine());
		
		// 삼성 세탁기를 쓰고 싶다면? 
		// WashingMachine를 상속받은 SSWashingMachine라는 구현 클래스를 활용해
		// 새 객체를 만들지 않고 아래 메소드를 재사용해서 이런식으로 매개변수(?)만 바꿔 쓸 수 있음
		// 개발 코드를 수정하지 않으면서 객체 교환이 가능하다 (책 p370)
//		washing(new SSWashingMachine());
		
	}
	
	// 메소드
	// 매개변수의 다형성을 나타내보자
	public static void washing(WashingMachine wm) {
		wm.startBtn();
		System.out.println("세탁기 속도는 " + wm.changeSpeed(3));
		wm.stopBtin();
	}
	
}
