package com.yedam.java.ch0703;

// 추상 클래스 만들기
public abstract class Animal {

	public String kind; // 동물의 종류를 나타내는 필드
	
	public void breath() {
		System.out.println("숨을 쉽니다~");
	}
	
	// 메소드에 내용이 들어가지 않고 선언이 종료됨(=미완성 설계도).
	// 무조건 오버라이딩을 해 줘야 함
	// 추상 메소드를 사용하는 이유: 모두가 같은 용도로 사용하기 위해, 같은 메소드 이름으로 사용하기 위해 씀
	//✨✨✨✨✨✨✨✨ 아래꺼 잘 봐두기 ✨✨✨✨✨✨✨✨
	public abstract void sound();
	
}
