package com.yedam.java.ch0605;

public class Bank {
	// 은행 고객 정보를 관리하는 클래스 예제
		// 1) Main class
		//		생성자를 통해 고객의 정보를 저장, 출력
		
		// 2) Bank class
		//		해당 은행의 금리를 저장
		//		(현재 잔액 + (현재 잔액 * 금리)) (현재잔액+이자라는 말)
		//		출금할 때 필요한 class임

		// 3) Customer class
		//		고객의 정보를 저장 (이름, 은행명, 계좌, 잔액의 필드)
		//		getInfo() 메소드: 입력한 정보 출력
		// 		withDraw() 메소드: 출금할 때 정보를 출력
	
		// Bank에 만든 금리 계산식 메소드를 Customer 클래스의 withDraw()에 불러와 사용해야 함
	
	
	// 문제를 보고 어떻게 프로그램을 만들지에 대해 생각을 해 보고 문제를 풀자!! 코딩 먼저 하려고 하지마 ㅠ
	// 이 클래스를 만들어 어떤 메소드를 넣고.. 무슨 값을 적을거고.. 등등 로직을 직접 적어본 후 코딩으르 해보자
	
	
	// 내가 한 것
//	double interest = 0.03; // 이자율
//	double balance; // 현재 잔액
//	double totalBal; // 남은 잔액

	
	
	// 교수님 풀이
	// static을 사용해 다른 모든 곳에서 사용할 수 있게 금리를 정해줌
	// 변동 없는 금리라고 정해놓음. 그래서 final을 같이 사용
	public static final double INTEREST_RATIO = 0.03;
	
	
	
	// 이건 내가 쓴 건데 여기서 적는게 아니었음..ㅎ
//	void money() {
//		double totalBal = balance + (balance * interest);
//	
//	}
	
}
