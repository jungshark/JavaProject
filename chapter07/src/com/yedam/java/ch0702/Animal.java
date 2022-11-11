package com.yedam.java.ch0702;

public class Animal {
	
	// Animal, Cat, Dog 셋 다 동물. 짖음
	// Animal 클래스 하나면 오버라이딩을 통해 다양한 종류의 짖는 동물들을 만들 수 있음
	// 이게 바로 다형성!
	void speak() {
		System.out.println("Animal 클래스의 Sound()");
	}

}
