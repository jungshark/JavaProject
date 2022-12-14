package com.yedam.java.ch0601;

public class Car { // 이 {}안의 모든게 Car를 구성하게 됨
	// 하나의 파일은 하나의 클래스를 가진다
	
	// 필드 : 일종의 속성
	// 아무데나 선언 가능. 보통 제일 위에 선언하긴 함.
	// 필드 선언시 선언만 해도 관계없음. 값을 나중에 줘도 된다는 말.
	// 클래스는 실존하는 객체에 대한 모든 정보를 가지고 있진 않음. 내가 필요한 정보만 가져옴.
	// 자동차가 가지는 속성은 아주 많음! 최고속도와, 색상을 가져와보자
	int maxSpeed = 100;
	String color = "red";
	
	// 생성자
	// 생성자는 클래스와 이름이 같음!!!
	// 생성자는 리턴값을 적을 수 없고, 본인의 이름을 가질 수 없음(클래스 이름을 써야함)
	public Car() {
		System.out.println("자동차가 출하되었습니다.");
	}
	
	// 메소드 : 동작
	// 메소드는 본인의 이름(run)이 존재하고, 리턴되는 값이 존재함(void)
	public void run() {
		System.out.println("자동차가 동작 중입니다.");
	}
	
	
	
	// 실행 클래스와 라이브러리 클래스의 가장 큰 차이점
	// main의 유무 (main이 없으면 실행할수가 없음)
	// 라이브러리 클래스: main이 없음
	
	// 이 Car라는 클래스를 실행시키려면 다른 클래스를 하나 만들어야함
}
