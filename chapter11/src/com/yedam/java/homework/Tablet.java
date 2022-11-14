package com.yedam.java.homework;

public interface Tablet {
	
	// 상수 필드
	public static final int TABLET_MODE = 2;
	
	
	// 메소드
	// 1) 영상 출력 기능
	public abstract void watchVideo();
	
	// 2) 앱을 사용하는 기능
	public abstract void useApp();
	
}
