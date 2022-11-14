package com.yedam.java.ch0802;

public class ImplementationC implements InterfaceC{

	// InterfaceC가 상속받은 메소드 A, B
	@Override
	public void methodA() {
		System.out.println("methodA 실행");
	}

	@Override
	public void methodB() {
		System.out.println("methodB 실행");
	}

	// InterfaceC 본인의 메소드
	@Override
	public void methodC() {
		System.out.println("methodC 실행");
	}

}
