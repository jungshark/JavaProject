package com.yedam.java.ch0801;

public class MyClassExample {
	public static void main(String[] args) {
		// 책 p380 상단 네모박스대로 실행해 볼 것(1~4)
		
		// 1) MyClass에 필드로 정의해 둔 것 사용
		System.out.println("1) ------------");
//		 rc가 뭔데..? -> MyClass에 있는 RemoteControl rc = new Television();
		MyClass mc = new MyClass();
		mc.rc.turnOn(); //mc라는 객체 안에 있는.rc를 찾고.rc안에 있는 turnOn이라는걸 찾는것
		mc.rc.turnOff();
		
		
		// 2) 오버로딩을 사용해 new Audio라는 매개변수 줌. 매개변수에 따라 다른 애가 호출돼 실행됨
		System.out.println("2) ------------");
//		RemoteControl rc = new Audio();
		MyClass mc2 = new MyClass(new Audio());
		// 생성자를 사용해 불러오기
		// 1. rc가 오디오 타입으로 변경될 것
		// 2. 생성자 안에 정의해 둔 아래의 두 가지 기능이 실행될 것
		// rc.turnOn();
		// rc.turnOff();
		
		
		// 3) 메소드로 실행
		System.out.println("3) ------------");
//		RemoteControl rc = new Audio();
		MyClass mc3 = new MyClass();
		mc3.methodA();
		// methodA 안에 정의된 대로
		// 1. rc가 Audio로 변경될 것
		// 2. rc안의 두 기능이 실행될 것
		// rc.turnOn();
		// rc.turnOff();
		
		
		// 4) 메소드를 호출할 때 매개변수를 new Television()이라고 넣어줌.
		// 메소드B에 있는 매개변수(RemoteControl rc)에서 rc = Television으로 만든게 됨
		System.out.println("3) ------------");
//		RemoteControl rc = new Television();
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
		// rc.turnOn();
		// rc.turnOff();
		
		
	}
}
