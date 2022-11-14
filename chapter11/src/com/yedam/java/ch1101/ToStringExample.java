package com.yedam.java.ch1101;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		// 객체 문자 정보(toString(), 책 p477)
		
		Object obj = new Object(); // Object 타입 객체 만들기
		
		System.out.println(obj.toString());
		
		// 날짜정보 가져오는 법
		Date obj2 = new Date(); // ctrl + shift + o 필요
		
		System.out.println(obj2.toString());
		
		
		// Member 클래스 참고
	}
}
