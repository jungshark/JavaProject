package com.yedam.java.homework;

public class ArcadeGame implements Keypad{
	// Keypad를 구현하는 클래스
	
	// 필드
	public int nowMode;
	
	
	// 생성자
	public ArcadeGame() {
		this.nowMode = NORMAL_MODE;
		System.out.println("ArcadeGame 실행");
	}
	
	
	// 메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}

	@Override
	public void RightUpButton() {
		if(nowMode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		}
		if(nowMode == HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void RightDownButton() {
		if(nowMode == NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격");
		}
		if(nowMode == HARD_MODE) {
			System.out.println("캐릭터가 Double HIT 공격");
		}
	}

	@Override
	public void changeMode() {
		String mode = null;
		if(nowMode == NORMAL_MODE) {
			nowMode = HARD_MODE;
			mode = "HARD_MODE";
		}else{
			nowMode = NORMAL_MODE;
			mode = "NORMAL_MODE";
		}
		System.out.println("현재 모드: " + mode);
	}

	
}
