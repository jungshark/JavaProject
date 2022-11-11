package com.yedam.java.ch0702;

public class Application2 {
	public static void main(String[] args) {
		
		HankookTire hTire = new HankookTire("right", 10);
		KumhoTire kTire = new KumhoTire("left", 20);
		
		// Tire 객체(tire)에 자식 객체인 hTire가 들어가게 됨
		// tire = 한국 타이어를 사용하고 있다고 볼 수 있음
		Tire tire = hTire; // tire는 Tire의 내용을 쓰되, HankookTire가 오버라이딩 한 내용이 있다면 그건 Hankook꺼를 가져와 쓸 것
		System.out.println(tire.roll()); // 자동 타입 변환에 의해 자식 클래스 내용이 실행되므로, 한국타이어의 메소드가 실행될 것
		
		tire = kTire; // 부모격인 tire에 자식인 kTire를 갈아끼움
		System.out.println(tire.roll()); 
		
		tire = hTire;
		System.out.println(tire.roll());
		
		// 하나의 타입(부모타입 Tire)으로 다양한 결과(Tire(부모)를 기반으로 만들어진 tire 한 객체에 hTire, kTire등 다양한 자식 기반 객체들을 넣어 자동 타입 변환에 의해 오버로딩된 자식들의 내용을 가져옴)를 내고 있음
		// 하나의 타입으로 여러가지 모양을 만들 수 있음
		// 다형성!!
		
	}
}
