package com.yedam.java.ch0701;

import java.net.MulticastSocket;

public class Child extends Parent { // 상속 받아올 대상을 클래스 이름 뒤에 적어주면 됨
	
	// 필드
	public String lastName;
	public int age;
	
	// 생성자
	
	
	// 메소드
	// 부모인 Parent의 메소드를 내(Child) 입맛대로 바꿔보자 ㅋ
	// 자바한테 내가 부모 클래스에 있는거 오버라이딩 할게~ 하고 알려주는 것
	@Override
	// 접근제한자(public)를 제외하고 리턴 타입(void), 메소드 이름(method1), 매개변수()는 동일하게 가져가야 함!
	// {} 안의 내용을 입맛대로 바꿔주면 됨
	public void method1() {
		System.out.println("Child 클래스에서 재정의 된 method1 호출");
	}
	
	public void method3() {
		System.out.println("Child 클래스 method3 호출");
	}
	
}
