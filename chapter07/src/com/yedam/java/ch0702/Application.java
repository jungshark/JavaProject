package com.yedam.java.ch0702;

public class Application {
	public static void main(String[] args) {
		
		// 새 자동차 만들기
		Car car = new Car(); // 타이어도 붙어있고, 달리기도 가능한 자동차
		
		// 자동차를 5번 굴려보자
		for(int i=1; i<=5; i++) {
			int problemTire = car.run(); // run메소드의 return에 의해 problemTire에 들어오는 숫자에 따라, 어느 위치의 타이어가 펑크났는지 알 수 있음.
										 // 문제가 있다면 return으로 숫자를 반환해줄 것!
			
			switch (problemTire) {
			case 0:
				System.out.println("타이어 4개가 모두 멀쩡합니다.");
				break;
			case 1:
				System.out.println("왼쪽 앞 HankookTire로 교체");
				// frontLeftTire의 타입 -> Tire
				// frontLeftTire 펑크남
				// 타이어 교체 필요
				// 자식 클래스인 HankookTire로 교체하고 싶음
				// 부모 클래스 내용이 아니라 자식 클래스에서 오버라이딩 한 내용으로 바꿔 끼우게 됨. (자동 타입 변환으로 인해 가능한 일)
				// Tire 규격에 맞는 타이어가 필요. 한국타이어는 규격에 맞게 해놨음
				// (Tire 타입의 규격에 맞게 만들긴 했지만 어디서 만드느냐에 따라(타입?) 각 회사 타이어의 성능은 다르게 나올 것)
				// HankookTire tire = new HankookTire("앞왼쪽", 15); // 자식 클래스 객체를 만들어서
				// car.frontLeftTire = tire; // 그 객체를 부모 클래스에 넣어준 것!
				// 그러면 자동 타입 변환이 발생해 front~에 있는(부모타입) 메소드가 실행되는 게 아니라 Hankook(자식타입)에 있는 오버라이딩 된 메소드가 실행됨
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); // 위 두 줄을 합친게 이거임
				// 펑크난 이 타이어를 상속받은 타이어(한국타이어)로 바꿔 끼워줌
				// frontLeftTire가 한국타이어의 부모격 (부모 클래스 타입으로 되어있기 때문)
				break;
			case 2:
				System.out.println("오른쪽 앞 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				// 자동 타입 변환에 의해
				// 부모 클래스로 만들어진 애(frontRightTire)한테 자식 클래스 타입인 애(KumhoTire)를 넣어줌
				// frontRightTire는 부모의 메소드가 아닌 KumhoTire가 오버라이딩한 메소드를 사용.
				break;
			case 3:
				System.out.println("왼쪽 뒤 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("오른쪽 뒤 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("=============================");
			
		}
		
		
	}
}
