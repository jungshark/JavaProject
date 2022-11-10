package com.yedam.java.ch0605;

public class Shoes {
	// static 사용해보기 (책 p273)
	
	// 필드
	static int totalCount;
	int running;
	int slipper;
	int mule;
	
	// 메소드
	void makeRunning() {
		running += 1; // 메소드 호출할때마다 러닝화 1개씩 계속 만드는것
	}
	void makeSlipper() {
		slipper += 1;
	}
	void makeMule() {
		mule += 1;
	}
	
	void getCount() { // 만든 신발들이 몇개인지 합을 계산해 totalCount 변수에 넣어주는 메소드. 얘는 필드의 totalCount와 연결됨.
		totalCount = running + slipper + mule;
	}
}
