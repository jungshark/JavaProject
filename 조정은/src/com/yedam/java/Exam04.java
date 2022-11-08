package com.yedam.java;

public class Exam04 {
	public static void main(String[] args) {
		
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
