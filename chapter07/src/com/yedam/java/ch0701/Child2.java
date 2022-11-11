package com.yedam.java.ch0701;

import com.yedam.java.chapter0701_2.*; // 다른 패키지에 있는 모든 내용을 가져와 쓰겠다~

public class Child2 extends Parent2 {
//public class Child2 extends Parent Child {
	// 한 자식이 부모를 여러명 가질 수는 없음!!!
	// 내가 어느 부모의 필드를 가져와 사용해야하는지 알 수가 없어지기 때문에 부모 여럿을 가지는건 불가능함!
	// public class Child2 extends Parent {} 는 가능.
	// 자식 클래스인 Child와 Child2는 같은 부모를 가질 수 있음.
	
	// 필드
	
	
	// 생성자
	
	
	// 메소드
	void getInfo() {
		System.out.println(firstName + lastName + bloodType + age);
		// default 접근 제한자를 가진 firstName과 age는 오류가 남.
		// default : 같은 패키지 내에서는 사용 가능. but 다른 패키지에서는 사용 못 함
		// Parents의 firstName 필드에 public을 사용했더니 사용 가능해짐! public은 어디에서든 사용 가능
		// protected로 된 건 부모로부터 상속받아서 사용 가능!
		
	}
	
}
