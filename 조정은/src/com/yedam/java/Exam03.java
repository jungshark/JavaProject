package com.yedam.java;

public class Exam03 {

	public static void main(String[] args) {
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
