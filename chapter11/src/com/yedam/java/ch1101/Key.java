package com.yedam.java.ch1101;

public class Key {

	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) { // Key를 참조한 애인지 확인
			Key compareKey = (Key) obj; // Key로 만들어진 애라면 강제타입변환
			if(this.number == compareKey.number) // if문은 한 줄만 있을 시 {} 생략해도 됨~
				return true;
		}
		return false;
	}

	
	// Source -> toString() 눌러서 사용
	@Override
	public String toString() {
//		System.out.println("");
		return "Key 값은: " + number; // 리턴 모양은 바꿀 수 있음!
	}
	
	
	
	
}
