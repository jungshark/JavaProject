package com.yedam.java.ch0605;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 받아오기 위해 scanner 사용
		String confirm; // 출금할 때 쓸 변수 지정
		
		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
		
		customer.getInfo();
		
		customer.withDraw();
		System.out.println("출금 하시겠습니까? Y/N");
		
		confirm = sc.nextLine();
		// 받은 문자열을 소문자로 바꾸기.y랑동일하다면 -> if문 출력, 아니면 else문 출력
		if(confirm.toLowerCase().equals("y")) { // 받은 문자열이 y라면 "출금 완료", 아니면 "시스템 종료"
			
			System.out.println("출금 완료");
			
		} else {
			System.out.println("시스템 종료");
		}

	}

}
