package com.yedam.java.ch1101;

import java.util.HashMap;

public class MemberExample {

	public static void main(String[] args) {
		//✨ 객체동등비교 equals
		// 객체 동등 비교 조건 -> 값이 같다 or 다르다
		// 강제 타입 변환
		// Object -> 여러 클래스
		
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		
		// Member 클래스에서 equals를 재정의
		// new Member();에서 ()안에 든 내용이 같으면 동등, 같지 않으면 같지 않음이 출력될 것
		
		// Member 클래스의 equals를 불러서 obj2를 매개변수로 obj에 넣음.
		// 강제 타입 변환에 의해 Member타입으로 바뀜
		// if(id(obj1의 id).equals(member.id(obj2의 id)){}
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등");
		}else {
			System.out.println("obj1과 obj2는 같지 않음");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등");
		}else {
			System.out.println("obj1과 obj3은 같지 않음");
		}
		
		
		// 오버라이딩 해시코드 사용
		HashMap<Member, String>member = new HashMap<>(); // ctrl + shift + o 해줘야함
		
		// new Member("1") -> ("1" 의)주소가 10이고, 해시코드 1이라고 가정
		// 해시코드를 재정의할 때 "1"를 가지고 해시코드를 만듦
		member.put(new Member("1"), "홍길동");
		
		// new Member("1") -> ("1" 의)주소가 10이고, 해시코드 1
		String value = member.get(new Member("1"));
		
		System.out.println(value);
		
		
	}

}
