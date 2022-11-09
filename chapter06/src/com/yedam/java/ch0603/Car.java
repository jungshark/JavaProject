package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
//	this.company = company;
			// 인스턴스가 호출하는게 생성자와 메소드이기 때문에 이렇게 this를 적으면 오류남!!
	
	//✨ 생성자
//	// 괄호()안에 매개변수로 무언가를 선언 가능
//	// 필요하다면 model, color 값을 받아와 기존의 값에 덮어쓸게~
//	public Car(String model, String color) { 
//		this.model = model;
//		// 필드 이름이 model인데, 매개변수로 넘어오는 값도 model임. this를 사용해 구분해줌
//		// this는 이 클래스로 생성되는 '인스턴스'를 가리킴 (클래스를 가리키는게 아님!)(인스턴스를 생성하려면 생성자를 불러와야하니께)
//		this.color = color;
//	}
	
	// 생성자 추가
	// 해당 클래스에 생성자가 있는데, 기본 생성자도 만들어주고 싶다면 하나 더 추가해주면 됨
	public Car() {}
	
	
	//✨ 생성자 오버로딩
	// 근데 이렇게 하면 중복된 코드가 너무 많이 생성됨..ㅎ this.변수이름 = 변수이름;
	// this를 활용해 생성자끼리도 호출이 가능함!
	public Car(String model) {
//		this.model = model;
		// 필요하다면 생성자 내부에서 다른 생성자를 호출하는게 가능!
		this(model, "은색", 250);
	}
	
	public Car(String model, String color) { 
//		this.model = model;
//		this.color = color;
		
//		this.company = "쉐보레"; 
		// this로 생성자를 호출해오는 경우 필요한 전제조건: 호출하고 반환받기 전까지는 인스턴스가 생성되지 않음.
		// this를 호출하기 전, 어떠한 명령어라도 존재한다면 그 다음 this는 사용할 수 없음!
		// this를 사용한다면 반드시 첫 줄에 있어야 함!! 생성자는 초기값을 주는건데 초기값 없이(인스턴스가 없다는 말) 인스턴스 실행을 어떻게 함..?
		this(model, color, 250); // 이 줄이 실행되어야 인스턴스가 만들어지는것!
		
		
		//✨ this는 어떻게 사용하느냐에 따라 완전 달라짐
		// this() -> 생성자
		// this.이름() -> 메소드
		// this.이름 = ; -> 실행문
	}
	
	public Car(String model, String color, int maxSpeed) { 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

}
