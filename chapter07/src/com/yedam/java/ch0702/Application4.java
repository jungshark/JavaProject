package com.yedam.java.ch0702;

public class Application4 {
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		// 상속관계
		// c(자식) -> b(부모)
		// b(자식) -> a(부모)
		// c(손자) -> b(자식) -> a(부모) 상속 관계라고 볼 수 있음
		
		A a1 = b; // A클래스의 객체를 만드는데 자식 클래스로 만든 b를 넣어줌
		A a2 = c; // A클래스의 객체를 만드는데 손자 클래스로 만든 c를 넣어줌
		// 자동 타입 변환은 1:1만 되는게 아니라, 계층을 만들어도 자동 타입 변환이 가능함
		
		
	}
}
