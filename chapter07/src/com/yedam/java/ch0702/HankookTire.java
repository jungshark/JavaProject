package com.yedam.java.ch0702;

public class HankookTire extends Tire{// 타이어 기본 규격을 정의해 놓은 Tire클래스를 부모로 삼자
	// 타이어가 펑크나면 갈아끼울 수 있는 타이어 클래스 만들기
	// Tire 클래스는 기본 생성자가 아닌 매개변수를 가진 생성자가 있음 -> super로 걔를 불러와 초기화해줘야 됨
	public HankookTire(String location, int maxRoration) {
		super(location, maxRoration);
		
	} 

	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 " + (maxRotation - accRotation) + "회");
			return true;
		}else {
			System.out.println("### " + location + " HankookTire 펑크 ###");
			return false;
		}
	}
	
	
	
	
}
