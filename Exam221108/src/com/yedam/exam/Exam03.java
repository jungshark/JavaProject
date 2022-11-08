package com.yedam.exam;

public class Exam03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		// if~else if문 사용
		if(operator == '+') {
			System.out.printf("%d + %d = %d\n", num1, num2, (num1+num2));
			System.out.println(num1+num2); // 둘 중 아무거나 적으면 ㅇㅋ
		}else if(operator == '-') {
			System.out.printf("%d - %d = %d\n", num1, num2, (num1-num2));
		}else if(operator == '*') {
			System.out.printf("%d X %d = %d\n", num1, num2, (num1*num2));
		}else if(operator == '/') {
			System.out.printf("%d / %d = %d\n", num1, num2, (num1/num2));
		}

		
		// switch도 사용 가능!
		switch(operator) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1, num2, (num1+num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2, (num1-num2));
			break;
		case '*':
			System.out.printf("%d X %d = %d\n", num1, num2, (num1*num2));
			break;
		case '/':
			System.out.printf("%d / %d = %d\n", num1, num2, (num1/num2));
			break;
		}
	}
}
