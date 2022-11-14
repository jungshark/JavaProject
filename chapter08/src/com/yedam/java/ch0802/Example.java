package com.yedam.java.ch0802;

public class Example {

	public static void main(String[] args) {
		//✨ 인터페이스 상속 (책 p399)
		
		
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; // 메소드A 만 정의한 객체 ia
		ia.methodA(); // 실행하려고 ia. 해보면 methodA를 오버라이딩 한 것 밖에 없음
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA(); // ic. 해보면 A, B, C 다 쓸 수 있는걸 확인 가능
		ic.methodB(); // why? 인터페이스C가 인터페이스A, B를 상속받고 있기 때문!
		ic.methodC(); // (자식은 상속받는 부모의 메소드를 다 사용할 수 있음)
		
		// ch0801의 Television 처럼 써도 되고 -> public class Television implements RemoteControl, Search{}
		// 인터페이스 상속을 안다면 ch0802의 이 예제처럼 해도 됨!
		
	}

}
