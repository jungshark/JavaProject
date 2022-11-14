package com.yedam.java.ch1101;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		
		// HashMap : Key, Value 형태로 데이터를 저장 (열쇠를 가지고 데이터를 가져오는 느낌)
		// Key : 숫자, 객체도 가능
		
		// HaspMap < Key(물건을 찾으러 갈 때 필요한 열쇠. 클래스 타입), String(value. 열쇠를 주면 이 데이터를 줌)
		HashMap < Key, String > hashmap = new HashMap<>(); // ctrl + shift + o 해줘야함
		
		// hashmap이라는 객체에.넣는다=보관한다(이 열쇠를 사용할거고, 열쇠 주면 이 데이터 받아올거임);
		//🍋 new Key(1)의 해시코드는 1
		hashmap.put(new Key(1), "홍길동");
		
		// value에는 찾은 물건이 들어감 = hashmap에서.가져온다=꺼낸다(이 열쇠로 물건 가져올게);
		//🍋 new Key(1)의 해시코드는 2
		String value = hashmap.get(new Key(1));
		// 같은 열쇠를 줬는데 왜 안 나옴..?
		// hashmap.put(new Key(1), "홍길동");의 new Key(1)와, 
		// String value = hashmap.get(new Key(1));의 new Key(1)가 다른 객체임!
		// 해시코드 1로 물건을 맡겼는데 2로 찾으려고 하니까 안 주지 ㅠ
		
		// new 연산자를 통해 만든거는 생긴거만 같고 내용이 다르다~ 서로 다른 주소를 가진 객체.
		
		// 그럼 어떻게 받아와..?
		// 해시코드를 재정의해서 받아와보자. 해시코드가 받는게 주소가 아니라 값으로 해보자
		// String은 같은 값을 받으면 같은 주소를 참조함!
	
		System.out.println(value);
		
		
		//✨ toString() 사용해보기
		// Key 클래스에 오버라이딩 해 둠
		Key key = new Key(1);
		
		System.out.println(key.toString());
		
		
	}
	
}
