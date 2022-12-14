package com.yedam.java.ch0802;

public interface Vehicle {

	public void run();
	
	
	//🍋 자동 타입 변환
	// 조건 - implements를 받아야만 사용 가능
	// 인터페이스 구현 객체 = new 구현클래스();
	// 인터페이스에 정의해 놓은 추상 메소드를 재정의한 구현 클래스의 내용만 쓰겠다
	// = 구현 클래스 내부에 인터페이스 메소드를 오버라이딩 한 내용만 쓰겠다
	// = 구현 클래스 내부에 인터페이스 오버라이딩 된 내용 말고는 쓸 수 X (구현 클래스가 자체적으로 만든 메소드들은 쓸 수 X)
	
	// 어떻게 하면 구현 클래스가 자체적으로 정의한 메소드를 쓸 수 있을까?
	//🍋 강제 타입 변환으로 가능!
	
}
