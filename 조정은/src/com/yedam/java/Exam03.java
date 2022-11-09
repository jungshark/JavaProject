package com.yedam.java;

public class Exam03 {

	public static void main(String[] args) {
		// 다음과 같이 코드가 작성되어 있을 때, 변수 operator값이 +, -< *, /인 경우에
		// 각 사칙 연산을 수행하는 프로그램을 if~else if문 혹은 switch문을 사용해 작성해 보세요.
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
			System.out.println("연산결과: " + result);
		}else if(operator == '-') {
			result = num1 - num2;
			System.out.println("연산결과: " + result);
		}else if(operator == '*') {
			result = num1 * num2;
			System.out.println("연산결과: " + result);
		}else if(operator == '/') {
			result = num1 / num2;
			System.out.println("연산결과: " + result);
		}
		
		

	}

}
