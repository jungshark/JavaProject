package com.yedam.java.homework;

public class RPGgame implements Keypad{
	// Keypad를 구현하는 클래스
	
	// 필드
	public int nowMode;
	
	
	// 생성자
	public RPGgame() {
		this.nowMode = NORMAL_MODE;
		System.out.println("RPGgame 실행");
	}
	
	
	// 메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void RightUpButton() {
		if(nowMode == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다");
		}
		if(nowMode == HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다");
		}
	}

	@Override
	public void RightDownButton() {
		if(nowMode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		}
		if(nowMode == HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격");
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
