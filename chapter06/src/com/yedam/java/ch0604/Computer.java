package com.yedam.java.ch0604;

public class Computer {
	// 다양한 값을 처리할 수 있게 만들어보자 (책 p252)
	
	// 여기서 매개변수는 외부에서 받아오는 크기로 결정되기 때문에 크기를 정확하게 안 정해놔도 됨. 타입만 주자.
	// 변수의 크기를 지정한다 -> 값을 주겠다는것과 같음. 선언만 해도 됨~
	int sum1(int[] values) { 
		int sum = 0;
		for(int i=0; i<values.length; i++) { // values를 배열로 보고 for문을 돌려
			sum += values[i]; // 값을 더해줌
		}
		return sum;
	}
	
	// 복수의 값을 받는 방법2) ... -> 배열처럼 받아줌. 엄밀히 말하면 배열은 아니지만 배열처럼 쓰면 됨
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) { 
			sum += values[i]; 
		}
		return sum;
	}
	
	// 뭐가 달라? 호출할 때 값을 넘겨주는 방식이 다름
	// [] -> 타입에 맞춰 배열 형태{}로 만들어서 호출해야함
	// ... -> 값()만 나열해서 넘겨주면 알아서 배열로 만들고 처리 해줌
	
}
