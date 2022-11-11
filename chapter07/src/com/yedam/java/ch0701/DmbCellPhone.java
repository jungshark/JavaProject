package com.yedam.java.ch0701;

public class DmbCellPhone extends CellPhone {
	
	// 필드
	public int channel;
	
	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		// super(); 가 생략되어 있음. 걍 알아서 부모클래스 만들어 준 것
		// 자식 클래스로 객체를 만들 땐
		// 부모 클래스에 기본 생성자가 아니라 생성자가 정의되어 있다면, 자식 클래스에서 직접 부모 클래스 생성자를 만들어 줘야 함
		// ex) 부모 클래스에
		// public Cellphone(String model){
		// this.model
		// } 이라는 생성자가 있다면, 자식 클래스에는 super(model); 을 꼭 써 줘야 함
		// 부모 클래스 필드
		this.model = model; // DmbCellPhone 필드에 없는 두개..! 어떻게 쓸 수 있는 걸까?
		this.color = color; // 부모 클래스에 있는 필드를 상속받아 쓰고 있는 것!
		
		// 자식 클래스 필드
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
}
