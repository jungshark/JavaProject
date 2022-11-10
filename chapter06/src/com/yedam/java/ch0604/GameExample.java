package com.yedam.java.ch0604;

public class GameExample {

	public static void main(String[] args) {
		
		// ctrl + space를 누르면 내가 쓸 수 있는 것들이 좌라락 뜸 (constructure라서 제일 앞에 c라고 뜨는 것 = 생성자를 의미)
		
		// 기본 생성자만 사용
		Game user1 = new Game(); // 매개변수가 없기 때문에 클래스의 기본 정보로 객체를 만들고
		user1.id = "예담이";  // 객체 생성 후, 필드를 하나하나 불러서 데이터를 직접 넣어줘야 함
//		user1.passWd = "1234"; // 안 넣어주면 null이라고 뜸
		
		// public Game(String id) 생성자 사용
		Game user2 = new Game("예담이2");// id라는 매개변수가 있어 그건 바로 ()에 넣어서 객체를 만들고,
		user2.passWd = "4321";  // 다른 정보는 객체 생성 후, 직접 필드를 불러 데이터 넣어줌(덮어씌우기)
		
		// public Game(String id, String passWd) 생성자 사용
		Game user3 = new Game("예담이3", "4567"); // id, passWd라는 매개변수를 통해 객체를 만들때부터 데이터를 넣어줌
		
		user1.getInfo();
		user2.getInfo();
		user3.getInfo();
		
		
		System.out.println("----------------------");
		
		// static(정적, 고정) 필드 사용
		// 클래스이름.정적 필드 적기
		System.out.println(Game.gameName); // 클래스에 static필드를 만들어두면, 객체 생성 없이 변수를 그냥 불러와서 쓸 수 있음
		// 왜 오류나냐.............
	}
}
