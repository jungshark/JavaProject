package com.yedam.java.ch0201;

public class VariableExample {
	public static void main(String[] args) {
		// 2022년 11월 03일
		/* 변수의
		  사용 범위 */
		
		int value1 = 15;
		if(value1 > 10) {
			int value2;
			value2 = value1 - 10;
		}
		
		// 변수는 {} 기준으로 존재함. {} 안에 만든 변수는 그 중괄호를 벗어나면 사라짐.
		int result = value1 + value2 + 5;
		
		System.out.println(value1 + "," + value2 + "," + result);
		
		/***/
		
		int v1 = 0;
		if(v1 == 0) {
			v1 = 1;
			int v2 = 0;
			if(v2 == 0) {
				v2 = 2;
				int v3 = v1 + v2;
				System.out.println(v1 + "+" + v2 + "=" + v3);
			}
			// 중괄호를 하나 벗어나니까 제일 안쪽 {} 안에 만든 v3가 사라짐(사용 불가)
			System.out.println(v1 + "+" + v2 + "=" + v3);
		}
		// v2가 선언된 중괄호도 벗어나버려 v2, v3가 모두 사용 불가능
		System.out.println(v1 + "+" + v2 + "=" + v3);
	}
}
