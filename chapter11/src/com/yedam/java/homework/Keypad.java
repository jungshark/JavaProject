package com.yedam.java.homework;

public interface Keypad {
	
	// 상수 필드
	public static final int NORMAL_MODE = 0;
	public static final int HARD_MODE = 1;
	
	
	// 추상 메소드
	// 1) 왼쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void leftUpButton();
	
	// 2) 왼쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void leftDownButton();
	
	// 3) 오른쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void RightUpButton();
	
	// 4) 오른쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void RightDownButton();
	
	// 5) 모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
	public abstract void changeMode();
	
	
}
