package com.yedam.java.ch0801;

public class LGWashingMachine implements WashingMachine{

	@Override
	public void startBtn() {
		System.out.println("세탁기가 빨래를 시작");
	}

	@Override
	public void pauseBtn() {
		System.out.println("세탁기 일시 중지");
	}

	@Override
	public void stopBtin() {
		System.out.println("세탁기가 빨래를 끝냄");
	}

	@Override
	public int changeSpeed(int speed) {
		switch(speed) {
		case 1: // 1번 모드면
			return 20; // 속도를 20으로 반환
		case 2:
			return 50;
		case 3:
			return 100;
		}
		return 0; // 아무것도 아니라면 실행을 하지 않을 것(속도 0이니까 실행X)
	}

	
}
