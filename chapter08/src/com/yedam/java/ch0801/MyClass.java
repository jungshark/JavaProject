package com.yedam.java.ch0801;

public class MyClass {

	//🍋 필드
	// 1)
	// public int a = 1; 이런것처럼
	RemoteControl rc = new Television(); // 참조타입(rc)을 넣어준 것
	
	
	//🍋 생성자
	public MyClass() {
		
	}
	
	// 생성자 오버로딩(같은 이름이지만 매개변수를 달리 해 생성)
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	// 인터페이스가 아니라 다른 클래스로 만들어진걸 불러온다면, 해당 클래스에 가서 turnOn이 어떻게 적혀있는지도 알아봐야 함
	// (혹시 turnon이라고 소문자로 적힌게 아닌지.. 어떤 메소드 이름으로 만들었는지 확인하고, 기능도 확인하고..)
	
	
	//🍋 메소드
	// 메소드 호출. 거기에 내가 정의해 둔 구현 클래스를 사용해 실행
	void methodA() {
		// 위 필드에서 rc를 정의했는데, 다른 구현 클래스를 사용해 또 구현 가능
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodC() {
		// 위 필드에서 rc를 정의했는데, 다른 구현 클래스를 사용해 또 구현 가능
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
	}
	
	// 매개변수
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
