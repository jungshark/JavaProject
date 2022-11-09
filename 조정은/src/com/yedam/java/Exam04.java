package com.yedam.java;

public class Exam04 {
	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 작성하시오.
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("--- " + i + "단 ---");
			
			for (int j = 1; j <= 9; j++) {
				if(j<=i) {
					System.out.println(i + " X " + j + " = " + (i * j));					
				}else {
					break;
				}
			}
		}
		
	}
}
