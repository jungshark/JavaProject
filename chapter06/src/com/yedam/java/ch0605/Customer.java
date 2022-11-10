package com.yedam.java.ch0605;

public class Customer {

	// 필드
	String name;
	String bank;
	int account; // 계좌
	int balance; // 잔액
	
	
	// 생성자
	public Customer(String name, String bank, int account, int balance) {
		this.name = name;
		this.bank = bank;
		this.account = account;
		this.balance = balance;
	}
	
	
	// 메소드
	void getInfo(){
		System.out.println("=== 입력받은 정보 ===");
		System.out.println("이름 : " + name);
		System.out.println("은행 : " + bank);
		System.out.println("계좌 : " + account);
		System.out.println("잔액 : " + balance);
	}
	
	void withDraw() {
		System.out.println("=== 출금 ===");
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 : " + balance);
		System.out.println("금리 : " + (Bank.INTEREST_RATIO * 100) + "%");
		System.out.println("예상 금액 : " + ((balance) + (balance * Bank.INTEREST_RATIO)) + "원 입니다.");
		// 			이자를 반영한 내 통장 잔액 = (현재 잔액 + (현재 잔액 * 금리))
	}
	
	
	
	
}
