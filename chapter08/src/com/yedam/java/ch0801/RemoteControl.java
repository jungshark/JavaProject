package com.yedam.java.ch0801;

public interface RemoteControl {
	
	// 인터페이스는 선언할 수 있는게 딱 두가지!
	// 자기 자신을 객체로 바로 만들 수 없기 때문에 생성자는 없음
	
	//🍋 상수
	// public static final PI = 3.14;
	
	//🍋 추상메소드
	// public void method1();
	
	// 기본 설계도 라고 부름
	// ex) 대규모 프로젝트: 번역
	// A: 영어 -> 한국어 (메소드 이름: 번역)
	// B: 영어 -> 일본어 (메소드 이름: method1())
	// C: 영어 -> 중국어 (메소드 이름: method2())
	// 같은 번역이라는 프로젝트를 하는데 메소드 이름이 다 다르다..
	// 인터페이스를 사용하면 같은 이름이지만 내용은 다 다르게 할 수 있음
	// 기능 구현을 다르게 할 수 있음
	// 프로젝트 완료 후
	// 똑같은 메소드 이름으로 구현한다면 프로그램에 문제가 생길 시 바로바로 찾을 수 있음
	
	//✨ 상수 필드
	// public static final int MAX_VOLUME = 10;
	// 인터페이스에서는 int만 써도 static final의 성격을 가짐(생략 가능하다는 말)
	public int MAX_VOLUME = 10; // 대문자: static final일때 씀.
	public int MIN_VOLUME = 0;
	
	
	//✨ 추상 메소드
	// 어떤 설계도를 미리 정의해놓고, 다른 상속받은 애들이 이걸 가지고 구현 가능하도록 하는것!
	// 그래서 기본 설계도라고 부름
	// 이 인터페이스를 상속받으면 아래 3가지 메소드는 무조건 구현해야함(오버라이딩)
	// public abstract void turnOn();
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 구현객체
	// 인터페이스를 상속받는 클래스: 구현클래스
	
}
