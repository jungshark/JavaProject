package com.yedam.java.ch0801;

public interface WashingMachine {
	
	// 이렇게 인터페이스 메소드를 정의해 놓으면 각각 다른 구현 클래스에서 메소드 이름은 똑같이, 내용은 다르게 설정할 수 있음
	public void startBtn();
	public void pauseBtn(); // 중지 버튼
	public void stopBtin();
	public int changeSpeed(int speed);
	
}
