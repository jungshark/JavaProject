package com.yedam.java.ch0605;

public class Singleton {
	// 싱글톤 (책 p279)
	// 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
	// 싱글톤은 자바에서만 쓰이는 개념이 아님!
	// 다른 프로그램에서는 싱글톤이 아니라 '디자인 패턴'이라고 함
	
	//🍋 싱글톤의 구문
	//🍋 싱글톤 만드는 두 가지 방법
	// 1. 싱글톤이 쓰려고 불러지든 말든 일단 프로그램 시작하면 싱글톤을 만들어서 static 메모리에 올림
	
	// 1) 단 하나뿐인 싱글톤 객체 만들기: 아무도 접근하지 못하는, static인 싱글톤 타입의 객체(이름은 singleton)
	private static Singleton singleton = new Singleton(); 
	// Singleton도 클래스 타입이라고 말 할 수 있음
	
	private Singleton() { // 2) private 사용한 생성자: 밖에서 Singleton()를 사용해 객체를 못 만들게끔 막음
		
	}
	
	// 3) 다른데서 사용 가능한 다른 메소드를 만들어, 그 안에 singleton을 반환해 씀
	public static Singleton getInstance() { // static을 사용하면 getInstance()를 어디서든 사용 가능
		return singleton; // 위에서 만든 singleton 객체를 이 메소드를 통해 쓰겠다.
	}
		// 외부에서 getInstance()를 부르면
		// 우리 눈에는 singleton 이게 반환되는 것 처럼 보이지만
		// 실제로는 new Singleton(); 이 반환되는거임. 같은 주소를 받아옴!

	// 싱글톤 사용방법
	// 단 하나의 객체를 만든 후, 자주 쓰는 필드, 메소드를
	// (내가 자주 쓰는 기능을) 싱글톤에 넣어서 사용하면 됨
	public void run() {
		System.out.println("싱글톤이 작동중입니다.");
	}
	public void connectDB() {
		System.out.println("데이터베이스를 연결합니다.");
	}
		
	
	// 2. 내가 필요할때만 싱글톤 만들기 (이건 거의 안 씀~)
	// 1) null을 사용해 일단 객체를 만들지 않음 -> 그럼 메모리에 올라갈 필요가 없음. 싱글톤을 부르게 되면 그때 객체 만들게~
//	private static Singleton singleton = null;
//	private Singleton() {
//		
//	}
//	
		// 메소드
//	public static Singleton getInstance(){ // getInstance()를 불렀을 때
//		if (singleton == null){  // 싱글톤이 없다면
//			return singleton = new Singleton(); // 싱글톤을 만들고
//		} else { // 이미 만들어진 싱글톤 객체가 있다면
//			return singleton; // 걔를 리턴.
//		}
	
	
		
	// Application 클래스에서 사용해봄!
		
}
