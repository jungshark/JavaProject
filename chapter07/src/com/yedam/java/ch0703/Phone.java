package com.yedam.java.ch0703;

// abstract를 이용해 추상 클래스 만들기
public abstract class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원을 켬");
	}
	
	public void turnOff() {
		System.out.println("전원을 끔");
	}
	
}
