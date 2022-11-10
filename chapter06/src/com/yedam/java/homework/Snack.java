package com.yedam.java.homework;

public class Snack {
	
	private String name;
	private int price;
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void getInfo() {
		System.out.println("=== 입력한 상품 정보 ===");
		System.out.println("상품 이름 : " + name);
		System.out.println("상품 가격 : " + price);
	}
	
}
