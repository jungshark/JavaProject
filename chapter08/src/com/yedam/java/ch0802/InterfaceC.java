package com.yedam.java.ch0802;

public interface InterfaceC extends InterfaceA, InterfaceB{
	//✨ 인터페이스 상속 (책 p399)
	
	// InterfaceC가 A와 B를 상속받음
	// 근데 여기서 바로 재정의를 하는게 아니라 C를 받는 클래스가 A, B, C 모두 재정의 해 줘야 함
	
	public void methodC();
}
