package com.yedam.java.ch0605;

public class ConstantNo {
	// static 응용(?)
	
	// 필드
	static double pi = 3.14; // 원주율
	static int earthRound = 46250; // 지구 둘레
	static int lightSpeed = 127000; // 빛의 속도
	
	//🍋 static에 final을 넣으면 -> 불변의 static이 됨..! 어디서든 불러와 쓸 수 있는 변하지 않는 데이터ㅎ
	// final이 들어가면 변수 이름 정의 방법이 바뀜. 무조건 대문자를 써야 함.
	// 합성어는 언더바를 사용해 구분
	// (final은 무조건 고정된 값이니까 "아 이거 쓸 때는 데이터 바꿀 필요 없겠네~" 이런 식으로 보자마자 구별할 수 있게 이렇게 쓰는듯..?)
//	static final double PI = 3.14; // 원주율
//	static final int EARTH_ROUND = 46250; // 지구 둘레
//	static final int LIGHT_SPEED = 127000; // 빛의 속도
	
	String words = "This is Java";
	char word = 'Y';
	
	// 생성자
	
	
	// 메소드
	// static 맴버의 사용 범위(scope) 책 p277
	
	//🍋 static 메소드
	// static 간의 필드 사용
	static void getCircle(int radius) {
		// pi * r * r (원주율 * 반지름 * 반지름)
		// 정의해놓은 pi값을 가져오고, 반지름은 계속 바뀌기 때문에 radius라고 변수 하나 설정함
		// 메소드도 static이고, pi도 static이라 같은 메모리 공간에 있으므로 pi를 호출할 수 있는 것
		System.out.println("원의 넓이: " + (pi*radius*radius));
	}
	
	//🍋 일반 메소드에 static 필드 호출
	// static 안에 그냥 메소드가 포함되어 있기 때문에 일반 메소드에서도 static필드 호출 가능 (집합이라 생각하면 됨. 집합 전체가 static 영역. static이 메소드를 포함하고 있는 더 큰 범위인 것)
	// static필드는 어디에서나 사용 가능하기 때문에 일반 메소드에서도 당연히 사용 가능!
	public void allData() {
		double result = pi + earthRound + lightSpeed;
		System.out.println(result);
		getCircle(1);
	}
	
	//🍋 static 메소드에 일반 필드, 메소드 사용
//	public static void words() {
//		String getWord = words + String.valueOf(word);
//		// 왜 오류가 날까
//		// static안에 있는 메소드와 필드는 본인보다 static이 더 크기 때문에 static을 불러와서 쓸 수 없음(더 큰 애니까 내가 모르는 내용들을 많이 가지고 있는데 모르는걸 어케 불러옴..)
//	}
	
}
